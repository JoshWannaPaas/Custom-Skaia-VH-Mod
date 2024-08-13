package com.jwp.skaia_vh.models;

import iskallia.vault.VaultMod;
import iskallia.vault.dynamodel.DynamicModelProperties;
import iskallia.vault.dynamodel.model.item.PlainItemModel;
import iskallia.vault.dynamodel.registry.DynamicModelRegistry;

public class Magnets {
    public static final DynamicModelRegistry<PlainItemModel> REGISTRY = new DynamicModelRegistry<>();

    // Scrappy
    public static final PlainItemModel MAGNET_OG;
    public static final PlainItemModel MAGNET_RAW;


    // Common
    public static final PlainItemModel MAGNET_WEAK;
    public static final PlainItemModel MAGNET_GLOVE;


    // Rare
    public static final PlainItemModel MAGNET_BAR;
    public static final PlainItemModel MAGNET_ELECTRIC;


    // Epic
    public static final PlainItemModel MAGNET_STRONG;
    public static final PlainItemModel MAGNET_BLUETOOTH;


    // Omega
    public static final PlainItemModel MAGNET_OMEGA;
    public static final PlainItemModel MAGNET_FORCE;


    // Unique
//    public static final PlainItemModel DAGGER_;

    public Magnets() {
    }

    static {
        // Scrappy
        MAGNET_RAW =       (PlainItemModel) REGISTRY.register((PlainItemModel) new PlainItemModel(VaultMod.id("gear/magnet/scrappy/raw_magnetite"), "Raw Magnetite")                .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        MAGNET_OG =       (PlainItemModel) REGISTRY.register((PlainItemModel) new PlainItemModel(VaultMod.id("magnets/magnet_1"), "The OG")                .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));

        // Common
        MAGNET_WEAK =        (PlainItemModel) REGISTRY.register((PlainItemModel) new PlainItemModel(VaultMod.id("gear/magnet/common/magnet_weak"), "Familiar Weak Magnet")                   .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        MAGNET_GLOVE =        (PlainItemModel) REGISTRY.register((PlainItemModel) new PlainItemModel(VaultMod.id("gear/magnet/common/magnet_glove"), "Magnetic Glove")                   .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));

        // Rare
        MAGNET_BAR =     (PlainItemModel) REGISTRY.register((PlainItemModel) new PlainItemModel(VaultMod.id("gear/magnet/rare/magnet_bar"), "The Bar")               .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        MAGNET_ELECTRIC =     (PlainItemModel) REGISTRY.register((PlainItemModel) new PlainItemModel(VaultMod.id("gear/magnet/rare/magnet_electric"), "Increased Electric Damage")               .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));

        // Epic
        MAGNET_STRONG =   (PlainItemModel) REGISTRY.register((PlainItemModel) new PlainItemModel(VaultMod.id("gear/magnet/epic/magnet_strong"), "Familiar Strong Magnet")           .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        MAGNET_BLUETOOTH =   (PlainItemModel) REGISTRY.register((PlainItemModel) new PlainItemModel(VaultMod.id("gear/magnet/epic/bluetooth"), "It's Bluetooth, Bro")           .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));

        // Omega
        MAGNET_OMEGA =    (PlainItemModel) REGISTRY.register((PlainItemModel) new PlainItemModel(VaultMod.id("gear/magnet/omega/magnet_omega"), "Familiar Omega Magnet")       .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        MAGNET_FORCE =    (PlainItemModel) REGISTRY.register((PlainItemModel) new PlainItemModel(VaultMod.id("gear/magnet/omega/magnetic_force"), "Force of Magnetism")       .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));

        //Unique
    }
}
