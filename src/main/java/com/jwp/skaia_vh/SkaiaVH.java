package com.jwp.skaia_vh;

import com.jwp.skaia_vh.api.discoverylogic.goal.SkaiaModelDiscoveryGoals;
import com.jwp.skaia_vh.api.registry.CustomVaultGearRegistry;
import com.jwp.skaia_vh.events.SkaiaCommonEvents;
import com.jwp.skaia_vh.init.ModBlocks;
import com.mojang.logging.LogUtils;
import com.jwp.skaia_vh.init.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(SkaiaVH.MOD_ID)
public class SkaiaVH
{
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MOD_ID = "skaia_vh";
    public SkaiaVH()
    {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);

        final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        ModItems.ITEMS.register(modEventBus);
        ModBlocks.BLOCKS.register(modEventBus);
        CustomVaultGearRegistry.registerAllGearEntries();

//        SkaiaSoundEvents.register(modEventBus);
//        EntityInit.ENTITY_TYPES.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
//        ItemBlockRenderTypes.setRenderLayer(BlockInit.QUICKSOIL_GLASS.get(), RenderType.translucent());
//        ItemBlockRenderTypes.setRenderLayer(BlockInit.COLD_AERCLOUD.get(), RenderType.translucent());
//        ItemBlockRenderTypes.setRenderLayer(BlockInit.WHITE_FLOWER.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(BlockInit.PURPLE_FLOWER.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(BlockInit.AMBROSIUM_TORCH.get(), RenderType.cutout());
//        ItemBlockRenderTypes.setRenderLayer(BlockInit.AMBROSIUM_WALL_TORCH.get(), RenderType.cutout());

        SkaiaCommonEvents.init();
        SkaiaModelDiscoveryGoals.init();
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // Some example code to dispatch IMC to another mod
        InterModComms.sendTo(SkaiaVH.MOD_ID, "helloworld", () -> { LOGGER.info("Hello world from the MDK"); return "Hello world";});
    }

    private void processIMC(final InterModProcessEvent event)
    {
        // Some example code to receive and process InterModComms from other mods
        LOGGER.info("Got IMC {}", event.getIMCStream().
                map(m->m.messageSupplier().get()).
                collect(Collectors.toList()));
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents
    {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent)
        {
            // Register a new block here
            LOGGER.info("HELLO from Register Block");
        }
    }
}
