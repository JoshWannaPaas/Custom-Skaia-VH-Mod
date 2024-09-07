package com.jwp.skaia_vh.models;

import iskallia.vault.VaultMod;
import iskallia.vault.dynamodel.DynamicModelProperties;
import iskallia.vault.dynamodel.model.item.HandHeldModel;
import iskallia.vault.dynamodel.registry.DynamicModelRegistry;

public class Swords {
    public static final DynamicModelRegistry<HandHeldModel> REGISTRY = new DynamicModelRegistry<>();
    public static final HandHeldModel SWORD_0;
    public static final HandHeldModel SWORD_1;
    public static final HandHeldModel SWORD_2;
    public static final HandHeldModel SWORD_3;
    public static final HandHeldModel SWORD_4;
    public static final HandHeldModel SWORD_5;
    public static final HandHeldModel SWORD_6;
    public static final HandHeldModel SWORD_7;
    public static final HandHeldModel ALLIUMBLADE;
    public static final HandHeldModel BASEBALL_BAT;
    public static final HandHeldModel CHAINSWORD;
    public static final HandHeldModel DARK_BLADE;
    public static final HandHeldModel SOUL_SWORD;
    public static final HandHeldModel SOUL_SWORD_GREEN;
    public static final HandHeldModel SOUL_SWORD_BLUE;
    public static final HandHeldModel RED_KATANA;
    public static final HandHeldModel NIGHTFALL;
    public static final HandHeldModel DEATHS_DOOR;
    public static final HandHeldModel GLADIUS;
    public static final HandHeldModel VELARAS_GREATSWORD;
    public static final HandHeldModel WENDARRS_GREATSWORD;
    public static final HandHeldModel IDONAS_SWORD;
    public static final HandHeldModel CRYSTALLISED_BLADE;
    public static final HandHeldModel DOUBLE_BLADE;
    public static final HandHeldModel DOUWSWORDS_SWOUSKY;
    public static final HandHeldModel KINDLED_BLADE;
    public static final HandHeldModel MOONSHINE;
    public static final HandHeldModel PLATE_PIERCER;
    public static final HandHeldModel REFRACTED_BLADE;
    public static final HandHeldModel RING_BLADE;
    public static final HandHeldModel SKALLIFIED_SWORD;
    public static final HandHeldModel SWAXE;
    public static final HandHeldModel TARNISHED_BLADE;
    public static final HandHeldModel TRIBAL_BLADE;
    public static final HandHeldModel GLOREM_GLIPSUM;
    public static final HandHeldModel BAMBOO;
    public static final HandHeldModel CUTLASS;
    public static final HandHeldModel HONEY_WAND;
    public static final HandHeldModel GODSWORD;
    public static final HandHeldModel SOULFLAME;


    /*** Modded ***/
    // Scrappy
    public static final HandHeldModel CHIPPED_SWORD;                        // VH1
    public static final HandHeldModel CHIPPED_BLADE;                        // VH1

    // Common
    public static final HandHeldModel FLAWED_SWORD;                         // VH1
    public static final HandHeldModel FLAWED_BLADE;                         // VH1

    // Rare
    public static final HandHeldModel FLAWLESS_SWORD;                       // VH1
    public static final HandHeldModel FLAWLESS_BLADE;                       // VH1
    public static final HandHeldModel WATCHER;                              // ShayDeeJay
    public static final HandHeldModel KEY_OF_KHAJ_NISUT;                    // Teyvat Weapon Collection

    // Epic
    public static final HandHeldModel IMPERFECT_SWORD;                      // VH1
    public static final HandHeldModel IMPERFECT_BLADE;                      // VH1
    public static final HandHeldModel REBELLION_MAY_CRY;                    // ShayDeeJay
    public static final HandHeldModel BEACON_OF_THE_REED_SEA;               // Teyvat Weapon Collection
    public static final HandHeldModel FAVONIUS_GREATSWORD;                  // Teyvat Weapon Collection
    public static final HandHeldModel MISTSPLITTER_REFORGED;                // Teyvat Weapon Collection
    public static final HandHeldModel PRIMORDIAL_JADE_CUTTER;               // Teyvat Weapon Collection

    // Omega
    public static final HandHeldModel PERFECT_SWORD;                        // VH1
    public static final HandHeldModel PERFECT_BLADE;                        // VH1
    public static final HandHeldModel SUBSPACE_LANCE;                       // ExtraBotany
    public static final HandHeldModel ABSOLUTION;                           // Teyvat Weapon Collection
    public static final HandHeldModel FREEDOM_SWORN;                        // Teyvat Weapon Collection
    public static final HandHeldModel REDHORN_STONETHRESHER;                // Teyvat Weapon Collection
    public static final HandHeldModel WOLFS_GRAVESTONE;                     // Teyvat Weapon Collection

    // Unique
    public static final HandHeldModel SPEAR_OF_THE_VOID;                    // CraftImpact - Stay in Void Liquid for 60s in a vault
    public static final HandHeldModel LEGACY_OF_FLAMESCION;                 // ExtraBotany - Kill 50 Mobs on Fire in a vault
    public static final HandHeldModel SWORD_THAT_SEALS_THE_DARKNESS;        // ShayDeeJay - Find a Hero's Pedestal inside a Mushroom Theme
    public static final HandHeldModel SLICE_OF_CHEESE;                      // Breadcrumb - Unlocked with Cheese Hat
    public static final HandHeldModel SLIME_BUSTER;                         // Breadcrumb - Kill 300 Slimes with a Sword
    public static final HandHeldModel LUTEY_BOI;                            // Breadcrumb - ??? maybe something with xerca
    public static final HandHeldModel GLIZZY_GLADIUS;                       // Breadcrumb - Find 30 Cakes in Fragged Difficulty
    public static final HandHeldModel TOUKABOU_SHIGURE;                     // Teyvat Weapon Collection - ??? Fall to death in vault
    public static final HandHeldModel MANASTEEL_SWORD;                      // Botania - Craft the item
    public static final HandHeldModel TERRASTEEL_SWORD;                     // Botania - Craft the item
    public static final HandHeldModel ELEMENTIUM_SWORD;                     // Botania - Craft the item

    public Swords() {
    }
    static {
        /* Modded */

                            // Scrappy
        CHIPPED_SWORD                    = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/chipped_sword"),           "Chipped Sword")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        CHIPPED_BLADE                    = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/chipped_blade"),           "Chipped Blade")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
                            // Common
        FLAWED_SWORD                     = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/flawed_sword"),            "Flawed Sword")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        FLAWED_BLADE                     = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/flawed_blade"),            "Flawed Blade")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
                            // Rare
        FLAWLESS_SWORD                   = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/flawless_sword"),          "Flawless Sword")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        FLAWLESS_BLADE                   = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/flawless_blade"),          "Flawless Blade")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        WATCHER                          = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/watcher"),                 "The Watcher")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        KEY_OF_KHAJ_NISUT                = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/key_of_khaj_nisut"),       "Key of Khaj Nisut")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
                            // Epic
        IMPERFECT_SWORD                  = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/imperfect_sword"),         "Imperfect Sword")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        IMPERFECT_BLADE                  = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/imperfect_blade"),         "Imperfect Blade")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        REBELLION_MAY_CRY                = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/rebellion"),               "Rebellion May Cry")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        BEACON_OF_THE_REED_SEA           = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/beacon_of_the_reed_sea"),  "Beacon of the Reed Sea")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        FAVONIUS_GREATSWORD              = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/favonius_greatsword"),     "Favonious Greatsword")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        MISTSPLITTER_REFORGED            = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/mistsplitter_reforged"),   "Mistsplitter Reforged")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        PRIMORDIAL_JADE_CUTTER           = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/primordial_jade_cutter"),  "Primordial Jade Cutter")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
                            // Omega
        PERFECT_SWORD                    = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/perfect_sword"),           "Perfect Sword")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        PERFECT_BLADE                    = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/perfect_blade"),           "Perfect Blade")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        SUBSPACE_LANCE                   = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/subspace_lance"),          "Subspace Lance")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        ABSOLUTION                       = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/absolution"),              "Absolution")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        FREEDOM_SWORN                    = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/freedom_sworn"),           "Freedom Sworn")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        REDHORN_STONETHRESHER            = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/redhorn_stonethresher"),   "Redhorn Stonethresher")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        WOLFS_GRAVESTONE                 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/wolfs_gravestone"),        "Wolf's Gravestone")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
                           // Unique
        LEGACY_OF_FLAMESCION             = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/legacy_of_flamescion"),    "Legacy of Flamescifix/on")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        SPEAR_OF_THE_VOID                = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/spear_of_the_void"),       "Spear of the Void")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        SWORD_THAT_SEALS_THE_DARKNESS    = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/master_sword"),            "Sword That Seals the Darkness")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        SLICE_OF_CHEESE                  = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/slice_of_cheese"),         "Slice of Cheese")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        SLIME_BUSTER                     = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/slime_buster"),            "Slime Buster")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        LUTEY_BOI                        = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/luter_boi"),               "Lutey Boi")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        GLIZZY_GLADIUS                   = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/hotdog_candle"),           "Glizzy Gladius")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        TOUKABOU_SHIGURE                 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/toukabou_shigure"),        "Toukabou Shigure")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        MANASTEEL_SWORD                  = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/manasteel_sword"),         "Manasteel Sword")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        TERRASTEEL_SWORD                 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/terrasteel_sword"),        "Terrasteel Sword")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        ELEMENTIUM_SWORD                 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/elementium_sword"),        "Elementium Sword")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));








        /* Vanilla */
        SWORD_0 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/sword_0"), "Life Knight")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        SWORD_1 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/sword_1"), "Ornate Knight")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        SWORD_2 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/sword_2"), "Gilded Knight")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        SWORD_3 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/sword_3"), "Treasure Knight")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        SWORD_4 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/fix/sword_4"), "Soul Knight")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        SWORD_5 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/fix/sword_5"), "Wealthy Knight")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        SWORD_6 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/fix/sword_6"), "Altar Knight")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        SWORD_7 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/fix/sword_7"), "Spirit Knight")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        ALLIUMBLADE = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/alliumblade"), "Alliumblade")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        BASEBALL_BAT = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/baseball_bat"), "Baseball Bat")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        CHAINSWORD = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/chainsword"), "Chainsword")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        DARK_BLADE = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/dark_blade"), "Dark Blade")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        SOUL_SWORD = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/soul_sword"), "Soul Sword")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        SOUL_SWORD_GREEN = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/soul_sword_green"), "Soul Sword (Green)")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        SOUL_SWORD_BLUE = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/soul_sword_blue"), "Soul Sword (Blue)")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        RED_KATANA = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/red_katana"), "Red Katana")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        NIGHTFALL = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/nightfall"), "Nightfall")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        DEATHS_DOOR = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/deaths_door"), "Death's Door")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        GLADIUS = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/gladius"), "Gladius Sword")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        VELARAS_GREATSWORD = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/velaras_greatsword"), "Velara's Greatsword")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        WENDARRS_GREATSWORD = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/wendarrs_greatsword"), "Wendarr's Greatsword")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        IDONAS_SWORD = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/idonas_sword"), "Idona's Sword")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        CRYSTALLISED_BLADE = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/crystallised_blade"), "Crystallised Blade")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        DOUBLE_BLADE = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/double_blade"), "Double Blade")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        DOUWSWORDS_SWOUSKY = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/douwswords_swousky"), "Douwsword's Swousky")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        KINDLED_BLADE = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/kindled_blade"), "Kindled Blade")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        MOONSHINE = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/moonshine"), "Moonshine")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        PLATE_PIERCER = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/plate_piercer"), "Plate Piercer")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        REFRACTED_BLADE = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/refracted_blade"), "Refracted Blade")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        RING_BLADE = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/ring_blade"), "Ring Blade")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        SKALLIFIED_SWORD = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/skallified_sword"), "Skallified Sword")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        SWAXE = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/swaxe"), "Swaxe")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        TARNISHED_BLADE = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/tarnished_blade"), "Tarnished Blade")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        TRIBAL_BLADE = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/tribal_blade"), "Tribal Blade")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        GLOREM_GLIPSUM = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/glorem_glipsum"), "Glorem Glipsum")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        BAMBOO = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/bamboo"), "Bamboo")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        CUTLASS = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/cutlass"), "Cutlass")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        HONEY_WAND = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/honey_wand"), "Honey Wand")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        GODSWORD = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/godsword"), "Godsword")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        SOULFLAME = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/soulflame"), "Soulflame Blade")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));

    }
}