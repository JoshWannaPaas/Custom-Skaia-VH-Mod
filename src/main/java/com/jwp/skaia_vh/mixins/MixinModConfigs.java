package com.jwp.skaia_vh.mixins;

import iskallia.vault.init.ModConfigs;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


@Mixin(ModConfigs.class)
public class MixinModConfigs {

    @Inject(method = "register", at = @At("TAIL"), remap = false)
    private static void onReloadConfigs(CallbackInfo ci) {
        com.jwp.skaia_vh.init.ModConfigs.register();
    }
}
