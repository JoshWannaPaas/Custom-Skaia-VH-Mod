package jwp.cascade.skaia.datagen.client;

import jwp.cascade.skaia.SkaiaMod;
import jwp.cascade.skaia.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class SkaiaItemModelProvider extends ItemModelProvider {

    public SkaiaItemModelProvider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, SkaiaMod.MOD_ID, helper);
    }

    //Block items
    protected void simpleBlockItem(Item item){
        getBuilder(item.getRegistryName().toString()).parent(getExistingFile(modLoc("block/" + item.getRegistryName().getPath())));
    }

    //Other Items
    protected void oneLayerItem(Item item, ResourceLocation texture) {
        ResourceLocation itemTexture = new ResourceLocation(texture.getNamespace(), "item/" + texture.getPath());
        if(existingFileHelper.exists(itemTexture, PackType.CLIENT_RESOURCES, ".png", "textures")) {
            getBuilder(item.getRegistryName().getPath()).parent(getExistingFile(mcLoc("item/generated"))).texture("layer0", itemTexture);
        } else {
            System.out.println("Texture for " + item.getRegistryName().toString() + " not present at " + itemTexture.toString());
        }
    }

    protected void oneLayerItem(Item item) {
        oneLayerItem(item, item.getRegistryName());
    }

    @Override
    protected void registerModels() {
        //Block Items
        simpleBlockItem(BlockInit.AETHER_DIRT.get().asItem());

        //Simple Items
    }
}
