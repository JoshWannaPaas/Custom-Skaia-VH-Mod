//package com.jwp.skaia_vh.mixins;
//
//import com.jwp.skaia_vh.models.Swords;
//import iskallia.vault.VaultMod;
//import iskallia.vault.discoverylogic.goal.VaultMobKillGoal;
//import iskallia.vault.discoverylogic.goal.base.DiscoveryGoal;
//import iskallia.vault.init.ModDynamicModels;
//import iskallia.vault.init.ModEffects;
//import iskallia.vault.init.ModItems;
//import iskallia.vault.init.ModModelDiscoveryGoals;
//import iskallia.vault.world.data.DiscoveredModelsData;
//import net.minecraft.ChatFormatting;
//import net.minecraft.Util;
//import net.minecraft.network.chat.MutableComponent;
//import net.minecraft.network.chat.TextComponent;
//import net.minecraft.resources.ResourceLocation;
//import net.minecraft.server.level.ServerPlayer;
//import net.minecraft.world.entity.Mob;
//import org.spongepowered.asm.mixin.Mixin;
//
//import static iskallia.vault.init.ModModelDiscoveryGoals.REGISTRY;
//
//@Mixin(value = ModModelDiscoveryGoals.class, remap = false)
//public class MixinModModelDiscoveryGoals {
//    private static VaultMobKillGoal CHILLED_MOBS_KILLED;
//    private static VaultMobKillGoal FIRE_MOBS_KILLED;
//    private static VaultMobKillGoal VOID_LIQUID_DEATH;
//
//    static {
//        CHILLED_MOBS_KILLED = (VaultMobKillGoal)registerGoal(VaultMod.id("chilled_mobs_killed"), (VaultMobKillGoal)(new VaultMobKillGoal(1)).withPredicate((e) -> {
//            return e.getEntityLiving() instanceof Mob;
//        }).withPredicate((e) -> {
//            return e.getEntityLiving().hasEffect(ModEffects.CHILLED);
//        }).setReward((player, goal) -> {
//            DiscoveredModelsData discoversData = DiscoveredModelsData.get(player.getLevel());
//            ResourceLocation modelId = Swords.LEGACY_OF_FLAMESCION.getId();
//            if (!discoversData.getDiscoveredModels(player.getUUID()).contains(modelId)) {
//                MutableComponent info = (new TextComponent("You have killed " + (int)goal.getTargetProgress() + " chilled mobs this Vault!")).withStyle(ChatFormatting.GREEN);
//                player.sendMessage(info, Util.NIL_UUID);
//                discoversData.discoverModelAndBroadcast(ModItems.SWORD, modelId, player);
//            }
//
//        }));
//
//        FIRE_MOBS_KILLED = (VaultMobKillGoal)registerGoal(VaultMod.id("fire_mobs_killed"), (VaultMobKillGoal)(new VaultMobKillGoal(1)).withPredicate((e) -> {
//            return e.getEntityLiving() instanceof Mob;
//        }).withPredicate((e) -> {
//            return e.getEntityLiving().isOnFire();
//        }).setReward((player, goal) -> {
//            DiscoveredModelsData discoversData = DiscoveredModelsData.get(player.getLevel());
//            ResourceLocation modelId = ModDynamicModels.Swords.SOUL_SWORD_BLUE.getId();
//            if (!discoversData.getDiscoveredModels(player.getUUID()).contains(modelId)) {
//                MutableComponent info = (new TextComponent("You have killed " + (int)goal.getTargetProgress() + " mobs on fire this Vault!")).withStyle(ChatFormatting.GREEN);
//                player.sendMessage(info, Util.NIL_UUID);
//                discoversData.discoverModelAndBroadcast(ModItems.SWORD, modelId, player);
//            }
//
//        }));
//
//        VOID_LIQUID_DEATH = (VaultMobKillGoal)registerGoal(VaultMod.id("void_liquid_death"), (VaultMobKillGoal)(new VaultMobKillGoal(1))
//                .withPredicate((e) -> { return e.getEntityLiving() instanceof ServerPlayer;})
//                .withPredicate((e) -> { return e.getEntityLiving().hasEffect(ModEffects.TIMER_ACCELERATION);})
//                .setReward((player, goal) -> {
//            DiscoveredModelsData discoversData = DiscoveredModelsData.get(player.getLevel());
//            ResourceLocation modelId = Swords.SPEAR_OF_THE_VOID.getId();
//            if (!discoversData.getDiscoveredModels(player.getUUID()).contains(modelId)) {
//                MutableComponent info = (new TextComponent("You have embraced the void...")).withStyle(ChatFormatting.GREEN);
//                player.sendMessage(info, Util.NIL_UUID);
//                discoversData.discoverModelAndBroadcast(ModItems.SWORD, modelId, player);
//                System.out.println("VOIDVOIDVOIDVOIDVOIDVOID");
//            }
//        }));
//    }
//
//    private static <G extends DiscoveryGoal<G>> G registerGoal(ResourceLocation id, G goal) {
//        goal.setId(id);
//        REGISTRY.put(id, goal);
//        return goal;
//    }
//
//}
