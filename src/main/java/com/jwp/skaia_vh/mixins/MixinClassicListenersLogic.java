package com.jwp.skaia_vh.mixins;

import com.jwp.skaia_vh.api.registry.CustomVaultObjectiveRegistry;
import com.jwp.skaia_vh.api.registry.record.CustomVaultObjectiveEntry;
import iskallia.vault.core.vault.player.ClassicListenersLogic;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = ClassicListenersLogic.class, remap = false)
public class MixinClassicListenersLogic {
    @Inject(method = "getVaultObjective", at = @At("HEAD"), cancellable = true)
    private void addCustomObjectiveNames(String key, CallbackInfoReturnable<String> cir) {
        for(CustomVaultObjectiveEntry entry : CustomVaultObjectiveRegistry.getCustomVaultObjectiveEntries()) {
            if(entry.id().equals(key)) {
                cir.setReturnValue(entry.name());
            }
        }
    }
}
