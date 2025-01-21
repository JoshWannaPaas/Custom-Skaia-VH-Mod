package com.jwp.skaia_vh.mixins;

import com.radimous.vhatcaniroll.logic.Items;
import iskallia.vault.init.ModItems;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import java.util.List;

@Mixin(value = Items.class, remap = false)
public class MixinVhatItems {
    /**
     * @author Josh
     * @reason Skaia Gear
     */
    @Overwrite
    public static List<ItemStack> getVHGearItems() {
        return List.of(
                new ItemStack(ModItems.SWORD),
                new ItemStack(ModItems.AXE),
                new ItemStack(ModItems.HELMET),
                new ItemStack(ModItems.CHESTPLATE),
                new ItemStack(ModItems.LEGGINGS),
                new ItemStack(ModItems.BOOTS),
                new ItemStack(ModItems.FOCUS),
                new ItemStack(ModItems.SHIELD),
                new ItemStack(ModItems.WAND),
                new ItemStack(ModItems.MAGNET),
                new ItemStack(ModItems.JEWEL),

                new ItemStack(com.jwp.skaia_vh.init.ModItems.DAGGER),
                new ItemStack(com.jwp.skaia_vh.init.ModItems.KNIFE),
                new ItemStack(com.jwp.skaia_vh.init.ModItems.STAFF)
        );
    }

}
