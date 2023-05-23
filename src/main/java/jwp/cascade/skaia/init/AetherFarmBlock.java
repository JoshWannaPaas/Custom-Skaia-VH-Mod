package jwp.cascade.skaia.init;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FarmBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.VoxelShape;

public class AetherFarmBlock extends FarmBlock {
    protected static final VoxelShape SHAPE = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 15.0D, 16.0D);

    public AetherFarmBlock(Properties p_53247_) {
        super(p_53247_);
    }

    public static void turnToDirt(BlockState p_53297_, Level p_53298_, BlockPos p_53299_) {
        p_53298_.setBlockAndUpdate(p_53299_, pushEntitiesUp(p_53297_, BlockInit.AETHER_DIRT.get().defaultBlockState(), p_53298_, p_53299_));
    }
}
