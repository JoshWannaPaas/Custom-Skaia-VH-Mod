package com.jwp.skaia_vh.models;

import iskallia.vault.VaultMod;
import iskallia.vault.dynamodel.DynamicModelProperties;
import iskallia.vault.dynamodel.model.item.HandHeldModel;
import iskallia.vault.dynamodel.registry.DynamicModelRegistry;

public class Staffs {
    public static final DynamicModelRegistry<HandHeldModel> REGISTRY = new DynamicModelRegistry();

    // Scrappy
    public static final HandHeldModel VALKYRIE_LANCE;

    // Common
    public static final HandHeldModel LITHIC_SPEAR;

    // Rare
    public static final HandHeldModel DRAGONS_BANE;
    public static final HandHeldModel SKYWARD_SPINE;
    public static final HandHeldModel STAFF_OF_THE_SCARLET_SANDS;

    // Epic
    public static final HandHeldModel ENGULFING_LIGHTNING;
    public static final HandHeldModel BALLAD_OF_THE_FJORDS;
    public static final HandHeldModel VORTEX_VANQUISHER;

    // Omega
    public static final HandHeldModel LUMIDOUCE_ELEGY;
    public static final HandHeldModel PRIMORDIAL_JADE_WINGED_SPEAR;
    public static final HandHeldModel STAFF_OF_HOMA;

    // Unique
    public static final HandHeldModel THE_CATCH;    // Catch a fish in the vault




    public Staffs() {
    }

    static {
        VALKYRIE_LANCE =                (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/staff/valkyrie_lance"),                "Valkyrie Lance")                 .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        LITHIC_SPEAR =                  (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/staff/lithic_spear"),                  "Lithic Spear")                 .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        DRAGONS_BANE =                  (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/staff/dragons_bane"),                  "Dragon's Bane")                .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        SKYWARD_SPINE =                 (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/staff/skyward_spine"),                 "Skyward Spine")                .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        STAFF_OF_THE_SCARLET_SANDS =    (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/staff/staff_of_the_scarlet_sands"),    "Staff of the Scarlet Sands")   .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        ENGULFING_LIGHTNING =           (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/staff/engulfing_lightning"),           "Engulfing Lightning")          .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        BALLAD_OF_THE_FJORDS =          (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/staff/ballad_of_the_fjords"),          "Ballad of the Fjords")         .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        VORTEX_VANQUISHER =             (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/staff/vortex_vanquisher"),             "Vortex Vanquisher")            .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        LUMIDOUCE_ELEGY =               (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/staff/lumidouce_elegy"),               "Lumidouce Elegy")              .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        PRIMORDIAL_JADE_WINGED_SPEAR =  (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/staff/primordial_jade_winged_spear"),  "Primordial Jade Winged Spear") .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        STAFF_OF_HOMA =                 (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/staff/staff_of_homa"),                 "Staff of Homa")                .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));
        THE_CATCH =                     (HandHeldModel) REGISTRY.register((HandHeldModel) new HandHeldModel(VaultMod.id("gear/staff/the_catch"),                     "The Catch")                    .properties(new DynamicModelProperties().allowTransmogrification().discoverOnRoll()));

    }
}
