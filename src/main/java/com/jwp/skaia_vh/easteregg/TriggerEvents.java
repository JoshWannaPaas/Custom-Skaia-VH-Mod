package com.jwp.skaia_vh.easteregg;

import com.jwp.skaia_vh.events.SkaiaCommonEvents;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class TriggerEvents {

    @SubscribeEvent
    public static void onDeath(LivingDeathEvent event) {
        if(event.getEntityLiving() instanceof ServerPlayer serverPlayer) {
            if(event.getSource().equals(DamageSource.FALL)) {
                SkaiaCommonEvents.FALL_TO_DEATH.invoke(serverPlayer, serverPlayer.getLevel());
            }
        }
    }
}
