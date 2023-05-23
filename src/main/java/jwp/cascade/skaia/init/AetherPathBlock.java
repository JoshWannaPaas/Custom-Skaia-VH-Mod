package jwp.cascade.skaia.init;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DirtPathBlock;
import net.minecraft.world.level.block.FarmBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.Random;

public class AetherPathBlock extends DirtPathBlock {
    protected static final VoxelShape SHAPE = AetherFarmBlock.SHAPE;

    public AetherPathBlock(Properties p_153129_) {
        super(p_153129_);
    }

    @Override
    public void tick(BlockState p_153133_, ServerLevel p_153134_, BlockPos p_153135_, Random p_153136_) {
        AetherFarmBlock.turnToDirt(p_153133_, p_153134_, p_153135_);
    }


}
