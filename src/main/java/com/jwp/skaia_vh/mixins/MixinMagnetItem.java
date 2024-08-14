package com.jwp.skaia_vh.mixins;

import com.jwp.skaia_vh.models.Magnets;
import iskallia.vault.dynamodel.DynamicModel;
import iskallia.vault.gear.data.VaultGearData;
import iskallia.vault.init.ModConfigs;
import iskallia.vault.item.MagnetItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Unique;

import java.util.Optional;
import java.util.Random;

@Mixin(value = MagnetItem.class, remap = false)
public class MixinMagnetItem {

    /**
     * @author Josh
     * @reason Magnet Transmogs
     */
    @Overwrite
    public ResourceLocation getRandomModel(ItemStack stack, Random random) {
        VaultGearData gearData = VaultGearData.read(stack);
        EquipmentSlot intendedSlot = EquipmentSlot.MAINHAND;
        return ModConfigs.GEAR_MODEL_ROLL_RARITIES.getRandomRoll(stack, gearData, intendedSlot, random);
    }

    @Unique
    public Optional<? extends DynamicModel<?>> resolveDynamicModel(ItemStack stack, ResourceLocation key) {
        return (Optional<? extends DynamicModel<?>>) Magnets.REGISTRY.get(key);
    }
}
