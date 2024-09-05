package com.jwp.skaia_vh.mixins;

import iskallia.vault.VaultMod;
import iskallia.vault.dynamodel.DynamicModelProperties;
import iskallia.vault.dynamodel.model.item.HandHeldModel;
import iskallia.vault.init.ModDynamicModels;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import static iskallia.vault.init.ModDynamicModels.Axes.REGISTRY;

@Mixin(value = ModDynamicModels.Axes.class)
public class MixinAxes {
    @Shadow
    public static final HandHeldModel AXE_0 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/axe_0"), "Diamond Warrior")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
    @Shadow
    public static final HandHeldModel AXE_1 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/axe_1"), "Aquamarine Warrior")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
    @Shadow
    public static final HandHeldModel AXE_2 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/axe_2"), "Sapphire Warrior")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
    @Shadow
    public static final HandHeldModel AXE_3 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/axe_3"), "Amethyst Warrior")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
    @Shadow
    public static final HandHeldModel AXE_4 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/axe_4"), "Opal Warrior")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
    @Shadow
    public static final HandHeldModel AXE_5 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/axe_5"), "Ruby Warrior")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
    @Shadow
    public static final HandHeldModel AXE_6 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/axe_6"), "Jade Warrior")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
    @Shadow
    public static final HandHeldModel AXE_7 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/axe_7"), "Garnet Warrior")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
    @Shadow
    public static final HandHeldModel AXE_8 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/axe_8"), "Sugilite Warrior")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
    @Shadow
    public static final HandHeldModel AXE_9 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/axe_9"), "Berserker of Essence")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
    @Shadow
    public static final HandHeldModel AXE_10 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/axe_10"), "Berserker of Dawn")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
    @Shadow
    public static final HandHeldModel AXE_11 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/axe_11"), "Berserker of Souls")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
    @Shadow
    public static final HandHeldModel AXE_12 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/axe_12"), "Berserker of Depths")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
    @Shadow
    public static final HandHeldModel AXE_13 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/axe/axe_13"), "Berserker of Life")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));

}
