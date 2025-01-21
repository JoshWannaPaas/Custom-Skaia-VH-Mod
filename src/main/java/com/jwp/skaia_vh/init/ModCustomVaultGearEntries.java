package com.jwp.skaia_vh.init;

import net.minecraftforge.event.RegistryEvent;
import com.jwp.skaia_vh.config.fake.CustomVaultGearModelRollRaritiesConfig;
import com.jwp.skaia_vh.models.Daggers;
import com.jwp.skaia_vh.models.Staffs;
import xyz.iwolfking.vhapi.api.registry.gear.CustomVaultGearRegistryEntry;

public class ModCustomVaultGearEntries {

    public static final CustomVaultGearRegistryEntry DAGGER = new CustomVaultGearRegistryEntry("dagger", "Dagger", ModItems.DAGGER, Daggers.REGISTRY, CustomVaultGearModelRollRaritiesConfig.DAGGER_MODEL_ROLLS);
    public static final CustomVaultGearRegistryEntry KNIFE = new CustomVaultGearRegistryEntry("knife", "Knife", ModItems.KNIFE, Daggers.REGISTRY, CustomVaultGearModelRollRaritiesConfig.DAGGER_MODEL_ROLLS);
    public static final CustomVaultGearRegistryEntry STAFF = new CustomVaultGearRegistryEntry("staff", "Staff", ModItems.STAFF, Staffs.REGISTRY, CustomVaultGearModelRollRaritiesConfig.STAFF_MODEL_ROLLS);


    public static void registerGearEntries(RegistryEvent.Register<CustomVaultGearRegistryEntry> event) {
        event.getRegistry().register(DAGGER);
        event.getRegistry().register(KNIFE);
        event.getRegistry().register(STAFF);
    }


}
