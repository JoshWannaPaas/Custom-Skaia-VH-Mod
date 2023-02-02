package jwp.cascade.skaia.datagen;

import jwp.cascade.skaia.SkaiaMod;
import jwp.cascade.skaia.datagen.client.SkaiaBlockStateProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = SkaiaMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SkaiaDataGeneration {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();

        if (event.includeClient()) {
            // Resource Pack
            generator.addProvider(new SkaiaBlockStateProvider(generator, helper));
        }

        if (event.includeServer()) {
            // Data Pack
        }
    }


}
