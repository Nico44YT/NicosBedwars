package nazario.nicosbedwars.registry;

import nazario.nicosbedwars.block.GeneratorBlock;
import nazario.nicosbedwars.block.GeneratorBlockEntity;
import nazario.nicosbedwars.common.GeneratorMaterialKey;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import java.util.ArrayList;
import java.util.List;

public class BlockRegistry {

    public static final Block GENERATOR_MK1 = new GeneratorBlock(List.of(
            new GeneratorMaterialKey(new ItemStack(Items.BRICK), 80)
    ), AbstractBlock.Settings.copy(Blocks.BEDROCK));


    public static BlockEntityType<GeneratorBlockEntity> GENERATOR_TYPE;

    public static void init() {
        Registry.register(Registries.BLOCK, Identifier.of("nicosbedwars","generator_mk1"), GENERATOR_MK1);


        List<Block> types = new ArrayList<>();

        for(Block block : Registries.BLOCK) {

        }
    }

    public static <T extends BlockEntityType<?>> T registerBlockEntityType(String name, T blockEntityType) {
        return Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of("nicosbedwars", name), blockEntityType);
    }
}
