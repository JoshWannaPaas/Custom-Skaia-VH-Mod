package com.jwp.skaia_vh.mixins;

import com.jwp.skaia_vh.api.registry.CustomVaultObjectiveRegistry;
import com.jwp.skaia_vh.api.registry.record.CustomVaultObjectiveEntry;
import iskallia.vault.core.data.adapter.basic.TypeSupplierAdapter;
import iskallia.vault.item.crystal.CrystalData;
import iskallia.vault.item.crystal.objective.CrystalObjective;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value = CrystalData.class, remap = false)
public class MixinCrystalData {
    @Shadow
    public static TypeSupplierAdapter<CrystalObjective> OBJECTIVE;

    static {
        for(CustomVaultObjectiveEntry entry : CustomVaultObjectiveRegistry.getCustomVaultObjectiveEntries()) {
            OBJECTIVE.register(entry.id(), entry.crystalObjective(), entry.crystalObjectiveSupplier());
        }
    }
}
