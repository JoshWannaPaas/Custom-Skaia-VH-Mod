package com.jwp.skaia_vh.api.discoverylogic.goal;

import com.jwp.skaia_vh.events.FishEvent;
import com.jwp.skaia_vh.events.SkaiaCommonEvents;
import com.jwp.skaia_vh.events.VoidLiquidInsideEvent;
import iskallia.vault.core.vault.DiscoveryGoalsManager;
import iskallia.vault.core.vault.Vault;
import iskallia.vault.core.world.storage.VirtualWorld;
import iskallia.vault.discoverylogic.goal.base.InVaultDiscoveryGoal;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class VaultFishingGoal extends InVaultDiscoveryGoal<VaultFishingGoal> {

    /**
     * Constructor for HunterAbilityGoal.
     * @param targetProgress Target progress of the goal.
     */
    public VaultFishingGoal(float targetProgress)
    {
        super(targetProgress);
    }


    /**
     * This method is used to add predicate to the list of predicates.
     * @param predicate The predicate that will be added to the list of predicates.
     * @return The PotionUseGoal goal.
     */
    public VaultFishingGoal withPredicate(Predicate<FishEvent.Data> predicate)
    {
        this.predicates.add(predicate);
        return this;
    }



    /**
     * This method is used to initialize the server side of the goal.
     * @param manager DiscoveryGoalsManager of the goal.
     * @param world VirtualWorld of the goal.
     * @param vault Vault of the goal.
     */
    public void initServer(DiscoveryGoalsManager manager, VirtualWorld world, Vault vault)
    {
        SkaiaCommonEvents.FISH_INSIDE_VAULT.
                in(world).
                register(manager, event ->
                {
                    if (this.predicates.stream().allMatch(predicate -> predicate.test(event)))
                    {
                        this.progress(event.getPlayer(), 1.0F);
                    }
                });
    }


    /**
     * The list of predicates that will be used to check if the event is valid.
     */
    protected List<Predicate<FishEvent.Data>> predicates = new LinkedList<>();
}
