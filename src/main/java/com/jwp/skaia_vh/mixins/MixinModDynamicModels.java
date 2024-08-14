package com.jwp.skaia_vh.mixins;

import com.jwp.skaia_vh.init.ModItems;
import com.jwp.skaia_vh.models.Daggers;
import com.jwp.skaia_vh.models.Magnets;
import iskallia.vault.dynamodel.registry.DynamicModelRegistries;
import iskallia.vault.init.ModDynamicModels;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value = ModDynamicModels.class, remap = false)
public class MixinModDynamicModels {
    @Shadow @Final public static DynamicModelRegistries REGISTRIES;

    /**
     * @author Josh
     * @reason Magnet
     */
    @Overwrite
    public static void initItemAssociations() {
        REGISTRIES.associate( (Item) ModItems.DAGGER, Daggers.REGISTRY);
        REGISTRIES.associate( (Item) ModItems.KNIFE, Daggers.REGISTRY);
        REGISTRIES.associate( (Item) iskallia.vault.init.ModItems.MAGNET, Magnets.REGISTRY);

        REGISTRIES.associate(iskallia.vault.init.ModItems.HELMET, ModDynamicModels.Armor.PIECE_REGISTRY.getPiecesOf(EquipmentSlot.HEAD)).associate(iskallia.vault.init.ModItems.CHESTPLATE, ModDynamicModels.Armor.PIECE_REGISTRY.getPiecesOf(EquipmentSlot.CHEST)).associate(iskallia.vault.init.ModItems.LEGGINGS, ModDynamicModels.Armor.PIECE_REGISTRY.getPiecesOf(EquipmentSlot.LEGS)).associate(iskallia.vault.init.ModItems.BOOTS, ModDynamicModels.Armor.PIECE_REGISTRY.getPiecesOf(EquipmentSlot.FEET)).associate(iskallia.vault.init.ModItems.SWORD, ModDynamicModels.Swords.REGISTRY).associate(iskallia.vault.init.ModItems.AXE, ModDynamicModels.Axes.REGISTRY).associate(iskallia.vault.init.ModItems.IDOL_TIMEKEEPER, ModDynamicModels.Idols.REGISTRY_WENDARR).associate(iskallia.vault.init.ModItems.IDOL_MALEVOLENCE, ModDynamicModels.Idols.REGISTRY_IDONA).associate(iskallia.vault.init.ModItems.IDOL_BENEVOLENT, ModDynamicModels.Idols.REGISTRY_VELARA).associate(iskallia.vault.init.ModItems.IDOL_OMNISCIENT, ModDynamicModels.Idols.REGISTRY_TENOS).associate(iskallia.vault.init.ModItems.SHIELD, ModDynamicModels.Shields.REGISTRY).associate(iskallia.vault.init.ModItems.RELIC, ModDynamicModels.Relics.RELIC_REGISTRY).associate(iskallia.vault.init.ModItems.RELIC_FRAGMENT, ModDynamicModels.Relics.FRAGMENT_REGISTRY).associate(iskallia.vault.init.ModItems.WAND, ModDynamicModels.Wands.REGISTRY).associate(iskallia.vault.init.ModItems.FOCUS, ModDynamicModels.Focus.REGISTRY).associate(iskallia.vault.init.ModItems.ANTIQUE, ModDynamicModels.Antiques.REGISTRY);
    }
}
