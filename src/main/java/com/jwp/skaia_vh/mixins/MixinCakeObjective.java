package com.jwp.skaia_vh.mixins;

import com.jwp.skaia_vh.models.Swords;
import iskallia.vault.core.data.key.FieldKey;
import iskallia.vault.core.data.key.registry.FieldRegistry;
import iskallia.vault.core.event.CommonEvents;
import iskallia.vault.core.event.common.BlockUseEvent;
import iskallia.vault.core.vault.Vault;
import iskallia.vault.core.vault.objective.CakeObjective;
import iskallia.vault.core.vault.player.Completion;
import iskallia.vault.core.vault.player.Listener;
import iskallia.vault.core.vault.player.Listeners;
import iskallia.vault.core.world.storage.VirtualWorld;
import iskallia.vault.init.ModItems;
import iskallia.vault.world.VaultDifficulty;
import iskallia.vault.world.data.DiscoveredModelsData;
import iskallia.vault.world.data.WorldSettings;
import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import iskallia.vault.core.data.DataObject;

import java.util.Random;


@Mixin(value = CakeObjective.class, remap = false)
public class MixinCakeObjective extends DataObject {


    @Shadow @Final public static FieldKey<Integer> COUNT;
    @Shadow @Final public static FieldRegistry FIELDS;

    @Inject(method = "initServer", at = @At("HEAD"))
    public void initServer(VirtualWorld world, Vault vault, CallbackInfo ci) {
        CommonEvents.BLOCK_USE.in(world).at(BlockUseEvent.Phase.HEAD).of(Blocks.CAKE).register(this, (data) -> {
            Listener listener = ((Listeners)vault.get(Vault.LISTENERS)).get(data.getPlayer().getUUID());
            if (listener != null) {
                MutableComponent info = (new TextComponent("Shame.")).withStyle(ChatFormatting.GREEN);
                data.getPlayer().sendMessage(info, Util.NIL_UUID);
                DiscoveredModelsData.get(world).discoverModelAndBroadcast(ModItems.SWORD, Swords.SLICE_OF_CHEESE.getId(), data.getPlayer());
            }
        });

        CommonEvents.LISTENER_LEAVE.register(this, (data) -> {
            if (data.getVault() == vault) {
                vault.getOptional(Vault.STATS).map((stats) -> {
                    return stats.get(data.getListener());
                }).ifPresent((stats) -> {
                    if (stats.getCompletion() == Completion.COMPLETED && (Integer) this.get(COUNT) > 30) {
                        data.getListener().getPlayer().ifPresent((player) -> {
                            VaultDifficulty difficulty = WorldSettings.get((Level) world).getPlayerDifficulty(player.getUUID());
                            if(difficulty.getKey().equals("fragged")){
                                MutableComponent info = (new TextComponent("Wow it must be your birthday")).withStyle(ChatFormatting.GREEN);
                                player.sendMessage(info, Util.NIL_UUID);
                                DiscoveredModelsData.get(world).discoverModelAndBroadcast(ModItems.SWORD, Swords.GLIZZY_GLADIUS.getId(), player);
                            }
                        });
                    }

                });
            }
        });
    }

    @Override
    public FieldRegistry getFields() {
        return FIELDS;
    }
}
