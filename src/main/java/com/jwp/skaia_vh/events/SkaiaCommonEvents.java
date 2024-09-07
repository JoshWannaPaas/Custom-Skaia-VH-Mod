package com.jwp.skaia_vh.events;

import iskallia.vault.core.event.CommonEvents;
import iskallia.vault.core.event.Event;


public class SkaiaCommonEvents {
    public static final VoidLiquidInsideEvent INSIDE_VOID_LIQUID = register(new VoidLiquidInsideEvent());
    public static final PedestalInteractEvent INTERACT_PEDESTAL = register(new PedestalInteractEvent());
    public static final FishEvent FISH_INSIDE_VAULT = register(new FishEvent());
    public static final FallDeathEvent FALL_TO_DEATH = register(new FallDeathEvent());

    private static <T extends Event<?, ?>> T register (T event) {
        CommonEvents.REGISTRY.add(event);
        return event;
    }

    public static void init() {}
}
