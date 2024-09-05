package com.jwp.skaia_vh.models;

import iskallia.vault.VaultMod;
import iskallia.vault.dynamodel.DynamicModelProperties;
import iskallia.vault.dynamodel.model.item.PlainItemModel;
import iskallia.vault.dynamodel.registry.DynamicModelRegistry;

public class Wands {
    public static final DynamicModelRegistry<PlainItemModel> REGISTRY = new DynamicModelRegistry();

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
        AMOS_BOW = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/wand/amos_bow"), "Amos Bow")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        HAMAYUMI = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/wand/hamayumi"), "Hamayumi")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        SKYWARD_HARP = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/wand/skyward_harp"), "Skyward Harp")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        THUNDERING_PULSE = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/wand/thundering_pulse"), "Thundering Pulse")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
        END_OF_THE_LINE = (PlainItemModel)REGISTRY.register((PlainItemModel)(new PlainItemModel(VaultMod.id("gear/wand/end_of_the_line"), "End of the Line")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
    }
}
