package com.jwp.skaia_vh.init;

import com.jwp.skaia_vh.SkaiaVH;
import com.jwp.skaia_vh.blocks.AercloudBlock;
import com.jwp.skaia_vh.blocks.AetherGrassBlock;
import com.jwp.skaia_vh.blocks.AetherPathBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
//import net.minecraft.world.level.block.state.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SkaiaVH.MOD_ID);

    /*-----------------Dirts-----------------*/
    public static final RegistryObject<Block>           AETHER_DIRT                       = BLOCKS.register("aether_dirt",                  () -> new              Block(Block.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block>           COARSE_AETHER_DIRT                = BLOCKS.register("coarse_aether_dirt",           () -> new              Block(Block.Properties.copy(Blocks.COARSE_DIRT)));
    public static final RegistryObject<GrassBlock>      AETHER_GRASS_BLOCK                = BLOCKS.register("aether_grass_block",           () -> new AetherGrassBlock(Block.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<GrassBlock>      ENCHANTED_AETHER_GRASS_BLOCK      = BLOCKS.register("enchanted_aether_grass_block", () -> new   AetherGrassBlock(Block.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<DirtPathBlock>   AETHER_DIRT_PATH                  = BLOCKS.register("aether_dirt_path",             () -> new AetherPathBlock(Block.Properties.copy(Blocks.DIRT_PATH)));
    
    
    /*-----------------Plants-----------------*/
   public static final RegistryObject<FlowerBlock>          WHITE_FLOWER                  = BLOCKS.register("white_flower",                 () -> new        FlowerBlock(MobEffects.NIGHT_VISION, 5, Block.Properties.copy(Blocks.POPPY).lightLevel(ModBlocks::lightLevel5)));
   public static final RegistryObject<FlowerBlock>          PURPLE_FLOWER                 = BLOCKS.register("purple_flower",                () -> new        FlowerBlock(MobEffects.NIGHT_VISION, 5, Block.Properties.copy(Blocks.POPPY).lightLevel(ModBlocks::lightLevel5)));


    /*-----------------Other-----------------*/
    public static final RegistryObject<Block>               CLOUDWOOL                     = BLOCKS.register("cloudwool",                    () -> new              Block(Block.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block>               QUICKSOIL                     = BLOCKS.register("quicksoil",                    () -> new              Block(Block.Properties.copy(Blocks.SAND).friction(1.15f)));
    public static final RegistryObject<GlassBlock>          QUICKSOIL_GLASS               = BLOCKS.register("quicksoil_glass",              () -> new         GlassBlock(Block.Properties  .of(Material.GLASS, MaterialColor.COLOR_YELLOW).strength(0.3F).friction(1.1F).lightLevel(ModBlocks::lightLevel11).sound(SoundType.GLASS).noOcclusion().isValidSpawn(ModBlocks::never).isRedstoneConductor(ModBlocks::never).isSuffocating(ModBlocks::never).isViewBlocking(ModBlocks::never)));
    public static final RegistryObject<Block>               UNSTABLE_OBSIDIAN             = BLOCKS.register("unstable_obsidian",            () -> new              Block(Block.Properties.copy(Blocks.OBSIDIAN).lightLevel(ModBlocks::lightLevel11)));
    public static final RegistryObject<Block>               AMBROSIUM_WALL_TORCH          = BLOCKS.register("ambrosium_wall_torch",         () -> new     WallTorchBlock(Block.Properties.copy(Blocks.WALL_TORCH).lightLevel(ModBlocks::lightLevel14), ParticleTypes.END_ROD));
    public static final RegistryObject<Block>               AMBROSIUM_TORCH               = BLOCKS.register("ambrosium_torch",              () -> new         TorchBlock(Block.Properties.copy(Blocks.TORCH).lightLevel(ModBlocks::lightLevel14), ParticleTypes.END_ROD));
    public static final RegistryObject<AercloudBlock>       COLD_AERCLOUD                 = BLOCKS.register("cold_aercloud",                () -> new      AercloudBlock(Block.Properties.of(Material.ICE, MaterialColor.SNOW).strength(0.2F).sound(SoundType.WOOL).noOcclusion().dynamicShape().isRedstoneConductor(ModBlocks::never).isSuffocating(ModBlocks::never).isViewBlocking(ModBlocks::never)));


    /*-----------------Woods-----------------*/
    public static final RegistryObject<LeavesBlock>         SKYROOT_LEAVES                = BLOCKS.register("skyroot_leaves",               () -> new        LeavesBlock(Block.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<RotatedPillarBlock>  SKYROOT_LOG                   = BLOCKS.register("skyroot_log",                  () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<RotatedPillarBlock>  SKYROOT_WOOD                  = BLOCKS.register("skyroot_wood",                 () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<RotatedPillarBlock>  STRIPPED_SKYROOT_LOG          = BLOCKS.register("stripped_skyroot_log",         () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<RotatedPillarBlock>  STRIPPED_SKYROOT_WOOD         = BLOCKS.register("stripped_skyroot_wood",        () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block>               SKYROOT_PLANKS                = BLOCKS.register("skyroot_planks",               () -> new              Block(Block.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<FenceBlock>          SKYROOT_FENCE                 = BLOCKS.register("skyroot_fence",                () -> new         FenceBlock(Block.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<FenceGateBlock>      SKYROOT_FENCE_GATE            = BLOCKS.register("skyroot_fence_gate",           () -> new     FenceGateBlock(Block.Properties.copy(Blocks.OAK_FENCE_GATE)));
    public static final RegistryObject<SlabBlock>           SKYROOT_SLAB                  = BLOCKS.register("skyroot_slab",                 () -> new          SlabBlock(Block.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<StairBlock>          SKYROOT_STAIRS                = BLOCKS.register("skyroot_stairs",               () -> new         StairBlock(() -> SKYROOT_PLANKS.get().defaultBlockState(), Block.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<LeavesBlock>         CRYSTAL_FRUIT_LEAVES          = BLOCKS.register("crystal_fruit_leaves",         () -> new        LeavesBlock(Block.Properties.copy(Blocks.OAK_LEAVES).lightLevel(ModBlocks::lightLevel9)));
    public static final RegistryObject<LeavesBlock>         CRYSTAL_LEAVES                = BLOCKS.register("crystal_leaves",               () -> new        LeavesBlock(Block.Properties.copy(Blocks.OAK_LEAVES).lightLevel(ModBlocks::lightLevel9)));
    public static final RegistryObject<LeavesBlock>         HOLIDAY_LEAVES                = BLOCKS.register("holiday_leaves",               () -> new        LeavesBlock(Block.Properties.copy(Blocks.OAK_LEAVES).lightLevel(ModBlocks::lightLevel9)));
    public static final RegistryObject<LeavesBlock>         DECORATED_HOLIDAY_LEAVES      = BLOCKS.register("decorated_holiday_leaves",     () -> new        LeavesBlock(Block.Properties.copy(Blocks.OAK_LEAVES).lightLevel(ModBlocks::lightLevel9)));
    public static final RegistryObject<LeavesBlock>         GOLDEN_OAK_LEAVES             = BLOCKS.register("golden_oak_leaves",            () -> new        LeavesBlock(Block.Properties.copy(Blocks.OAK_LEAVES).lightLevel(ModBlocks::lightLevel9)));
    public static final RegistryObject<RotatedPillarBlock>  GOLDEN_OAK_LOG                = BLOCKS.register("golden_oak_log",               () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<RotatedPillarBlock>  GOLDEN_OAK_WOOD               = BLOCKS.register("golden_oak_wood",              () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block>               SKYROOT_BOOKSHELF             = BLOCKS.register("skyroot_bookshelf",            () -> new              Block(Block.Properties.copy(Blocks.BOOKSHELF)));

    /*-----------------Stones-----------------*/
    public static final RegistryObject<Block>               HOLYSTONE_BOOKSHELF           = BLOCKS.register("holystone_bookshelf",          () -> new              Block(Block.Properties.copy(Blocks.BOOKSHELF)));
    public static final RegistryObject<Block>               HOLYSTONE                     = BLOCKS.register("holystone",                    () -> new              Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock>           HOLYSTONE_SLAB                = BLOCKS.register("holystone_slab",               () -> new          SlabBlock(Block.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<StairBlock>          HOLYSTONE_STAIRS              = BLOCKS.register("holystone_stairs",             () -> new         StairBlock(() -> HOLYSTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<WallBlock>           HOLYSTONE_WALL                = BLOCKS.register("holystone_wall",               () -> new          WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block>               MOSSY_HOLYSTONE               = BLOCKS.register("mossy_holystone",              () -> new              Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock>           MOSSY_HOLYSTONE_SLAB          = BLOCKS.register("mossy_holystone_slab",         () -> new          SlabBlock(Block.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<StairBlock>          MOSSY_HOLYSTONE_STAIRS        = BLOCKS.register("mossy_holystone_stairs",       () -> new         StairBlock(() -> MOSSY_HOLYSTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<WallBlock>           MOSSY_HOLYSTONE_WALL          = BLOCKS.register("mossy_holystone_wall",         () -> new          WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block>               HOLYSTONE_BRICKS              = BLOCKS.register("holystone_bricks",             () -> new              Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock>           HOLYSTONE_BRICKS_SLAB         = BLOCKS.register("holystone_bricks_slab",        () -> new          SlabBlock(Block.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<StairBlock>          HOLYSTONE_BRICKS_STAIRS       = BLOCKS.register("holystone_bricks_stairs",      () -> new         StairBlock(() -> HOLYSTONE_BRICKS.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<WallBlock>           HOLYSTONE_BRICKS_WALL         = BLOCKS.register("holystone_bricks_wall",        () -> new          WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block>               FADED_HOLYSTONE               = BLOCKS.register("faded_holystone",              () -> new              Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock>           FADED_HOLYSTONE_SLAB          = BLOCKS.register("faded_holystone_slab",         () -> new          SlabBlock(Block.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<StairBlock>          FADED_HOLYSTONE_STAIRS        = BLOCKS.register("faded_holystone_stairs",       () -> new         StairBlock(() -> FADED_HOLYSTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<WallBlock>           FADED_HOLYSTONE_WALL          = BLOCKS.register("faded_holystone_wall",         () -> new          WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block>               FADED_HOLYSTONE_FLAGSTONES    = BLOCKS.register("faded_holystone_flagstones",   () -> new              Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block>               FADED_HOLYSTONE_BASE_BRICKS   = BLOCKS.register("faded_holystone_base_bricks",  () -> new              Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block>               HOLYSTONE_FLAGSTONES          = BLOCKS.register("holystone_flagstones",         () -> new              Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block>               HOLYSTONE_BASE_BRICKS         = BLOCKS.register("holystone_base_bricks",        () -> new              Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block>               ICESTONE                      = BLOCKS.register("icestone",                     () -> new              Block(Block.Properties.of(Material.STONE, MaterialColor.ICE).strength(3.0F).randomTicks().sound(SoundType.GLASS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block>               ICESTONE_SLAB                 = BLOCKS.register("icestone_slab",                () -> new          SlabBlock(Block.Properties.of(Material.STONE, MaterialColor.ICE).strength(3.0F).randomTicks().sound(SoundType.GLASS).requiresCorrectToolForDrops()));
    public static final RegistryObject<StairBlock>          ICESTONE_STAIRS               = BLOCKS.register("icestone_stairs",              () -> new         StairBlock(() -> MOSSY_HOLYSTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE_SLAB).strength(3.0F).randomTicks().sound(SoundType.GLASS).requiresCorrectToolForDrops()));
    public static final RegistryObject<WallBlock>           ICESTONE_WALL                 = BLOCKS.register("icestone_wall",                () -> new          WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL).strength(3.0F).randomTicks().sound(SoundType.GLASS).requiresCorrectToolForDrops()));
 
    
    /*-----------------Decorative Stones-----------------*/
    public static final RegistryObject<RotatedPillarBlock>  PILLAR                        = BLOCKS.register("pillar",                       () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.PURPUR_PILLAR)));
    public static final RegistryObject<Block>               ANGELIC_STONE                 = BLOCKS.register("angelic_stone",                () -> new              Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock>           ANGELIC_STONE_SLAB            = BLOCKS.register("angelic_stone_slab",           () -> new          SlabBlock(Block.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<StairBlock>          ANGELIC_STONE_STAIRS          = BLOCKS.register("angelic_stone_stairs",         () -> new         StairBlock(() -> HOLYSTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<WallBlock>           ANGELIC_STONE_WALL            = BLOCKS.register("angelic_stone_wall",           () -> new          WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block>               LIGHT_ANGELIC_STONE           = BLOCKS.register("light_angelic_stone",          () -> new              Block(Block.Properties.copy(Blocks.STONE).lightLevel(ModBlocks::lightLevel11)));
    public static final RegistryObject<Block>               CARVED_STONE                  = BLOCKS.register("carved_stone",                 () -> new              Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock>           CARVED_STONE_SLAB             = BLOCKS.register("carved_stone_slab",            () -> new          SlabBlock(Block.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<StairBlock>          CARVED_STONE_STAIRS           = BLOCKS.register("carved_stone_stairs",          () -> new         StairBlock(() -> HOLYSTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<WallBlock>           CARVED_STONE_WALL             = BLOCKS.register("carved_stone_wall",            () -> new          WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block>               SENTRY_STONE                  = BLOCKS.register("sentry_stone",                 () -> new              Block(Block.Properties.copy(Blocks.STONE).lightLevel(ModBlocks::lightLevel11)));
    public static final RegistryObject<Block>               HELLFIRE_STONE                = BLOCKS.register("hellfire_stone",               () -> new              Block(Block.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock>           HELLFIRE_STONE_SLAB           = BLOCKS.register("hellfire_stone_slab",          () -> new          SlabBlock(Block.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<StairBlock>          HELLFIRE_STONE_STAIRS         = BLOCKS.register("hellfire_stone_stairs",        () -> new         StairBlock(() -> HOLYSTONE.get().defaultBlockState(), Block.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<WallBlock>           HELLFIRE_STONE_WALL           = BLOCKS.register("hellfire_stone_wall",          () -> new          WallBlock(Block.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block>               LIGHT_HELLFIRE_STONE          = BLOCKS.register("light_hellfire_stone",         () -> new              Block(Block.Properties.copy(Blocks.STONE).lightLevel(ModBlocks::lightLevel11)));
 



    private static boolean never(BlockState p_test_1_, BlockGetter p_test_2_, BlockPos p_test_3_) {
        return false;
    }

    private static boolean always(BlockState p_test_1_, BlockGetter p_test_2_, BlockPos p_test_3_) {
        return true;
    }

    private static <A> boolean never(BlockState p_test_1_, BlockGetter p_test_2_, BlockPos p_test_3_, A p_test_4_) {
        return false;
    }

    private static int lightLevel5(BlockState state) {
        return 5;
    }


    private static int lightLevel9(BlockState state) {
        return 9;
    }


    private static int lightLevel11(BlockState state) {
        return 11;
    }

    private static int lightLevel14(BlockState state) {
        return 14;
    }



    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry registry = event.getRegistry();

        BLOCKS.getEntries().stream().map(RegistryObject::get).forEach( (block) -> {
            if(block != AMBROSIUM_TORCH.get()) {
                final Item.Properties properties = new Item.Properties().tab(ModItems.SkaiaCreativeTab.instance);
                final BlockItem blockItem = new BlockItem(block, properties);
                blockItem.setRegistryName(block.getRegistryName());
                registry.register(blockItem);
            }else{
                final Item.Properties properties = new Item.Properties().tab(ModItems.SkaiaCreativeTab.instance);
                final StandingAndWallBlockItem blockItem = new StandingAndWallBlockItem(AMBROSIUM_TORCH.get(), AMBROSIUM_WALL_TORCH.get(), properties);
                blockItem.setRegistryName(block.getRegistryName());
                registry.register(blockItem);
            }
        });
    }
}
