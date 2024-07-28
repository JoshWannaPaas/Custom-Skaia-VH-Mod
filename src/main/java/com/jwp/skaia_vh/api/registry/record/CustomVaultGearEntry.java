package com.jwp.skaia_vh.api.registry.record;

import iskallia.vault.dynamodel.registry.DynamicModelRegistry;
import net.minecraft.world.item.Item;

public record CustomVaultGearEntry(Item registryItem, String name, DynamicModelRegistry<?> dynamicModelRegistry) {
}
