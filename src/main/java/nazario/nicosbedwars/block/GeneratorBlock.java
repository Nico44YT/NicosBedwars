package nazario.nicosbedwars.block;

import nazario.nicosbedwars.common.GeneratorMaterialKey;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GeneratorBlock extends BlockWithEntity {

    List<GeneratorMaterialKey> list;

    public GeneratorBlock(List<GeneratorMaterialKey> list, Settings settings) {
        super(settings);
        this.list = list;
    }

    @Override
    public @Nullable <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
        return new BlockEntityTicker<T>() {
            @Override
            public void tick(World world, BlockPos pos, BlockState state, T blockEntity) {
                if(blockEntity instanceof GeneratorBlockEntity entity) {
                    entity.tick(world, pos, state);
                }
            }
        };
    }

    @Override
    public @Nullable BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new GeneratorBlockEntity(this.list, pos, state);
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.MODEL;
    }
}
