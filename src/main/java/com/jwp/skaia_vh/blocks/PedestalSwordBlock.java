package com.jwp.skaia_vh.blocks;


import com.jwp.skaia_vh.events.SkaiaCommonEvents;
import com.jwp.skaia_vh.init.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.InteractionHand;


public class PedestalSwordBlock extends HorizontalDirectionalBlock {
    public static final BooleanProperty DISARMED = BlockStateProperties.DISARMED;
    public PedestalSwordBlock(BlockBehaviour.Properties pProperties) {
        super(pProperties);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(new Property[]{FACING});
        pBuilder.add(new Property[]{DISARMED});
    }

    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        return (BlockState)this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection()).setValue(DISARMED,false);
    }

    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return this.makeShape(state);
    }

    public VoxelShape makeShape(BlockState state) {
        VoxelShape shape = Shapes.empty();
        shape = Shapes.or(shape, Shapes.box(0.0, 0.0, 0.125, 1.0, 0.0625, 0.875));
        shape = Shapes.or(shape, Shapes.box(0.0625, 0.125, 0.1875, 0.9375, 0.1875, 0.8125));
        shape = Shapes.or(shape, Shapes.box(0.125, 0.25, 0.25, 0.875, 0.3125, 0.75));
        shape = Shapes.or(shape, Shapes.box(0.09375, 0.1875, 0.21875, 0.90625, 0.25, 0.78125));
        shape = Shapes.or(shape, Shapes.box(0.03125, 0.0625, 0.15625, 0.96875, 0.125, 0.84375));
        shape = Shapes.or(shape, Shapes.box(0.15625, 0.3125, 0.28125, 0.84375, 0.375, 0.71875));
        VoxelShape var10000;
        switch ((Direction)state.getValue(FACING)) {
            case SOUTH -> var10000 = this.rotateShape(shape, Direction.SOUTH);
            case EAST -> var10000 = this.rotateShape(shape, Direction.EAST);
            case WEST -> var10000 = this.rotateShape(shape, Direction.WEST);
            default -> var10000 = shape;
        }

        return var10000;
    }

    private VoxelShape rotateShape(VoxelShape shape, Direction direction) {
        VoxelShape[] buffer = new VoxelShape[]{shape, Shapes.empty()};
        int times = (direction.get2DDataValue() - Direction.NORTH.get2DDataValue() + 4) % 4;

        for(int i = 0; i < times; ++i) {
            buffer[0].forAllBoxes((minX, minY, minZ, maxX, maxY, maxZ) -> {
                buffer[1] = Shapes.or(buffer[1], Shapes.box(1.0 - maxZ, minY, minX, 1.0 - minZ, maxY, maxX));
            });
            buffer[0] = buffer[1];
            buffer[1] = Shapes.empty();
        }

        return buffer[0];
    }

    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if(state.getValue(DISARMED))
            return InteractionResult.FAIL;


        if (!level.isClientSide) {
            Direction facingDirection = (Direction)state.getValue(FACING);
            level.setBlockAndUpdate(pos, (BlockState)((Block)ModBlocks.HERO_PEDESTAL.get()).defaultBlockState().setValue(FACING, facingDirection).setValue(DISARMED, true));
            SkaiaCommonEvents.INTERACT_PEDESTAL.invoke((ServerPlayer) player, level);
        }
        return InteractionResult.SUCCESS;
    }
}
