package com.jwp.skaia_vh.init;

import com.jwp.skaia_vh.api.registry.CustomVaultObjectiveRegistry;
import com.jwp.skaia_vh.api.registry.record.CustomVaultObjectiveEntry;
import com.jwp.skaia_vh.objectives.UnhingedScavengerCrystalObjective;
import com.jwp.skaia_vh.objectives.UnhingedScavengerObjective;

public class ModCustomVaultObjectiveEntries {
    public static void registerCustomObjectives() {
        CustomVaultObjectiveRegistry.addEntry(new CustomVaultObjectiveEntry("unhinged_scavenger", "Unhinged Scavenger Hunt", UnhingedScavengerCrystalObjective.class, UnhingedScavengerCrystalObjective::new, UnhingedScavengerObjective.E_KEY));
    }
}
