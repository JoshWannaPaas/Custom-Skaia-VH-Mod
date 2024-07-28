package com.jwp.skaia_vh.items.gear;

import com.google.common.collect.Multimap;
import com.jwp.skaia_vh.models.Daggers;
import iskallia.vault.dynamodel.DynamicModel;
import iskallia.vault.gear.VaultGearClassification;
import iskallia.vault.gear.VaultGearHelper;
import iskallia.vault.gear.VaultGearRarity;
import iskallia.vault.gear.VaultGearState;
import iskallia.vault.gear.attribute.type.VaultGearAttributeTypeMerger;
import iskallia.vault.gear.crafting.ProficiencyType;
import iskallia.vault.gear.data.VaultGearData;
import iskallia.vault.gear.item.VaultGearItem;
import iskallia.vault.gear.item.VaultGearToolTier;
import iskallia.vault.gear.tooltip.GearTooltip;
import iskallia.vault.init.ModConfigs;
import iskallia.vault.init.ModGearAttributes;
import iskallia.vault.util.MiscUtils;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;
import org.jetbrains.annotations.NotNull;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class VaultDaggerItem extends SwordItem implements VaultGearItem, DyeableLeatherItem {

    public VaultDaggerItem(ResourceLocation id, Properties builder) {
        super((Tier) VaultGearToolTier.INSTANCE, 0, -2.4F, builder);
        setRegistryName(id);
    }
    @Nullable
    public ResourceLocation getRandomModel(ItemStack stack, Random random) {
        VaultGearData gearData = VaultGearData.read(stack);
        VaultGearRarity rarity = gearData.getRarity();
        EquipmentSlot intendedSlot = getIntendedSlot(stack);
        ResourceLocation possibleIds = ModConfigs.GEAR_MODEL_ROLL_RARITIES.getRandomRoll(this.defaultItem(), gearData, intendedSlot, random);
        return (ResourceLocation) MiscUtils.getRandomEntry(possibleIds);
    }
    public Optional<? extends DynamicModel<?>> resolveDynamicModel(ItemStack stack, ResourceLocation key) {
        return Daggers.REGISTRY.get(key);
    }
    @Nullable
    public EquipmentSlot getIntendedSlot(ItemStack stack) {
        return EquipmentSlot.MAINHAND;
    }
    @NotNull
    public VaultGearClassification getClassification(ItemStack stack) {
        return VaultGearClassification.SWORD;
    }
    @Nonnull
    public ProficiencyType getCraftingProficiencyType(ItemStack stack) {
        return ProficiencyType.SWORD;
    }
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        return 1.0F;
    }
    public boolean isCorrectToolForDrops(ItemStack stack, BlockState state) {
        return false;
    }
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot slot, ItemStack stack) {
        return VaultGearHelper.getModifiers(stack, slot);
    }
    public boolean shouldCauseReequipAnimation(ItemStack oldStack, ItemStack newStack, boolean slotChanged) {
        return VaultGearHelper.shouldPlayGearReequipAnimation(oldStack, newStack, slotChanged);
    }
    public void fillItemCategory(CreativeModeTab group, NonNullList<ItemStack> items) {
        if (allowdedIn(group)) {
            items.add(defaultItem());
        }
    }
    public int getDefaultTooltipHideFlags(@NotNull ItemStack stack) {
        return super.getDefaultTooltipHideFlags(stack) | ItemStack.TooltipPart.MODIFIERS.getMask();
    }
    public boolean isRepairable(ItemStack stack) {
        return false;
    }
    public boolean isDamageable(ItemStack stack) {
        return (VaultGearData.read(stack).getState() == VaultGearState.IDENTIFIED);
    }
    public int getMaxDamage(ItemStack stack) {
        return ((Integer)VaultGearData.read(stack).get(ModGearAttributes.DURABILITY, VaultGearAttributeTypeMerger.intSum())).intValue();
    }
    public Component getName(ItemStack stack) {
        return VaultGearHelper.getDisplayName(stack, super.getName(stack));
    }
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        return VaultGearHelper.rightClick(world, player, hand, super.use(world, player, hand));
    }
    public void inventoryTick(ItemStack stack, Level world, Entity entity, int itemSlot, boolean isSelected) {
        super.inventoryTick(stack, world, entity, itemSlot, isSelected);
        if (entity instanceof ServerPlayer) { ServerPlayer player = (ServerPlayer)entity;
            vaultGearTick(stack, player); }
    }

    @OnlyIn(Dist.CLIENT)
    public void appendHoverText(ItemStack stack, Level world, List<Component> tooltip, TooltipFlag flag) {
        super.appendHoverText(stack, world, tooltip, flag);
        tooltip.addAll(createTooltip(stack, GearTooltip.itemTooltip()));
    }
    public boolean canPerformAction(ItemStack stack, ToolAction toolAction) {
        return (ToolActions.SWORD_SWEEP == toolAction);
    }
}
