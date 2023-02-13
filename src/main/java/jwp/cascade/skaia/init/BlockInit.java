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

    //Dirts
    public static final RegistryObject<Block> AETHER_DIRT = BLOCKS.register("aether_dirt", () -> new Block(Block.Properties.copy(Blocks.DIRT)));
    public static final RegistryObject<Block> COARSE_AETHER_DIRT = BLOCKS.register("coarse_aether_dirt", () -> new Block(Block.Properties.copy(Blocks.COARSE_DIRT)));
    public static final RegistryObject<GrassBlock> AETHER_GRASS_BLOCK = BLOCKS.register("aether_grass_block", () -> new GrassBlock(Block.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<GrassBlock> ENCHANTED_AETHER_GRASS_BLOCK = BLOCKS.register("enchanted_aether_grass_block", () -> new GrassBlock(Block.Properties.copy(Blocks.GRASS_BLOCK)));
    public static final RegistryObject<DirtPathBlock> AETHER_DIRT_PATH = BLOCKS.register("aether_dirt_path", () -> new DirtPathBlock(Block.Properties.copy(Blocks.DIRT_PATH)));

    //Other
    public static final RegistryObject<Block> CLOUDWOOL = BLOCKS.register("cloudwool", () -> new Block(Block.Properties.copy(Blocks.WHITE_WOOL)));
    public static final RegistryObject<Block> QUICKSOIL = BLOCKS.register("quicksoil", () -> new Block(Block.Properties.copy(Blocks.SAND).friction(1.2f)));

    //Woods
    public static final RegistryObject<Block> SKYROOT_LEAVES = BLOCKS.register("skyroot_leaves", () -> new Block(Block.Properties.of(Material.LEAVES, MaterialColor.GRASS).strength(0.2F).sound(SoundType.GRASS).noOcclusion()));
//    public static final RegistryObject<RotatedPillarBlock>

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
