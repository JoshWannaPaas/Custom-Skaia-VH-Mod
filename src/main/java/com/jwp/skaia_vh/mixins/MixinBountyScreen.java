package com.jwp.skaia_vh.mixins;

import com.jwp.skaia_vh.api.registry.CustomVaultObjectiveRegistry;
import com.jwp.skaia_vh.api.registry.record.CustomVaultObjectiveEntry;
import iskallia.vault.client.gui.screen.bounty.BountyScreen;
import net.minecraft.network.chat.TextComponent;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;

import java.util.Map;

@Mixin(value = BountyScreen.class, remap = false)
public class MixinBountyScreen {

    @Shadow
    @Final
    @Mutable
    public static Map<String, TextComponent> OBJECTIVE_NAME;

    static {
        for(CustomVaultObjectiveEntry entry : CustomVaultObjectiveRegistry.getCustomVaultObjectiveEntries()) {
            OBJECTIVE_NAME.put(entry.id(), new TextComponent(entry.name()));
        }
    }

}
