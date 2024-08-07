package com.jwp.skaia_vh.api.registry;

import com.jwp.skaia_vh.api.registry.record.CustomVaultObjectiveEntry;
import com.jwp.skaia_vh.init.ModConfigs;
import com.jwp.skaia_vh.init.ModCustomVaultObjectiveEntries;

import java.util.ArrayList;
import java.util.List;

public class CustomVaultObjectiveRegistry {

    private static final List<CustomVaultObjectiveEntry> CUSTOM_VAULT_OBJECTIVE_ENTRIES = new ArrayList<>();

    public static void addEntry(CustomVaultObjectiveEntry entry) {
        CUSTOM_VAULT_OBJECTIVE_ENTRIES.add(entry);
    }

    public static int getSize() {
        return CUSTOM_VAULT_OBJECTIVE_ENTRIES.size();
    }

    public static void registerAllCustomVaultObjectives() {
        ModCustomVaultObjectiveEntries.registerCustomObjectives();
    }


    public static List<CustomVaultObjectiveEntry> getCustomVaultObjectiveEntries() {
        return CUSTOM_VAULT_OBJECTIVE_ENTRIES;
    }

    public static boolean contains(String id) {
        for(CustomVaultObjectiveEntry entry : getCustomVaultObjectiveEntries()) {
            if(id.equals(entry.id())) {
                return true;
            }
        }
        return false;
    }
}