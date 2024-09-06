package com.jwp.skaia_vh.models;

import iskallia.vault.VaultMod;
import iskallia.vault.dynamodel.DynamicModelProperties;
import iskallia.vault.dynamodel.model.item.HandHeldModel;
import iskallia.vault.dynamodel.registry.DynamicModelRegistry;

public class Axes {
    public static final DynamicModelRegistry<HandHeldModel> REGISTRY = new DynamicModelRegistry();
    public static final HandHeldModel AXE_0;
    public static final HandHeldModel AXE_1;
    public static final HandHeldModel AXE_2;
    public static final HandHeldModel AXE_3;
    public static final HandHeldModel AXE_4;
    public static final HandHeldModel AXE_5;
    public static final HandHeldModel AXE_6;
    public static final HandHeldModel AXE_7;
    public static final HandHeldModel AXE_8;
    public static final HandHeldModel AXE_9;
    public static final HandHeldModel AXE_10;
    public static final HandHeldModel AXE_11;
    public static final HandHeldModel AXE_12;
    public static final HandHeldModel AXE_13;
    public static final HandHeldModel JANITORS_BROOM;
    public static final HandHeldModel BIG_CHOPPA;
    public static final HandHeldModel EVIL_MACE;
    public static final HandHeldModel GREATHAMMER;
    public static final HandHeldModel TINY_HAMMER;
    public static final HandHeldModel BLOOD_CHOPPER;
    public static final HandHeldModel BLOOD_CLEAVER;
    public static final HandHeldModel LAST_SIGHT;
    public static final HandHeldModel IDONAS_SCYTHE;
    public static final HandHeldModel TENOS_STAFF;
    public static final HandHeldModel VELARAS_HAMMER;
    public static final HandHeldModel WENDARRS_CLOCKAXE;
    public static final HandHeldModel GODAXE;


    /*** Modded ***/
    // Scrappy
    public static final HandHeldModel CHIPPED_AXE;

    // Common
    public static final HandHeldModel FLAWED_AXE;
    public static final HandHeldModel BARROTH_HAMMER;

    // Rare
    public static final HandHeldModel FLAWLESS_AXE;
    public static final HandHeldModel BINDING_BLUDGEON;
    public static final HandHeldModel KUT_KU_JAW;

    // Epic
    public static final HandHeldModel IMPERFECT_AXE;
    public static final HandHeldModel BRACHY_TAILHAMMER;
//    public static final HandHeldModel PATH_TO_ACHERON;

    // Omega
    public static final HandHeldModel PERFECT_AXE;
    public static final HandHeldModel VERDICT;

    // Unique
    public static final HandHeldModel CRIMSON_MOONS_SEMBLANCE;          // Blood Moon mobs
    public static final HandHeldModel FLEUVE_CENDRE_FERRYMAN;           // beat up with a stick or something
    public static final HandHeldModel SKALLIANCHOR;                     // something iskall

    public Axes() {
    }

    static {
        /* Modded */
        CHIPPED_AXE = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/chipped_axe"), "Chipped Axe")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        FLAWED_AXE = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/flawed_axe"), "Flawed Axe")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        FLAWLESS_AXE = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/flawless_axe"), "Flawless Axe")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        IMPERFECT_AXE = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/imperfect_axe"), "Imperfect Axe")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        PERFECT_AXE = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/perfect_axe"), "Perfect Axe")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
//        PATH_TO_ACHERON = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/path_to_acheron"), "Path to Acheron")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        CRIMSON_MOONS_SEMBLANCE = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/crimson_moons_semblance"), "Crimson Moon's Semblance")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        VERDICT = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/verdict"), "Verdict")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        SKALLIANCHOR = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/skallianchor"), "Skallianchor")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        FLEUVE_CENDRE_FERRYMAN = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/fleuve_cendre_ferryman"), "Fleuve Cendre Ferryman")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        BARROTH_HAMMER = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/barroth_hammer"), "Barroth Hammer")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        BINDING_BLUDGEON = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/binding_bludgeon"), "Binding Bludgeon")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        KUT_KU_JAW = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/kut_ku_jaw"), "Kut Ku Jaw")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        BRACHY_TAILHAMMER = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/brachy_tailhammer"), "Brachy Tailhammer")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));



        /* Vanilla */
        AXE_0 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/axe_0"), "Diamond Warrior")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        AXE_1 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/axe_1"), "Aquamarine Warrior")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        AXE_2 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/axe_2"), "Sapphire Warrior")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        AXE_3 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/axe_3"), "Amethyst Warrior")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        AXE_4 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/axe_4"), "Opal Warrior")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        AXE_5 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/axe_5"), "Ruby Warrior")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        AXE_6 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/axe_6"), "Jade Warrior")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        AXE_7 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/axe_7"), "Garnet Warrior")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        AXE_8 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/axe_8"), "Sugilite Warrior")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        AXE_9 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/axe_9"), "Berserker of Essence")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        AXE_10 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/axe_10"), "Berserker of Dawn")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        AXE_11 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/axe_11"), "Berserker of Souls")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        AXE_12 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/axe_12"), "Berserker of Depths")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        AXE_13 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/axe_13"), "Berserker of Life")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        JANITORS_BROOM = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/janitors_broom"), "Janitor's Broomstick")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        BIG_CHOPPA = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/big_choppa"), "Big Choppa")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        EVIL_MACE = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/evil_mace"), "Evil Mace")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        GREATHAMMER = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/greathammer"), "Greathammer")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        TINY_HAMMER = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/tiny_hammer"), "Tiny Hammer")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        BLOOD_CHOPPER = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/blood_chopper"), "Blood Chopper")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        BLOOD_CLEAVER = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/blood_cleaver"), "Blood Cleaver")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        LAST_SIGHT = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/last_sight"), "Last Sight")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        IDONAS_SCYTHE = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/idonas_scythe"), "Idona's Scythe")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        TENOS_STAFF = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/tenos_staff"), "Tenos' Staff")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        VELARAS_HAMMER = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/velaras_hammer"), "Velara's Hammer")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        WENDARRS_CLOCKAXE = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/wendarrs_clockaxe"), "Wendarr's Clockaxe")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        GODAXE = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/godaxe"), "Godaxe")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
    }
}