package com.jwp.skaia_vh.mixins;

import com.jwp.skaia_vh.init.ModItems;
import iskallia.vault.item.modification.ReforgeTagModificationFocus;
import net.minecraft.world.item.Item;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import java.util.Map;

@Mixin(value = ReforgeTagModificationFocus.class, remap = false)
public class MixinReforgeTagModificationFocus {
    @Shadow @Final private static Map<Item, String> ITEM_TO_NAME;

    static {
        ITEM_TO_NAME.put(ModItems.DAGGER, "Dagger");
        ITEM_TO_NAME.put(ModItems.KNIFE, "Knife");
        ITEM_TO_NAME.put(ModItems.STAFF, "Staff");
    }
}
