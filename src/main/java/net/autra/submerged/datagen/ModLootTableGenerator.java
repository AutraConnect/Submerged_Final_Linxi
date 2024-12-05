package net.autra.submerged.datagen;

import net.autra.submerged.block.ModBlocks;
import net.autra.submerged.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SAPPHIRE_BLOCK);
        addDrop(ModBlocks.CRACKED_SAPPHIRE_BLOCK);
        addDrop(ModBlocks.SAPPHIRE_STAIRS);
        addDrop(ModBlocks.SAPPHIRE_SLAB);
        addDrop(ModBlocks.SAPPHIRE_BUTTON);
        addDrop(ModBlocks.SAPPHIRE_PRESSURE_PLATE);
        addDrop(ModBlocks.SAPPHIRE_FENCE);
        addDrop(ModBlocks.SAPPHIRE_FENCE_GATE);
        addDrop(ModBlocks.SAPPHIRE_WALL);
        addDrop(ModBlocks.SAPPHIRE_DOOR);
        addDrop(ModBlocks.SAPPHIRE_TRAPDOOR);

        //Ores
        addDrop(ModBlocks.SAPPHIRE_ORE, oreDrops(ModBlocks.SAPPHIRE_ORE, ModItems.SAPPHIRE));
        addDrop(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, oreDrops(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, ModItems.SAPPHIRE));
        addDrop(ModBlocks.NETHER_SAPPHIRE_ORE, oreDrops(ModBlocks.NETHER_SAPPHIRE_ORE, ModItems.IMBUED_SAPPHIRE));
        addDrop(ModBlocks.END_SAPPHIRE_ORE, oreDrops(ModBlocks.END_SAPPHIRE_ORE, ModItems.EMPOWERED_SAPPHIRE));

    }
}
