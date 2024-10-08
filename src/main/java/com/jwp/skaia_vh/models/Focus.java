package com.jwp.skaia_vh.models;

import iskallia.vault.VaultMod;
import iskallia.vault.dynamodel.DynamicModelProperties;
import iskallia.vault.dynamodel.model.item.HandHeldModel;
import iskallia.vault.dynamodel.model.item.PlainItemModel;
import iskallia.vault.dynamodel.registry.DynamicModelRegistry;

public class Focus {
    public static final DynamicModelRegistry<PlainItemModel> REGISTRY = new DynamicModelRegistry();
    public static final PlainItemModel TATTERED_TOME;
    public static final PlainItemModel GRIMOIRE;
    public static final PlainItemModel ARCANE_CODEX;
    public static final PlainItemModel MYSTICAL_LEXICON;
    public static final PlainItemModel TOME_OF_KNOWLEDGE;
    public static final PlainItemModel SOUL_ORB;

    /*** Modded ***/
    // Epic
    public static final PlainItemModel CRANES_ECHOING_CALL;
    public static final PlainItemModel JADEFALLS_SPLENDOR;
    public static final PlainItemModel KAGURAS_VERITY;

    // Omega
    public static final PlainItemModel MEMORY_OF_DUST;
    public static final PlainItemModel SKYWARD_ATLAS;
    public static final PlainItemModel TULAYTULLAHS_REMEMBERANCE;

    public Focus() {
    }

    static {
        /* Modded */
        CRANES_ECHOING_CALL = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/focus/cranes_echoing_call"), "Crane's Echoing Call")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        JADEFALLS_SPLENDOR = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/focus/jadefalls_splendor"), "Jadefall's Splendor")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        KAGURAS_VERITY = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/focus/kaguras_verity"), "Kagura's Verity")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        MEMORY_OF_DUST = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/focus/memory_of_dust"), "Memory of Dust")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        SKYWARD_ATLAS = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/focus/skyward_atlas"), "Skyward Atlas")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        TULAYTULLAHS_REMEMBERANCE = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/focus/tulaytullahs_remembrance"), "Tulaytullah's Remembrance")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));

        /* Vanilla */
        TATTERED_TOME = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/focus/tatteredtome"), "Tattered Tome")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        GRIMOIRE = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/focus/grimoire"), "Grimoire")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        ARCANE_CODEX = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/focus/arcanecodex"), "Arcane Codex")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        MYSTICAL_LEXICON = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/focus/mysticallexicon"), "Mystical Lexicon")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        TOME_OF_KNOWLEDGE = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/focus/tomeofknowledge"), "Tome of Knowledge")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        SOUL_ORB = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/focus/soulorb"), "Soul Orb")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
    }
}
