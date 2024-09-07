package com.jwp.skaia_vh.events;

import iskallia.vault.core.event.Event;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.Level;

public class PedestalInteractEvent extends Event<PedestalInteractEvent, PedestalInteractEvent.Data> {
    public PedestalInteractEvent() {}

    protected PedestalInteractEvent(PedestalInteractEvent parent) { super(parent); }

    public PedestalInteractEvent createChild() {return new PedestalInteractEvent(this); }

    public PedestalInteractEvent.Data invoke(ServerPlayer player, Level level) {
        return this.invoke(new PedestalInteractEvent.Data(player, level));
    }

    public PedestalInteractEvent in(Level level) {
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
