package com.jwp.skaia_vh.mixins;

import com.jwp.skaia_vh.events.SkaiaCommonEvents;
import iskallia.vault.fluid.block.VoidFluidBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = VoidFluidBlock.class, remap = false)
public class MixinVoidFluidBlock {

    @Inject(method = "entityInside", at = @At(
            value = "INVOKE",
            target = "Liskallia/vault/fluid/block/VoidFluidBlock;affectPlayer(Lnet/minecraft/server/level/ServerPlayer;)V"
    ))
    public void entityInside(BlockState state, Level world, BlockPos pos, Entity entity, CallbackInfo ci) {
        SkaiaCommonEvents.INSIDE_VOID_LIQUID.invoke((ServerPlayer) entity, world);
    }
}
