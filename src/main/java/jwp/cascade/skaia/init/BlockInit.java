package jwp.cascade.skaia.init;

import jwp.cascade.skaia.SkaiaMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
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
public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SkaiaMod.MOD_ID);

    /*-----------------Dirts-----------------*/
    public static final RegistryObject<Block>           AETHER_DIRT                     = BLOCKS.register("aether_dirt",                    () -> new         Block(Block.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block>           COARSE_AETHER_DIRT              = BLOCKS.register("coarse_aether_dirt",             () -> new         Block(Block.Properties.copy(Blocks.COARSE_DIRT)));
    public static final RegistryObject<GrassBlock>      AETHER_GRASS_BLOCK              = BLOCKS.register("aether_grass_block",             () -> new    GrassBlock(Block.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<GrassBlock>      ENCHANTED_AETHER_GRASS_BLOCK    = BLOCKS.register("enchanted_aether_grass_block",   () -> new    GrassBlock(Block.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<DirtPathBlock>   AETHER_DIRT_PATH                = BLOCKS.register("aether_dirt_path",               () -> new DirtPathBlock(Block.Properties.copy(Blocks.DIRT_PATH)));
    
    
    /*-----------------Plants-----------------*/
//    public static final RegistryObject<FlowerBlock> WHITE_FLOWER = BLOCKS.register("white_flower", () -> new FlowerBlock(Block.Properties.copy(Blocks.POPPY)));


    /*-----------------Other-----------------*/
    public static final RegistryObject<Block>       CLOUDWOOL           = BLOCKS.register("cloudwool",          () -> new      Block(Block.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block>       QUICKSOIL           = BLOCKS.register("quicksoil",          () -> new      Block(Block.Properties.copy(Blocks.SAND).friction(1.15f)));
    public static final RegistryObject<GlassBlock>  QUICKSOIL_GLASS     = BLOCKS.register("quicksoil_glass",          () -> new GlassBlock(Block.Properties.copy(Blocks.GLASS)));
    public static final RegistryObject<Block>       UNSTABLE_OBSIDIAN   = BLOCKS.register("unstable_obsidian",  () -> new      Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN)));
//    public static final RegistryObject<TorchBlock> AMBROSIUM_TORCH = BLOCKS.register("ambrosium_torch", () -> new TorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH)));
    
    /*-----------------Woods-----------------*/
    public static final RegistryObject<LeavesBlock>         SKYROOT_LEAVES           = BLOCKS.register("skyroot_leaves",            () -> new        LeavesBlock(Block.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<RotatedPillarBlock>  SKYROOT_LOG              = BLOCKS.register("skyroot_log",               () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<RotatedPillarBlock>  SKYROOT_WOOD             = BLOCKS.register("skyroot_wood",              () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<RotatedPillarBlock>  STRIPPED_SKYROOT_LOG     = BLOCKS.register("stripped_skyroot_log",      () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<RotatedPillarBlock>  STRIPPED_SKYROOT_WOOD    = BLOCKS.register("stripped_skyroot_wood",     () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block>               SKYROOT_PLANKS           = BLOCKS.register("skyroot_planks",            () -> new              Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<FenceBlock>          SKYROOT_FENCE            = BLOCKS.register("skyroot_fence",             () -> new         FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<FenceGateBlock>      SKYROOT_FENCE_GATE       = BLOCKS.register("skyroot_fence_gate",        () -> new     FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE)));
    public static final RegistryObject<SlabBlock>           SKYROOT_SLAB             = BLOCKS.register("skyroot_slab",              () -> new          SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<StairBlock>          SKYROOT_STAIRS           = BLOCKS.register("skyroot_stairs",            () -> new         StairBlock(() -> SKYROOT_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<LeavesBlock>         CRYSTAL_FRUIT_LEAVES     = BLOCKS.register("crystal_fruit_leaves",      () -> new        LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<LeavesBlock>         CRYSTAL_LEAVES           = BLOCKS.register("crystal_leaves",            () -> new        LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<LeavesBlock>         HOLIDAY_LEAVES           = BLOCKS.register("holiday_leaves",            () -> new        LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<LeavesBlock>         DECORATED_HOLIDAY_LEAVES = BLOCKS.register("decorated_holiday_leaves",  () -> new        LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<LeavesBlock>         GOLDEN_OAK_LEAVES        = BLOCKS.register("golden_oak_leaves",         () -> new        LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));
    public static final RegistryObject<RotatedPillarBlock>  GOLDEN_OAK_LOG           = BLOCKS.register("golden_oak_log",            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<RotatedPillarBlock>  GOLDEN_OAK_WOOD          = BLOCKS.register("golden_oak_wood",           () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block>               SKYROOT_BOOKSHELF        = BLOCKS.register("skyroot_bookshelf",         () -> new              Block(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF)));

    /*-----------------Stones-----------------*/
    public static final RegistryObject<Block>      HOLYSTONE_BOOKSHELF           = BLOCKS.register("holystone_bookshelf",         () -> new      Block(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF)));
    public static final RegistryObject<Block>      HOLYSTONE                     = BLOCKS.register("holystone",                   () -> new      Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock>  HOLYSTONE_SLAB                = BLOCKS.register("holystone_slab",              () -> new  SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<StairBlock> HOLYSTONE_STAIRS              = BLOCKS.register("holystone_stairs",            () -> new StairBlock(() -> HOLYSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<WallBlock>  HOLYSTONE_WALL                = BLOCKS.register("holystone_wall",              () -> new  WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block>      MOSSY_HOLYSTONE               = BLOCKS.register("mossy_holystone",             () -> new      Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock>  MOSSY_HOLYSTONE_SLAB          = BLOCKS.register("mossy_holystone_slab",        () -> new  SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<StairBlock> MOSSY_HOLYSTONE_STAIRS        = BLOCKS.register("mossy_holystone_stairs",      () -> new StairBlock(() -> MOSSY_HOLYSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<WallBlock>  MOSSY_HOLYSTONE_WALL          = BLOCKS.register("mossy_holystone_wall",        () -> new  WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block>      HOLYSTONE_BRICKS              = BLOCKS.register("holystone_bricks",            () -> new      Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock>  HOLYSTONE_BRICKS_SLAB         = BLOCKS.register("holystone_bricks_slab",       () -> new  SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<StairBlock> HOLYSTONE_BRICKS_STAIRS       = BLOCKS.register("holystone_bricks_stairs",     () -> new StairBlock(() -> HOLYSTONE_BRICKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<WallBlock>  HOLYSTONE_BRICKS_WALL         = BLOCKS.register("holystone_bricks_wall",       () -> new  WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block>      FADED_HOLYSTONE               = BLOCKS.register("faded_holystone",             () -> new      Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock>  FADED_HOLYSTONE_SLAB          = BLOCKS.register("faded_holystone_slab",        () -> new  SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<StairBlock> FADED_HOLYSTONE_STAIRS        = BLOCKS.register("faded_holystone_stairs",      () -> new StairBlock(() -> FADED_HOLYSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<WallBlock>  FADED_HOLYSTONE_WALL          = BLOCKS.register("faded_holystone_wall",        () -> new  WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block>      FADED_HOLYSTONE_FLAGSTONES    = BLOCKS.register("faded_holystone_flagstones",  () -> new      Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block>      FADED_HOLYSTONE_BASE_BRICKS   = BLOCKS.register("faded_holystone_base_bricks", () -> new      Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block>      HOLYSTONE_FLAGSTONES          = BLOCKS.register("holystone_flagstones",        () -> new      Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block>      HOLYSTONE_BASE_BRICKS         = BLOCKS.register("holystone_base_bricks",       () -> new      Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block>      ICESTONE                      = BLOCKS.register("icestone",                    () -> new      Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<StairBlock> ICESTONE_STAIRS               = BLOCKS.register("icestone_stairs",             () -> new StairBlock(() -> MOSSY_HOLYSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<WallBlock>  ICESTONE_WALL                 = BLOCKS.register("icestone_wall",               () -> new  WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
 
    
    /*-----------------Decorative Stones-----------------*/
    public static final RegistryObject<RotatedPillarBlock>  PILLAR                  = BLOCKS.register("pillar",                 () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_PILLAR)));
    public static final RegistryObject<Block>               ANGELIC_STONE           = BLOCKS.register("angelic_stone",          () -> new              Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock>           ANGELIC_STONE_SLAB      = BLOCKS.register("angelic_stone_slab",     () -> new          SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<StairBlock>          ANGELIC_STONE_STAIRS    = BLOCKS.register("angelic_stone_stairs",   () -> new         StairBlock(() -> HOLYSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<WallBlock>           ANGELIC_STONE_WALL      = BLOCKS.register("angelic_stone_wall",     () -> new          WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block>               LIGHT_ANGELIC_STONE     = BLOCKS.register("light_angelic_stone",    () -> new              Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block>               CARVED_STONE            = BLOCKS.register("carved_stone",           () -> new              Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock>           CARVED_STONE_SLAB       = BLOCKS.register("carved_stone_slab",      () -> new          SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<StairBlock>          CARVED_STONE_STAIRS     = BLOCKS.register("carved_stone_stairs",    () -> new         StairBlock(() -> HOLYSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<WallBlock>           CARVED_STONE_WALL       = BLOCKS.register("carved_stone_wall",      () -> new          WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block>               SENTRY_STONE            = BLOCKS.register("sentry_stone",           () -> new              Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<Block>               HELLFIRE_STONE          = BLOCKS.register("hellfire_stone",         () -> new              Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
    public static final RegistryObject<SlabBlock>           HELLFIRE_STONE_SLAB     = BLOCKS.register("hellfire_stone_slab",    () -> new          SlabBlock(BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<StairBlock>          HELLFIRE_STONE_STAIRS   = BLOCKS.register("hellfire_stone_stairs",  () -> new         StairBlock(() -> HOLYSTONE.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.STONE_SLAB)));
    public static final RegistryObject<WallBlock>           HELLFIRE_STONE_WALL     = BLOCKS.register("hellfire_stone_wall",    () -> new          WallBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICK_WALL)));
    public static final RegistryObject<Block>               LIGHT_HELLFIRE_STONE    = BLOCKS.register("light_hellfire_stone",   () -> new              Block(BlockBehaviour.Properties.copy(Blocks.STONE)));
 

















    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
        final IForgeRegistry registry = event.getRegistry();

        BLOCKS.getEntries().stream().map(RegistryObject::get).forEach( (block) -> {
            final Item.Properties properties = new Item.Properties().tab(ItemInit.SkaiaCreativeTab.instance);
            final BlockItem blockItem = new BlockItem(block, properties);
            blockItem.setRegistryName(block.getRegistryName());
            registry.register(blockItem);
        });
    }
}
