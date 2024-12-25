package nazario.nicosbedwars.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class GeneratorBlock extends Block {
    public GeneratorBlock(Settings settings) {
        super(settings);
    }



    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        System.out.println("HELLO!");
    }
}
