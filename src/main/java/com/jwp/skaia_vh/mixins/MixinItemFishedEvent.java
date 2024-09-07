package com.jwp.skaia_vh.mixins;

import com.jwp.skaia_vh.events.SkaiaCommonEvents;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.projectile.FishingHook;
import net.minecraftforge.event.entity.player.ItemFishedEvent;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(ItemFishedEvent.class)
public class MixinItemFishedEvent {
    @Final
    @Shadow
    private FishingHook hook;

    @Inject(method = "<init>", at = @At("TAIL"))
    public void ItemFishedEvent(List stacks, int rodDamage, FishingHook hook, CallbackInfo ci){
        SkaiaCommonEvents.FISH_INSIDE_VAULT.invoke((ServerPlayer) hook.getPlayerOwner(), hook.level);
    }
}
