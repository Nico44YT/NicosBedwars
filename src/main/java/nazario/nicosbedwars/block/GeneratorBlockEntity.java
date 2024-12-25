package nazario.nicosbedwars.block;

import nazario.nicosbedwars.common.GeneratorMaterialKey;
import nazario.nicosbedwars.registry.BlockRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public class GeneratorBlockEntity extends BlockEntity {

    public List<GeneratorMaterialKey> list;

    public GeneratorBlockEntity(BlockPos pos, BlockState state) {
        super(BlockRegistry.GENERATOR_TYPE, pos, state);
        this.list = new ArrayList<>();
    }

    public GeneratorBlockEntity(List<GeneratorMaterialKey> list, BlockPos pos, BlockState state) {
        super(BlockRegistry.GENERATOR_TYPE, pos, state);
        this.list = list;
    }

    public void tick(World world, BlockPos pos, BlockState state) {
        if(world.isClient) return;

        list.forEach(key -> {
            key.decrementCooldown();

            if(key.getCooldown() <= 0) {
                key.resetCooldown();
                world.spawnEntity(new ItemEntity(world, pos.getX(), pos.getY() + 0.5, pos.getZ(), key.getStack().copy()));
            }
        });
    }
}
