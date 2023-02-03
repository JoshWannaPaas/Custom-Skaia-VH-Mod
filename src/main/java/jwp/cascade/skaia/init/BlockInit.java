package jwp.cascade.skaia.init;

import jwp.cascade.skaia.SkaiaMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GrassBlock;
import net.minecraft.world.level.block.SoundType;
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
//    public static final RegistryObject<Block> AETHER_DIRT = BLOCKS.register("aether_dirt", () -> new Block(Block.Properties.copy(Blocks.DIRT)));
//    public static final RegistryObject<Block> AETHER_GRASS_BLOCK = BLOCKS.register("aether_grass_block", () -> new Block(Block.Properties.copy(Blocks.DIRT)));
//    public static final RegistryObject<Block> ENCHANTED_AETHER_GRASS_BLOCK = BLOCKS.register("enchanted_aether_grass_block", () -> new Block(Block.Properties.copy(Blocks.DIRT)));

    //Woods
    public static final RegistryObject<Block> SKYROOT_LEAVES = BLOCKS.register("skyroot_leaves", () -> new Block(Block.Properties.of(Material.LEAVES, MaterialColor.GRASS).strength(0.2F).sound(SoundType.GRASS).noOcclusion()));

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
