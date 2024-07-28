package com.jwp.skaia_vh.models;

import iskallia.vault.VaultMod;
import iskallia.vault.dynamodel.DynamicModelProperties;
import iskallia.vault.dynamodel.model.item.HandHeldModel;
import iskallia.vault.dynamodel.registry.DynamicModelRegistry;

public class Daggers {
    public static final DynamicModelRegistry<HandHeldModel> REGISTRY = new DynamicModelRegistry();
    public static final HandHeldModel DAGGER_0;
    public static final HandHeldModel DAGGER_COPPER;
    public static final HandHeldModel DAGGER_LAPIS;
    public static final HandHeldModel DAGGER_REDSTONE;
    public static final HandHeldModel DAGGER_GROWING;
    public static final HandHeldModel DAGGER_GOLDEN;
    public static final HandHeldModel DAGGER_EMERALD;
    public static final HandHeldModel DAGGER_DIAMOND;
    public static final HandHeldModel DAGGER_PURPLE;
    public static final HandHeldModel DAGGER_TERROR;
    public static final HandHeldModel DAGGER_LIGHT_BLUE;
    public static final HandHeldModel DAGGER_LIGHTSABER;

    public Daggers() {
    }

    static {
        DAGGER_0 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/dagger/dagger_0"), "Dagger_0")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        DAGGER_COPPER = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/dagger/dagger_copper"), "Copper Dagger")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        DAGGER_LAPIS = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/dagger/dagger_lapis"), "Lapis Dagger")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        DAGGER_REDSTONE = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/dagger/dagger_redstone"), "Redstone Dagger")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        DAGGER_GROWING = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/dagger/dagger_growing"), "Growing Dagger")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        DAGGER_GOLDEN = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/dagger/dagger_golden"), "Golden Dagger")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        DAGGER_EMERALD = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/dagger/dagger_emerald"), "Emerald Dagger")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        DAGGER_DIAMOND = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/dagger/dagger_diamond"), "Diamond Dagger")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        DAGGER_PURPLE = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/dagger/dagger_purple"), "Purple Dagger")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        DAGGER_TERROR = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/dagger/dagger_terror"), "Terror Dagger")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        DAGGER_LIGHT_BLUE = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/dagger/dagger_light_blue"), "Arcane Dagger")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        DAGGER_LIGHTSABER = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/dagger/lightsaber"), "Cosmonite's Battlesaber")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
    }
}
