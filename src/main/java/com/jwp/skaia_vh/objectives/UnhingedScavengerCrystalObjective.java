package com.jwp.skaia_vh.objectives;

import com.google.gson.JsonObject;
import iskallia.vault.block.VaultCrateBlock;
import iskallia.vault.core.data.adapter.Adapters;
import iskallia.vault.core.random.RandomSource;
import iskallia.vault.core.vault.ClassicPortalLogic;
import iskallia.vault.core.vault.Vault;
import iskallia.vault.core.vault.VaultLevel;
import iskallia.vault.core.vault.objective.*;
import iskallia.vault.item.crystal.CrystalData;
import iskallia.vault.item.crystal.objective.CrystalObjective;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.TooltipFlag;

import java.util.List;
import java.util.Optional;

public class UnhingedScavengerCrystalObjective extends CrystalObjective {
    public UnhingedScavengerCrystalObjective(float objectiveProbability) {
        this.objectiveProbability = objectiveProbability;
    }
    protected float objectiveProbability;
    public UnhingedScavengerCrystalObjective() {}
    public void configure(Vault vault, RandomSource random) {
        int level = ((VaultLevel)vault.get(Vault.LEVEL)).get();
        vault.ifPresent(Vault.OBJECTIVES, objectives -> {
            objectives.add(UnhingedScavengerObjective.of(this.objectiveProbability, UnhingedScavengerObjective.Config.DEFAULT).add((Objective) AwardCrateObjective.ofConfig(VaultCrateBlock.Type.SCAVENGER, "unhinged_scavenger", level, true)).add((Objective) VictoryObjective.of(300)));
            objectives.add((Objective) BailObjective.create(true, new ResourceLocation[] { ClassicPortalLogic.EXIT }));
            objectives.add((Objective) DeathObjective.create(true));
            objectives.set(Objectives.KEY, CrystalData.OBJECTIVE.getType(this));
        });
    }
    public void addText(List<Component> tooltip, TooltipFlag flag, float time) {
        tooltip.add((new TextComponent("Objective: "))
            .append((Component)(new TextComponent("Unhinged Scavenger Hunt"))
            .withStyle(Style.EMPTY.withColor((Integer)getColor(time).orElseThrow()))));
    }
    public Optional<Integer> getColor(float time) {
        return Optional.of(Integer.valueOf(3771264));
    }
    public Optional<CompoundTag> writeNbt() {
        CompoundTag nbt = new CompoundTag();
        Adapters.FLOAT.writeNbt(Float.valueOf(this.objectiveProbability)).ifPresent(tag -> nbt.put("objective_probability", tag));
        return Optional.of(nbt);
    }
    public void readNbt(CompoundTag nbt) {
        this.objectiveProbability = ((Float) Adapters.FLOAT.readNbt(nbt.get("objective_probability")).orElse(Float.valueOf(0.0F))).floatValue();
    }
    public Optional<JsonObject> writeJson() {
        JsonObject json = new JsonObject();
        Adapters.FLOAT.writeJson(Float.valueOf(this.objectiveProbability)).ifPresent(tag -> json.add("objective_probability", tag));
        return Optional.of(json);
    }
    public void readJson(JsonObject json) {
        this.objectiveProbability = ((Float)Adapters.FLOAT.readJson(json.get("objective_probability")).orElse(Float.valueOf(0.0F))).floatValue();
    }

    @Override
    public void addText(List<Component> tooltip, int minIndex, TooltipFlag flag, float time) {
        tooltip.add((new TextComponent("Objective: ")).append((new TextComponent("Unhinged Scavenger Hunt")).withStyle(Style.EMPTY.withColor((Integer)this.getColor(time).orElseThrow()))));
    }
}