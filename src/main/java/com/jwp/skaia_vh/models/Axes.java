package com.jwp.skaia_vh.models;

import iskallia.vault.VaultMod;
import iskallia.vault.dynamodel.DynamicModelProperties;
import iskallia.vault.dynamodel.model.item.HandHeldModel;
import iskallia.vault.dynamodel.registry.DynamicModelRegistry;

public class Axes {
    public static final DynamicModelRegistry<HandHeldModel> REGISTRY = new DynamicModelRegistry();
    // Scrappy
    public static final HandHeldModel AXE_FRAME;
    public static final HandHeldModel CHIPPED_AXE;

    // Common
    public static final HandHeldModel FLAWED_AXE;

    // Rare
    public static final HandHeldModel FLAWLESS_AXE;

    // Epic
    public static final HandHeldModel PERFECT_AXE;
    public static final HandHeldModel PATH_TO_ACHERON;

    // Omega
    public static final HandHeldModel CRIMSON_MOONS_SEMBLANCE;
    public static final HandHeldModel VERDICT;

    // Unique
    public static final HandHeldModel FLEUVE_CENDRE_FERRYMAN;           // beat up with a stick or something
    public static final HandHeldModel SKALLIANCHOR;                     // something iskall

    public Axes() {
    }

    static {
        /* Modded */
        AXE_FRAME = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/axe_frame"), "Chipped Axe")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        CHIPPED_AXE = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/chipped_axe"), "Flawed Axe")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        FLAWED_AXE = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/flawed_axe"), "Flawless Axe")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        FLAWLESS_AXE = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/flawless_axe"), "Imperfect Axe")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        PERFECT_AXE = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/perfect_axe"), "Perfect Axe")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        PATH_TO_ACHERON = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/path_to_acheron"), "Path to Acheron")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        CRIMSON_MOONS_SEMBLANCE = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/crimson_moons_semblance"), "Crimson Moon's Semblance")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        VERDICT = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/verdict"), "Verdict")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        SKALLIANCHOR = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/skallianchor"), "Skallianchor")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        FLEUVE_CENDRE_FERRYMAN = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/fleuve_cendre_ferryman"), "Fleuve Cendre Ferryman")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
    }
}