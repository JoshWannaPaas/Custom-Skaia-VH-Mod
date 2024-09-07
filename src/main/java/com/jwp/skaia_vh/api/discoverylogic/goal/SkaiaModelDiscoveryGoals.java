package com.jwp.skaia_vh.api.discoverylogic.goal;

import com.jwp.skaia_vh.models.Axes;
import com.jwp.skaia_vh.models.Swords;
import com.jwp.skaia_vh.models.Wands;
import iskallia.vault.VaultMod;
import iskallia.vault.discoverylogic.goal.VaultBlockBreakGoal;
import iskallia.vault.discoverylogic.goal.VaultMobKillGoal;
import iskallia.vault.discoverylogic.goal.base.DiscoveryGoal;
import iskallia.vault.entity.entity.bloodmoon.*;
import iskallia.vault.entity.entity.skeleton_pirate.*;
import iskallia.vault.entity.entity.tier1.Tier1DrownedEntity;
import iskallia.vault.entity.entity.tier2.Tier2DrownedEntity;
import iskallia.vault.entity.entity.tier3.Tier3DrownedEntity;
import iskallia.vault.init.*;
import iskallia.vault.item.gear.VaultSwordItem;
import iskallia.vault.world.data.DiscoveredModelsData;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.animal.Cod;
import net.minecraft.world.entity.animal.Pufferfish;
import net.minecraft.world.entity.animal.Salmon;
import net.minecraft.world.entity.animal.TropicalFish;
import net.minecraft.world.entity.monster.Drowned;
import net.minecraft.world.entity.monster.MagmaCube;
import net.minecraft.world.entity.monster.Slime;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.LightningRodBlock;


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

        POISON_NOVA_MOBS_KILLED = (VaultMobKillGoal)registerGoal(VaultMod.id("poison_nova_mobs_killed"), (VaultMobKillGoal)(new VaultMobKillGoal(500)).withPredicate((e) -> {
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

        VOID_LIQUID_DEATH = registerGoal(VaultMod.id("void_liquid_death"), new VaultVoidGoal(1200).setReward((player, goal) -> {
                    DiscoveredModelsData discoversData = DiscoveredModelsData.get(player.getLevel());
                    ResourceLocation modelId = Swords.SPEAR_OF_THE_VOID.getId();
                    if (!discoversData.getDiscoveredModels(player.getUUID()).contains(modelId)) {
                        MutableComponent info = (new TextComponent("You have embraced the void...")).withStyle(ChatFormatting.GREEN);
                        player.sendMessage(info, Util.NIL_UUID);
                        discoversData.discoverModelAndBroadcast(ModItems.SWORD, modelId, player);
                    }
                }));

        BLOOD_MOBS_KILLED = (VaultMobKillGoal)registerGoal(VaultMod.id("blood_mobs_killed"), (VaultMobKillGoal)(new VaultMobKillGoal(500)).withPredicate((e) -> {
            return e.getEntityLiving() instanceof BloodSilverfishEntity ||
                    e.getEntityLiving() instanceof BloodSkeletonEntity ||
                    e.getEntityLiving() instanceof BloodSlimeEntity ||
                    e.getEntityLiving() instanceof Tier0BloodSkeletonEntity ||
                    e.getEntityLiving() instanceof Tier1BloodSkeletonEntity ||
                    e.getEntityLiving() instanceof Tier2BloodSkeletonEntity ||
                    e.getEntityLiving() instanceof Tier3BloodSkeletonEntity ||
                    e.getEntityLiving() instanceof Tier4BloodSkeletonEntity ||
                    e.getEntityLiving() instanceof Tier5BloodSkeletonEntity;
        }).setReward((player, goal) -> {
            DiscoveredModelsData discoversData = DiscoveredModelsData.get(player.getLevel());
            ResourceLocation modelId = Axes.CRIMSON_MOONS_SEMBLANCE.getId();
            if (!discoversData.getDiscoveredModels(player.getUUID()).contains(modelId)) {
                MutableComponent info = (new TextComponent("You have killed " + (int)goal.getTargetProgress() + " Blood Mobs this Vault!")).withStyle(ChatFormatting.GREEN);
                player.sendMessage(info, Util.NIL_UUID);
                discoversData.discoverModelAndBroadcast(ModItems.AXE, modelId, player);
            }
        }));

        INTERACT_HERO_PEDESTAL = registerGoal(VaultMod.id("interact_hero_pedestal"), new VaultPedestalGoal(1).setReward((player, goal) -> {
                DiscoveredModelsData discoversData = DiscoveredModelsData.get(player.getLevel());
                ResourceLocation modelId = Swords.SWORD_THAT_SEALS_THE_DARKNESS.getId();
                if (!discoversData.getDiscoveredModels(player.getUUID()).contains(modelId)) {
                    MutableComponent info = (new TextComponent("Open your eyes...")).withStyle(ChatFormatting.GREEN);
                    player.sendMessage(info, Util.NIL_UUID);
                    discoversData.discoverModelAndBroadcast(ModItems.SWORD, modelId, player);
                }
            }));

        FISH_MOBS_KILLED = (VaultMobKillGoal)registerGoal(VaultMod.id("fish_mobs_killed"), (VaultMobKillGoal)(new VaultMobKillGoal(10)).withPredicate((e) -> {
            return e.getEntityLiving() instanceof TropicalFish ||
                    e.getEntityLiving() instanceof Salmon ||
                    e.getEntityLiving() instanceof Pufferfish ||
                    e.getEntityLiving() instanceof Cod;
        }).setReward((player, goal) -> {
            DiscoveredModelsData discoversData = DiscoveredModelsData.get(player.getLevel());
            ResourceLocation modelId = Wands.END_OF_THE_LINE.getId();
            if (!discoversData.getDiscoveredModels(player.getUUID()).contains(modelId)) {
                MutableComponent info = (new TextComponent("You have killed " + (int)goal.getTargetProgress() + " Fish this Vault!")).withStyle(ChatFormatting.GREEN);
                player.sendMessage(info, Util.NIL_UUID);
                discoversData.discoverModelAndBroadcast(ModItems.WAND, modelId, player);
            }
        }));

        FISH_CAUGHT = (VaultFishingGoal)registerGoal(VaultMod.id("fish_caught"), (VaultFishingGoal)(new VaultFishingGoal(1)).setReward((player, goal) -> {
            DiscoveredModelsData discoversData = DiscoveredModelsData.get(player.getLevel());
            ResourceLocation modelId = Wands.END_OF_THE_LINE.getId();
            if (!discoversData.getDiscoveredModels(player.getUUID()).contains(modelId)) {
                MutableComponent info = (new TextComponent("Seems the fish are biting today.")).withStyle(ChatFormatting.GREEN);
                player.sendMessage(info, Util.NIL_UUID);
                discoversData.discoverModelAndBroadcast(ModItems.WAND, modelId, player);
            }
        }));

        ROD_MOBS_KILLED = (VaultMobKillGoal)registerGoal(VaultMod.id("rod_mobs_killed"), (VaultMobKillGoal)(new VaultMobKillGoal(100)).withPredicate((e) -> {
            return e.getEntityLiving() instanceof Mob;
        }).withKillerPredicate((p) -> {
            return p.getMainHandItem().getItem() == Items.LIGHTNING_ROD;
        }).setReward((player, goal) -> {
            DiscoveredModelsData discoversData = DiscoveredModelsData.get(player.getLevel());
            ResourceLocation modelId = Axes.FLEUVE_CENDRE_FERRYMAN.getId();
            if (!discoversData.getDiscoveredModels(player.getUUID()).contains(modelId)) {
                MutableComponent info = (new TextComponent("You bashed " + (int)goal.getTargetProgress() + " mobs's heads in with a metal rod this Vault!")).withStyle(ChatFormatting.GREEN);
                player.sendMessage(info, Util.NIL_UUID);
                discoversData.discoverModelAndBroadcast(ModItems.AXE, modelId, player);
            }
        }));

        SLIMES_KILLED = (VaultMobKillGoal)registerGoal(VaultMod.id("slimes_killed"), (VaultMobKillGoal)(new VaultMobKillGoal(300)).withPredicate((e) -> {
            return e.getEntityLiving() instanceof Slime ||
                    e.getEntityLiving() instanceof MagmaCube ||
                    e.getEntityLiving() instanceof BloodSlimeEntity;
        }).withKillerPredicate((p) -> {
            return p.getMainHandItem().getItem() instanceof VaultSwordItem;
        }).setReward((player, goal) -> {
            DiscoveredModelsData discoversData = DiscoveredModelsData.get(player.getLevel());
            ResourceLocation modelId = Swords.SLIME_BUSTER.getId();
            if (!discoversData.getDiscoveredModels(player.getUUID()).contains(modelId)) {
                MutableComponent info = (new TextComponent("You have killed " + (int)goal.getTargetProgress() + " Slimes with a Sword this Vault!")).withStyle(ChatFormatting.GREEN);
                player.sendMessage(info, Util.NIL_UUID);
                discoversData.discoverModelAndBroadcast(ModItems.SWORD, modelId, player);
            }
        }));

        FLOODED_MOBS_KILLED = (VaultMobKillGoal)registerGoal(VaultMod.id("flooded_mobs_killed"), (VaultMobKillGoal)(new VaultMobKillGoal(500)).withPredicate((e) -> {
            return e.getEntityLiving() instanceof SkeletonPirateEntity ||
                    e.getEntityLiving() instanceof Tier0SkeletonPirateEntity ||
                    e.getEntityLiving() instanceof Tier1SkeletonPirateEntity ||
                    e.getEntityLiving() instanceof Tier2SkeletonPirateEntity ||
                    e.getEntityLiving() instanceof Tier3SkeletonPirateEntity ||
                    e.getEntityLiving() instanceof Tier4SkeletonPirateEntity ||
                    e.getEntityLiving() instanceof Tier5SkeletonPirateEntity ||
                    e.getEntityLiving() instanceof Tier0SkeletonPirateEntity ||
                    e.getEntityLiving() instanceof Tier1DrownedEntity ||
                    e.getEntityLiving() instanceof Tier2DrownedEntity ||
                    e.getEntityLiving() instanceof Tier3DrownedEntity ||
                    e.getEntityLiving() instanceof Drowned;
        }).setReward((player, goal) -> {
            DiscoveredModelsData discoversData = DiscoveredModelsData.get(player.getLevel());
            ResourceLocation modelId = Axes.SKALLIANCHOR.getId();
            if (!discoversData.getDiscoveredModels(player.getUUID()).contains(modelId)) {
                MutableComponent info = (new TextComponent("You have killed " + (int)goal.getTargetProgress() + " Flooded Mobs this Vault!")).withStyle(ChatFormatting.GREEN);
                player.sendMessage(info, Util.NIL_UUID);
                discoversData.discoverModelAndBroadcast(ModItems.AXE, modelId, player);
            }
        }));

        FALL_TO_DEATH = registerGoal(VaultMod.id("fall_to_death"), new VaultFallDeathGoal(1).setReward((player, goal) -> {
            DiscoveredModelsData discoversData = DiscoveredModelsData.get(player.getLevel());
            ResourceLocation modelId = Swords.TOUKABOU_SHIGURE.getId();
            if (!discoversData.getDiscoveredModels(player.getUUID()).contains(modelId)) {
                MutableComponent info = (new TextComponent("Need an umbrella?")).withStyle(ChatFormatting.GREEN);
                player.sendMessage(info, Util.NIL_UUID);
                discoversData.discoverModelAndBroadcast(ModItems.SWORD, modelId, player);
            }
        }));






    }

    private static <G extends DiscoveryGoal<G>> G registerGoal(ResourceLocation id, G goal) {
        goal.setId(id);
        ModModelDiscoveryGoals.REGISTRY.put(id, goal);
        return goal;
    }

    public static VaultMobKillGoal CHILLED_MOBS_KILLED;
    public static VaultMobKillGoal POISON_NOVA_MOBS_KILLED;
    public static VaultMobKillGoal FIRE_MOBS_KILLED;
    public static VaultVoidGoal VOID_LIQUID_DEATH;
    public static VaultMobKillGoal BLOOD_MOBS_KILLED;
    public static VaultPedestalGoal INTERACT_HERO_PEDESTAL;
    public static VaultMobKillGoal FISH_MOBS_KILLED;
    public static VaultFishingGoal FISH_CAUGHT;
    public static VaultMobKillGoal ROD_MOBS_KILLED;
    public static VaultMobKillGoal SLIMES_KILLED;
    public static VaultMobKillGoal FLOODED_MOBS_KILLED;
    public static VaultFallDeathGoal FALL_TO_DEATH;

}
