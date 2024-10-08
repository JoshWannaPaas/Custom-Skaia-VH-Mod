package com.jwp.skaia_vh.init;

import com.jwp.skaia_vh.api.registry.CustomVaultGearRegistry;
import com.jwp.skaia_vh.api.registry.record.CustomVaultGearEntry;
import com.jwp.skaia_vh.models.Daggers;
import com.jwp.skaia_vh.models.Staffs;

public class ModCustomVaultGearEntries {
    public static void registerGearEntries() {
        CustomVaultGearRegistry.addModel(new CustomVaultGearEntry(ModItems.DAGGER, "Dagger", Daggers.REGISTRY));
        CustomVaultGearRegistry.addModel(new CustomVaultGearEntry(ModItems.KNIFE, "Knife", Daggers.REGISTRY));
        CustomVaultGearRegistry.addModel(new CustomVaultGearEntry(ModItems.STAFF, "Staff", Staffs.REGISTRY));
    }
}
