package jwp.cascade.skaia.datagen.client;

import jwp.cascade.skaia.SkaiaMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class SkaiaItemModelProvider extends ItemModelProvider {

    public SkaiaItemModelProvider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, SkaiaMod.MOD_ID, helper);
    }

    

    @Override
    protected void registerModels() {

    }
}
