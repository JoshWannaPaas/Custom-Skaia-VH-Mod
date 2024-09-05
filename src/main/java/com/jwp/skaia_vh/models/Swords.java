package com.jwp.skaia_vh.models;

import iskallia.vault.VaultMod;
import iskallia.vault.dynamodel.DynamicModelProperties;
import iskallia.vault.dynamodel.model.item.HandHeldModel;
import iskallia.vault.dynamodel.registry.DynamicModelRegistry;

public class Swords {
    public static final DynamicModelRegistry<HandHeldModel> REGISTRY = new DynamicModelRegistry<>();
    // Common


    // Rare
    public static final HandHeldModel WATCHER;                              // ShayDeeJay
    public static final HandHeldModel KEY_OF_KHAJ_NISUT;                    // Teyvat Weapon Collection

    // Epic
    public static final HandHeldModel REBELLION_MAY_CRY;                    // ShayDeeJay
    public static final HandHeldModel BEACON_OF_THE_REED_SEA;               // Teyvat Weapon Collection
    public static final HandHeldModel FAVONIUS_GREATSWORD;                  // Teyvat Weapon Collection
    public static final HandHeldModel MISTSPLITTER_REFORGED;                // Teyvat Weapon Collection
    public static final HandHeldModel PRIMORDIAL_JADE_CUTTER;               // Teyvat Weapon Collection

    // Omega
    public static final HandHeldModel SUBSPACE_LANCE;                       // ExtraBotany
    public static final HandHeldModel ABSOLUTION;                           // Teyvat Weapon Collection
    public static final HandHeldModel FREEDOM_SWORN;                        // Teyvat Weapon Collection
    public static final HandHeldModel REDHORN_STONETHRESHER;                // Teyvat Weapon Collection
    public static final HandHeldModel WOLFS_GRAVESTONE;                     // Teyvat Weapon Collection

    // Unique
    public static final HandHeldModel SPEAR_OF_THE_VOID;                    // CraftImpact - Stay in Void Liquid for 60s in a vault
    public static final HandHeldModel LEGACY_OF_FLAMESCION;                 // ExtraBotany - Kill 100 Mobs on Fire in a vault
    public static final HandHeldModel SWORD_THAT_SEALS_THE_DARKNESS;        // ShayDeeJay - ???
    public static final HandHeldModel SLICE_OF_CHEESE;                      // Breadcrumb - Unlocked with Cheese Hat
    public static final HandHeldModel SLIME_BUSTER;                         // Breadcrumb - ??? slime in a bucket?
    public static final HandHeldModel LUTER_BOI;                            // Breadcrumb - ??? maybe something with xerca
    public static final HandHeldModel BIRTHDAY_ON_A_STICK;                  // Breadcrumb - ??? cake?
    public static final HandHeldModel TOUKABOU_SHIGURA;                     // Teyvat Weapon Collection - ??? Something umbrella

    public Swords() {
    }
    static {
        /* Modded */
                                // Rare
        WATCHER                          = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/watcher"),                 "The Watcher")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        KEY_OF_KHAJ_NISUT                = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/key_of_khaj_nisut"),       "Key of Khaj Nisut")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));

                                // Epic
        REBELLION_MAY_CRY                = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/rebellion"),               "Rebellion May Cry")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        BEACON_OF_THE_REED_SEA           = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/beacon_of_the_reed_sea"),  "Beacon of the Reed Sea")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        FAVONIUS_GREATSWORD              = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/favonius_greatsword"),     "Favonious Greatsword")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        MISTSPLITTER_REFORGED            = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/mistsplitter_reforged"),   "Mistsplitter Reforged")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        PRIMORDIAL_JADE_CUTTER           = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/primordial_jade_cutter"),  "Primordial Jade Cutter")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));

                                // Omega
        SUBSPACE_LANCE                   = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/subspace_lance"),          "Subspace Lance")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        ABSOLUTION                       = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/absolution"),              "Absolution")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        FREEDOM_SWORN                    = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/freedom_sworn"),           "Freedom Sworn")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        REDHORN_STONETHRESHER            = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/redhorn_stonethresher"),   "Redhorn Stonethresher")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        WOLFS_GRAVESTONE                 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/wolfs_gravestone"),        "Wolf's Gravestone")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));

                               // Unique
        LEGACY_OF_FLAMESCION             = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/legacy_of_flamescion"),    "Legacy of Flamescion")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        SPEAR_OF_THE_VOID                = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/spear_of_the_void"),       "Spear of the Void")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        SWORD_THAT_SEALS_THE_DARKNESS    = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/master_sword"),            "Sword That Seals the Darkness")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        SLICE_OF_CHEESE                  = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/slice_of_cheese"),         "Slice of Cheese")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        SLIME_BUSTER                     = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/slime_buster"),            "Slime Buster")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        LUTER_BOI                        = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/luter_boi"),               "Lutey Boi")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        BIRTHDAY_ON_A_STICK              = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/hotdog_candle"),           "Glizzy Gladius")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        TOUKABOU_SHIGURA                 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/toukabou_shigure"),         "Toukabou Shigure")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
    }
}