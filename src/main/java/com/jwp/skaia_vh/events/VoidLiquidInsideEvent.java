package com.jwp.skaia_vh.events;

import iskallia.vault.core.event.Event;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.Level;

public class VoidLiquidInsideEvent extends Event<VoidLiquidInsideEvent, VoidLiquidInsideEvent.Data> {
    public VoidLiquidInsideEvent() {}

    protected VoidLiquidInsideEvent(VoidLiquidInsideEvent parent) { super(parent); }

    public VoidLiquidInsideEvent createChild() {return new VoidLiquidInsideEvent(this); }

    public VoidLiquidInsideEvent.Data invoke(ServerPlayer player, Level level) {
        return this.invoke(new VoidLiquidInsideEvent.Data(player, level));
    }

    public VoidLiquidInsideEvent in(Level level) {
        return this.filter((data) -> level == data.level);
    }

    public static class Data {
        /**
         * The initialization for the class.
         * @param player The player who used hunter ability
         * @param level The level where ability was used.
         */
        protected Data(ServerPlayer player, Level level)
        {
            this.player = player;
            this.level = level;
        }


        /**
         * The player who used hunter ability.
         * @return The player who used hunter ability.
         */
        public ServerPlayer getPlayer()
        {
            return this.player;
        }


        /**
         * Gets level.
         *
         * @return the level
         */
        public Level getLevel()
        {
            return this.level;
        }


        /**
         * The player that is triggered.
         */
        private final ServerPlayer player;

        /*
         * The level where entity will be spawned.
         */
        private final Level level;
    }
}
