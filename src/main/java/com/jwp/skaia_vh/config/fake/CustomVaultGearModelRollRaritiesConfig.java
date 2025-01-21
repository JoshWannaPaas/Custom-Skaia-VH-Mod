package com.jwp.skaia_vh.config.fake;

import com.jwp.skaia_vh.models.Daggers;
import com.jwp.skaia_vh.models.Staffs;
import iskallia.vault.gear.VaultGearRarity;
import net.minecraft.resources.ResourceLocation;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomVaultGearModelRollRaritiesConfig {
    public static final Map<String, List<String>> DAGGER_MODEL_ROLLS = new HashMap<>();
    public static final Map<String, List<String>> STAFF_MODEL_ROLLS = new HashMap<>();

    static {
        DAGGER_MODEL_ROLLS.put(VaultGearRarity.SCRAPPY.name(), Daggers.REGISTRY.getIds().stream().map(ResourceLocation::toString).collect(Collectors.toList()));
        STAFF_MODEL_ROLLS.put(VaultGearRarity.SCRAPPY.name(), Staffs.REGISTRY.getIds().stream().map(ResourceLocation::toString).collect(Collectors.toList()));
    }

}
