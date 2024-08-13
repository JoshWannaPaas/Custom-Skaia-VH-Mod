package com.jwp.skaia_vh.mixins;

import com.google.gson.annotations.Expose;
import com.jwp.skaia_vh.items.gear.VaultDaggerItem;
import com.jwp.skaia_vh.items.gear.VaultKnifeItem;
import com.jwp.skaia_vh.models.Daggers;
import com.jwp.skaia_vh.models.Magnets;
import iskallia.vault.config.Config;
import iskallia.vault.config.GearModelRollRaritiesConfig;
import iskallia.vault.gear.VaultGearRarity;
import iskallia.vault.init.ModDynamicModels;
import iskallia.vault.item.MagnetItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Mixin(value = GearModelRollRaritiesConfig.class, remap = false)
public abstract class MixinGearModelRollRaritiesConfig extends Config {

    @Expose
    Map<String, List<String>> DAGGER_MODEL_ROLLS;

    @Expose
    Map<String, List<String>> MAGNET_MODEL_ROLLS;


    @Inject(method = "reset", at = @At("HEAD"))
    private void resetHook(CallbackInfo ci) {
        this.DAGGER_MODEL_ROLLS = new HashMap<>();
        this.DAGGER_MODEL_ROLLS.put(VaultGearRarity.SCRAPPY.name(), Daggers.REGISTRY.getIds().stream().map(ResourceLocation::toString).collect(Collectors.toList()));

        this.MAGNET_MODEL_ROLLS = new HashMap<>();
        this.MAGNET_MODEL_ROLLS.put(VaultGearRarity.SCRAPPY.name(), Magnets.REGISTRY.getIds().stream().map(ResourceLocation::toString).collect(Collectors.toList()));
    }

    @Inject(method = "getRolls", at = @At("HEAD"), cancellable = true)
    public void getRollsHook(ItemStack stack, CallbackInfoReturnable<Map<String, List<String>>> cir) {
        if (stack.getItem() instanceof VaultDaggerItem)
            cir.setReturnValue(this.DAGGER_MODEL_ROLLS);
        if (stack.getItem() instanceof VaultKnifeItem)
            cir.setReturnValue(this.DAGGER_MODEL_ROLLS);
        if (stack.getItem() instanceof MagnetItem)
            cir.setReturnValue(this.MAGNET_MODEL_ROLLS);
    }
}
