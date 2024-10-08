package com.jwp.skaia_vh.mixins;

import iskallia.vault.client.util.color.ColorUtil;
import iskallia.vault.config.gear.VaultGearTypeConfig;
import iskallia.vault.gear.VaultGearHelper;
import iskallia.vault.gear.VaultGearState;
import iskallia.vault.gear.data.GearDataCache;
import iskallia.vault.init.ModConfigs;
import iskallia.vault.init.ModItems;
import iskallia.vault.init.ModModels;
import iskallia.vault.item.AugmentItem;
import iskallia.vault.item.bottle.BottleItem;
import iskallia.vault.item.tool.JewelItem;
import net.minecraft.client.color.item.ItemColors;
import net.minecraft.world.level.ItemLike;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import com.jwp.skaia_vh.api.registry.CustomVaultGearRegistry;

import java.util.Objects;
import java.util.Optional;

@Mixin(value = ModModels.class, remap = false)
public class MixinModModels {

    /**
     * @author JoshWannaPaas
     * @reason Add Daggers to color registry
     */
    @Overwrite
    public static void registerItemColors(ItemColors colors) {
        colors.register((stack, tintLayer) -> {
            if (tintLayer > 0) {
                GearDataCache clientCache = GearDataCache.of(stack);
                if (clientCache.getState() == VaultGearState.UNIDENTIFIED) {
                    Optional<String> var10000 = Optional.ofNullable(clientCache.getGearRollType());
                    VaultGearTypeConfig var10001 = ModConfigs.VAULT_GEAR_TYPE_CONFIG;
                    Objects.requireNonNull(var10001);
                    VaultGearTypeConfig.RollType type = (VaultGearTypeConfig.RollType)var10000.flatMap(var10001::getRollPool).orElse((VaultGearTypeConfig.RollType) null);
                    if (type != null) {
                        return ColorUtil.blendColors(type.getColor(), -1, 0.8F);
                    }
                }

                return -1;
            } else {
                return VaultGearHelper.getGearColor(stack);
            }
        }, CustomVaultGearRegistry.getItemLikes());
        colors.register((stack, tintIndex) -> {
            return tintIndex == 0 ? JewelItem.getColor(stack) : -1;
        }, new ItemLike[]{ModItems.JEWEL});
        colors.register((stack, tintIndex) -> {
            return tintIndex == 1 ? AugmentItem.getColor(stack) : -1;
        }, new ItemLike[]{ModItems.AUGMENT});
        colors.register((stack, tintIndex) -> {
            if (tintIndex == 1) {
                return BottleItem.getColor(stack);
            } else {
                return tintIndex == 2 ? BottleItem.getEffectColor(stack) : -1;
            }
        }, new ItemLike[]{ModItems.BOTTLE});
    }
}



