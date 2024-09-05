package com.jwp.skaia_vh.api.discoverylogic.goal;

import com.jwp.skaia_vh.models.Swords;
import iskallia.vault.VaultMod;
import iskallia.vault.discoverylogic.goal.VaultMobKillGoal;
import iskallia.vault.discoverylogic.goal.base.DiscoveryGoal;
import iskallia.vault.init.ModDynamicModels;
import iskallia.vault.init.ModEffects;
import iskallia.vault.init.ModItems;
import iskallia.vault.init.ModModelDiscoveryGoals;
import iskallia.vault.world.data.DiscoveredModelsData;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Mob;


public class SkaiaModelDiscoveryGoals {

    public static void init() {
        CHILLED_MOBS_KILLED = (VaultMobKillGoal)registerGoal(VaultMod.id("chilled_mobs_killed"), (VaultMobKillGoal)(new VaultMobKillGoal(300)).withPredicate((e) -> {
            return e.getEntityLiving() instanceof Mob;
        }).withPredicate((e) -> {
            return e.getEntityLiving().hasEffect(ModEffects.CHILLED);
        }).setReward((player, goal) -> {
            DiscoveredModelsData discoversData = DiscoveredModelsData.get(player.getLevel());
            ResourceLocation modelId = ModDynamicModels.Swords.SOUL_SWORD_BLUE.getId();
            if (!discoversData.getDiscoveredModels(player.getUUID()).contains(modelId)) {
                MutableComponent info = (new TextComponent("You have killed " + (int)goal.getTargetProgress() + " chilled mobs this Vault!")).withStyle(ChatFormatting.GREEN);
                player.sendMessage(info, Util.NIL_UUID);
                discoversData.discoverModelAndBroadcast(ModItems.SWORD, modelId, player);
            }
        }));

        POISON_NOVA_MOBS_KILLED = (VaultMobKillGoal)registerGoal(VaultMod.id("poison_nova_mobs_killed"), (VaultMobKillGoal)(new VaultMobKillGoal(600)).withPredicate((e) -> {
            return e.getEntityLiving() instanceof Mob;
        }).withPredicate((e) -> {
            return e.getEntityLiving().hasEffect(ModEffects.NOVA_DOT);
        }).setReward((player, goal) -> {
            DiscoveredModelsData discoversData = DiscoveredModelsData.get(player.getLevel());
            ResourceLocation modelId = ModDynamicModels.Swords.SOUL_SWORD_GREEN.getId();
            if (!discoversData.getDiscoveredModels(player.getUUID()).contains(modelId)) {
                MutableComponent info = (new TextComponent("You have killed " + (int)goal.getTargetProgress() + " mobs with Poison Nova this Vault!")).withStyle(ChatFormatting.GREEN);
                player.sendMessage(info, Util.NIL_UUID);
                discoversData.discoverModelAndBroadcast(ModItems.SWORD, modelId, player);
            }
        }));

        FIRE_MOBS_KILLED = (VaultMobKillGoal)registerGoal(VaultMod.id("fire_mobs_killed"), (VaultMobKillGoal)(new VaultMobKillGoal(50)).withPredicate((e) -> {
            return e.getEntityLiving() instanceof Mob;
        }).withPredicate((e) -> {
            return e.getEntityLiving().isOnFire();
        }).setReward((player, goal) -> {
            DiscoveredModelsData discoversData = DiscoveredModelsData.get(player.getLevel());
            ResourceLocation modelId = Swords.LEGACY_OF_FLAMESCION.getId();
            if (!discoversData.getDiscoveredModels(player.getUUID()).contains(modelId)) {
                MutableComponent info = (new TextComponent("You have killed " + (int)goal.getTargetProgress() + " mobs on fire this Vault!")).withStyle(ChatFormatting.GREEN);
                player.sendMessage(info, Util.NIL_UUID);
                discoversData.discoverModelAndBroadcast(ModItems.SWORD, modelId, player);
            }
        }));

        VOID_LIQUID_DEATH = registerGoal(
                VaultMod.id("void_liquid_death"),
                new VaultVoidGoal(1200)
                        .setReward((player, goal) -> {
                            DiscoveredModelsData discoversData = DiscoveredModelsData.get(player.getLevel());
                            ResourceLocation modelId = Swords.SPEAR_OF_THE_VOID.getId();
                            if (!discoversData.getDiscoveredModels(player.getUUID()).contains(modelId)) {
                                MutableComponent info = (new TextComponent("You have embraced the void...")).withStyle(ChatFormatting.GREEN);
                                player.sendMessage(info, Util.NIL_UUID);
                                discoversData.discoverModelAndBroadcast(ModItems.SWORD, modelId, player);
                            }
                        })
        );
    }

    private static <G extends DiscoveryGoal<G>> G registerGoal(ResourceLocation id, G goal)
    {
        goal.setId(id);
        ModModelDiscoveryGoals.REGISTRY.put(id, goal);
        return goal;
    }

    public static VaultMobKillGoal CHILLED_MOBS_KILLED;
    public static VaultMobKillGoal POISON_NOVA_MOBS_KILLED;
    public static VaultMobKillGoal FIRE_MOBS_KILLED;
    public static VaultVoidGoal VOID_LIQUID_DEATH;

}
