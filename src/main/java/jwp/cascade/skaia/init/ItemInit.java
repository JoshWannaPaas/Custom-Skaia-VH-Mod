package jwp.cascade.skaia.init;

import jwp.cascade.skaia.SkaiaMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SkaiaMod.MOD_ID);

//    public static final RegistryObject<Item> SKYROOT_STICK = ITEMS.register("skyroot_stick", () -> new Item(new Item.Properties().tab(SkaiaCreativeTab.instance)));




    //Creative Tab
    public static class SkaiaCreativeTab extends CreativeModeTab {
        private SkaiaCreativeTab(int index, String label) { super (index, label); }

        @Override
        public ItemStack makeIcon() {
            return new ItemStack(BlockInit.SKYROOT_LEAVES.get());
        }

        public static final SkaiaCreativeTab instance = new SkaiaCreativeTab(CreativeModeTab.TABS.length, "skaia");
    }
}
