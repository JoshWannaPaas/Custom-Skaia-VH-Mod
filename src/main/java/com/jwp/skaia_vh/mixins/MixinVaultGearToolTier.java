package com.jwp.skaia_vh.mixins;

import com.jwp.skaia_vh.init.ModItems;
import iskallia.vault.config.gear.VaultGearTierConfig;
import net.minecraft.resources.ResourceLocation;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;

@Mixin(value = VaultGearTierConfig.class, remap = false)
public class MixinVaultGearToolTier {
    @Shadow @Final public static ResourceLocation UNIQUE_ITEM;

    @Inject(method = "registerConfigs", at = @At("TAIL"), cancellable = true)
    private static void registerCustomGearConfigs(CallbackInfoReturnable<Map<ResourceLocation, VaultGearTierConfig>> cir) {
        Map<ResourceLocation, VaultGearTierConfig> gearTierConfigMap = cir.getReturnValue();
        gearTierConfigMap.put(ModItems.DAGGER.getRegistryName(), (new VaultGearTierConfig(ModItems.DAGGER.getRegistryName()).readConfig()));
        gearTierConfigMap.put(ModItems.KNIFE.getRegistryName(), (new VaultGearTierConfig(ModItems.KNIFE.getRegistryName()).readConfig()));
        gearTierConfigMap.put(ModItems.STAFF.getRegistryName(), (new VaultGearTierConfig(ModItems.STAFF.getRegistryName()).readConfig()));

        cir.setReturnValue(gearTierConfigMap);
    }
}
