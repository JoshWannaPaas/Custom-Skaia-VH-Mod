package com.jwp.skaia_vh.easteregg;

import com.jwp.skaia_vh.models.Axes;
import com.jwp.skaia_vh.models.Swords;
import iskallia.vault.init.ModDynamicModels;
import iskallia.vault.init.ModItems;
import iskallia.vault.world.data.DiscoveredModelsData;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import static iskallia.vault.util.InventoryUtil.findAllItems;

@Mod.EventBusSubscriber
public class ModdedWeapons {
    public ModdedWeapons() {}

    @SubscribeEvent
    public static void onCraft(PlayerEvent.ItemCraftedEvent event) {
        Player player = event.getPlayer();
        Inventory inventory = player.getInventory();
        if (player instanceof ServerPlayer serverPlayer) {
            ItemStack result = event.getCrafting();
            Container ingredients = event.getInventory();
            ResourceLocation resultId = ForgeRegistries.ITEMS.getKey(result.getItem());
            if (resultId != null) {

                // Manasteel Sword
                if (resultId.toString().equals("botania:manasteel_sword")) {
                    DiscoveredModelsData discoveredModelsData = DiscoveredModelsData.get(serverPlayer.getLevel());
                    MutableComponent info = (new TextComponent("The mana absorbs into your body")).withStyle(ChatFormatting.GREEN);
                    player.sendMessage(info, Util.NIL_UUID);
                    discoveredModelsData.discoverModelAndBroadcast(ModItems.SWORD, Swords.MANASTEEL_SWORD.getId(), player);
                }

                // Elementium Sword
                if (resultId.toString().equals("botania:elementium_sword")) {
                    DiscoveredModelsData discoveredModelsData = DiscoveredModelsData.get(serverPlayer.getLevel());
                    MutableComponent info = (new TextComponent("The mana absorbs into your body")).withStyle(ChatFormatting.GREEN);
                    player.sendMessage(info, Util.NIL_UUID);
                    discoveredModelsData.discoverModelAndBroadcast(ModItems.SWORD, Swords.ELEMENTIUM_SWORD.getId(), player);
                }

                // Terrasteel Sword
                if (resultId.toString().equals("botania:terra_sword")) {
                    DiscoveredModelsData discoveredModelsData = DiscoveredModelsData.get(serverPlayer.getLevel());
                    MutableComponent info = (new TextComponent("The mana absorbs into your body")).withStyle(ChatFormatting.GREEN);
                    player.sendMessage(info, Util.NIL_UUID);
                    discoveredModelsData.discoverModelAndBroadcast(ModItems.SWORD, Swords.TERRASTEEL_SWORD.getId(), player);
                }

                // Terrasteel Axe
                if (resultId.toString().equals("botania:terra_axe")) {
                    DiscoveredModelsData discoveredModelsData = DiscoveredModelsData.get(serverPlayer.getLevel());
                    MutableComponent info = (new TextComponent("The mana absorbs into your body")).withStyle(ChatFormatting.GREEN);
                    player.sendMessage(info, Util.NIL_UUID);
                    discoveredModelsData.discoverModelAndBroadcast(ModItems.AXE, Axes.TERRASTEEL_AXE.getId(), player);
                }









            }
        }
    }

//    @SubscribeEvent
//    public static void onPickup(PlayerEvent.ItemPickupEvent event) {
//        Player player = event.getPlayer();
//        if (player instanceof ServerPlayer serverPlayer) {
//            ItemStack result = event.getStack();
//            Inventory inventory = player.getInventory();
//            ResourceLocation resultId = ForgeRegistries.ITEMS.getKey(result.getItem());
//            if (resultId != null){
//                if (resultId.toString().equals("botania:manasteel_sword")) {
//
//                    //Remove Items
//                    List<InventoryUtil.ItemAccess> itemAccess = findAllItems(player);
//                    Iterator var2 = itemAccess.iterator();
//
//                    while(true) {
//                        InventoryUtil.ItemAccess items;
//                        ItemStack stack;
//                        do {
//                            if (!var2.hasNext()) {
//                                return;
//                            }
//
//                            items = (InventoryUtil.ItemAccess)var2.next();
//                            stack = items.getStack();
//                        } while(!(stack.getItem() instanceof ItemManasteelSword));
//
//                        items.getStack().shrink(1);
//                        stack.shrink(1);
//                        break;
//                    }
//
//
//                    // Give Transmog
//                    MutableComponent info = (new TextComponent("The mana absorbs into your body")).withStyle(ChatFormatting.GREEN);
//                    player.sendMessage(info, Util.NIL_UUID);
//                    DiscoveredModelsData discoversData = DiscoveredModelsData.get(serverPlayer.getLevel());
//                    ResourceLocation modelId = Axes.SKALLIANCHOR.getId();
//                    if (!discoversData.getDiscoveredModels(player.getUUID()).contains(modelId)) {
//                        discoversData.discoverModelAndBroadcast(ModItems.AXE, modelId, player);
//                    }
//                }
//            }
//        }
//    }
}
