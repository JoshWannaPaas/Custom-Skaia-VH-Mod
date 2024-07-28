package com.jwp.skaia_vh.init;

import com.jwp.skaia_vh.api.registry.CustomVaultGearRegistry;
import com.jwp.skaia_vh.api.registry.record.CustomVaultGearEntry;
import com.jwp.skaia_vh.models.Daggers;

public class ModCustomVaultGearEntries {
    public static void registerGearEntries() {
        CustomVaultGearRegistry.addModel(new CustomVaultGearEntry(ModItems.DAGGER, "Dagger", Daggers.REGISTRY));
    }
}
