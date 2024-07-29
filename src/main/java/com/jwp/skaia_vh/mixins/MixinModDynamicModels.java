package com.jwp.skaia_vh.mixins;

import com.jwp.skaia_vh.init.ModItems;
import com.jwp.skaia_vh.models.Daggers;
import iskallia.vault.dynamodel.registry.DynamicModelRegistries;
import iskallia.vault.init.ModDynamicModels;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = ModDynamicModels.class, remap = false)
public class MixinModDynamicModels {
    @Shadow @Final public static DynamicModelRegistries REGISTRIES;

    @Inject(method = "initItemAssociations", at = @At("RETURN"))
    private static void initItemAssociations(CallbackInfo ci) {
        REGISTRIES.associate( (Item) ModItems.DAGGER, Daggers.REGISTRY);
    }
}
