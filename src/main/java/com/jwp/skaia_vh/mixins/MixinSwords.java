package com.jwp.skaia_vh.mixins;

import iskallia.vault.VaultMod;
import iskallia.vault.dynamodel.DynamicModelProperties;
import iskallia.vault.dynamodel.model.item.HandHeldModel;
import iskallia.vault.init.ModDynamicModels;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

import static iskallia.vault.init.ModDynamicModels.Swords.REGISTRY;

@Mixin(ModDynamicModels.Swords.class)
public class MixinSwords {
    @Shadow
    public static final HandHeldModel SWORD_0 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/sword_0"), "Life Knight")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
    @Shadow
    public static final HandHeldModel SWORD_1 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/sword_1"), " Knight")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
    @Shadow
    public static final HandHeldModel SWORD_2 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/sword_2"), " Knight")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
    @Shadow
    public static final HandHeldModel SWORD_3 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/sword_3"), " Knight")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
    @Shadow
    public static final HandHeldModel SWORD_4 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/sword_4"), " Knight")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
    @Shadow
    public static final HandHeldModel SWORD_5 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/sword_5"), " Knight")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
    @Shadow
    public static final HandHeldModel SWORD_6 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/sword_6"), " Knight")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));
    @Shadow
    public static final HandHeldModel SWORD_7 = (HandHeldModel)REGISTRY.register((HandHeldModel)(new HandHeldModel(VaultMod.id("gear/sword/sword_7"), " Knight")).properties((new DynamicModelProperties()).allowTransmogrification().discoverOnRoll()));

}
