package jwp.cascade.skaia.datagen.client;

import jwp.cascade.skaia.SkaiaMod;
import jwp.cascade.skaia.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class SkaiaBlockStateProvider extends BlockStateProvider {

    public SkaiaBlockStateProvider(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, SkaiaMod.MOD_ID, helper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(BlockInit.AETHER_DIRT.get());
    }
}
