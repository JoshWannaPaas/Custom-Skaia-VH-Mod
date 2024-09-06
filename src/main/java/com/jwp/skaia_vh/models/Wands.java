package com.jwp.skaia_vh.models;

import iskallia.vault.VaultMod;
import iskallia.vault.dynamodel.DynamicModelProperties;
import iskallia.vault.dynamodel.model.item.PlainItemModel;
import iskallia.vault.dynamodel.registry.DynamicModelRegistry;

public class Wands {
    public static final DynamicModelRegistry<PlainItemModel> REGISTRY = new DynamicModelRegistry();
    public static final PlainItemModel WOODEN;
    public static final PlainItemModel ENDER;
    public static final PlainItemModel ARCHMAGE;
    public static final PlainItemModel MAGE;
    public static final PlainItemModel MASTER;
    public static final PlainItemModel TWIG;
    public static final PlainItemModel STARLIGHT;
    public static final PlainItemModel DRUID;
    public static final PlainItemModel ISKALLIUM;
    public static final PlainItemModel GORGEOUS;
    public static final PlainItemModel LUNAR;
    public static final PlainItemModel LIGHTNING;
    public static final PlainItemModel FROST;
    public static final PlainItemModel FLOWER;
    public static final PlainItemModel BOOK_OF_SHADOWS;
    public static final PlainItemModel BAGUETTE;
    public static final PlainItemModel CARROT_ON_A_WAND;
    public static final PlainItemModel CARRI_KING;
    public static final PlainItemModel SOUL;

    /*** Modded ***/
    // Epic
    public static final PlainItemModel AMOS_BOW;
    public static final PlainItemModel HAMAYUMI;


    // Omega
    public static final PlainItemModel SKYWARD_HARP;
    public static final PlainItemModel THUNDERING_PULSE;


    // Unique
    public static final PlainItemModel END_OF_THE_LINE;


    public Wands() {
    }

    static {
        /* Modded */
        AMOS_BOW = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/wand/amos_bow"), "Amos Bow")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        HAMAYUMI = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/wand/hamayumi"), "Hamayumi")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        SKYWARD_HARP = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/wand/skyward_harp"), "Skyward Harp")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        THUNDERING_PULSE = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/wand/thundering_pulse"), "Thundering Pulse")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        END_OF_THE_LINE = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/wand/end_of_the_line"), "End of the Line")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));

        /* Vanilla */
        WOODEN = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/wand/wooden"), "Wooden Wand")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        ENDER = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/wand/ender"), "Ender Wand")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        ARCHMAGE = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/wand/archmage"), "Archmage Wand")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        MAGE = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/wand/mage"), "Mage Wand")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        MASTER = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/wand/master"), "Master Wand")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        TWIG = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/wand/twig"), "Twig")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        STARLIGHT = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/wand/starlight"), "Starlight Wand")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        DRUID = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/wand/druid"), "Druid Wand")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        ISKALLIUM = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/wand/iskallium"), "Iskallium Tech Wand")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        GORGEOUS = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/wand/gorgeous"), "Gorgeous Wand")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        LUNAR = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/wand/lunar"), "Lunar Staff")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        LIGHTNING = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/wand/lightning"), "Lightning Wand")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        FROST = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/wand/frost"), "Frost Wand")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        FLOWER = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/wand/flower"), "Flower Wand")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        BOOK_OF_SHADOWS = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/wand/bookofshadows"), "Book of Shadows")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        BAGUETTE = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/wand/baguette"), "Baguette")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        CARROT_ON_A_WAND = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/wand/carrot_on_a_wand"), "Carrot on a Wand")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        CARRI_KING = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/wand/carri_king"), "Carri King Scepter")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        SOUL = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/wand/soul"), "Soul Wand")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
    }
}
