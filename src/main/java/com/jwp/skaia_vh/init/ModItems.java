package com.jwp.skaia_vh.init;

import com.jwp.skaia_vh.SkaiaVH;
import com.jwp.skaia_vh.items.gear.VaultDaggerItem;
import com.jwp.skaia_vh.items.gear.VaultKnifeItem;
import iskallia.vault.VaultMod;
import iskallia.vault.item.gear.VaultSwordItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

import java.util.Properties;

import static iskallia.vault.init.ModItems.GEAR_GROUP;

@Mod.EventBusSubscriber(modid = SkaiaVH.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SkaiaVH.MOD_ID);

    public static final RegistryObject<Item> SKYROOT_STICK = ITEMS.register("skyroot_stick", () -> new Item(new Item.Properties().tab(SkaiaCreativeTab.instance)));


    // Items with "the_vault" id's
    public static VaultDaggerItem DAGGER = new VaultDaggerItem(VaultMod.id("dagger"), new Item.Properties().tab(GEAR_GROUP).stacksTo(1));
    public static VaultKnifeItem KNIFE = new VaultKnifeItem(VaultMod.id("knife"), new Item.Properties().tab(GEAR_GROUP).stacksTo(1));


    public static void registerVaultItems(RegistryEvent.Register<Item> event ) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(DAGGER);
        registry.register(KNIFE);
    }

    //Creative Tab
    public static class SkaiaCreativeTab extends CreativeModeTab {
        private SkaiaCreativeTab(int index, String label) { super (index, label); }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(SKYROOT_STICK.get());
        }

        public static final SkaiaCreativeTab instance = new SkaiaCreativeTab(CreativeModeTab.TABS.length, "skaia");
    }
}
