package nazario.nicosbedwars.registry;

import nazario.nicosbedwars.block.GeneratorBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class BlockRegistry {

    public static final Block GENERATOR_MK1 = new GeneratorBlock(AbstractBlock.Settings.copy(Blocks.BEDROCK));


    public static void init() {
        Registry.register(Registries.BLOCK, Identifier.of("nicosbedwars","generator_mk1"), GENERATOR_MK1);
    }
}
