package com.jwp.skaia_vh.mixins;

import com.jwp.skaia_vh.api.registry.CustomVaultObjectiveRegistry;
import com.jwp.skaia_vh.api.registry.record.CustomVaultObjectiveEntry;
import iskallia.vault.core.data.key.registry.SupplierRegistry;
import iskallia.vault.core.vault.VaultRegistry;
import iskallia.vault.core.vault.objective.Objective;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value = VaultRegistry.class, remap = false)
public class MixinVaultRegistry {
    @Shadow @Final
    public static SupplierRegistry<Objective> OBJECTIVE;

    static {
        for(CustomVaultObjectiveEntry entry : CustomVaultObjectiveRegistry.getCustomVaultObjectiveEntries()) {
            OBJECTIVE.add(entry.key());
        }
    }
}
