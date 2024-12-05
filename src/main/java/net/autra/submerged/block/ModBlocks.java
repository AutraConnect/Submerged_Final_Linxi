package net.autra.submerged.block;

import net.autra.submerged.Submerged;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));

    public static final Block CRACKED_SAPPHIRE_BLOCK = registerBlock("cracked_sapphire_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));

    //Decorative Blocks

    public static final Block SAPPHIRE_STAIRS = registerBlock("sapphire_stairs",
            new StairsBlock(ModBlocks.SAPPHIRE_BLOCK.getDefaultState(),
                    FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));

    public static final Block SAPPHIRE_SLAB = registerBlock("sapphire_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));

    public static final Block SAPPHIRE_BUTTON = registerBlock("sapphire_button",
            new ButtonBlock(FabricBlockSettings.copyOf(Blocks.STONE_BUTTON),
                    BlockSetType.IRON,10, true));

    public static final Block SAPPHIRE_PRESSURE_PLATE = registerBlock("sapphire_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING,
                    FabricBlockSettings.copyOf(Blocks.STONE_PRESSURE_PLATE),
                    BlockSetType.IRON));

    public static final Block SAPPHIRE_FENCE = registerBlock("sapphire_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.NETHER_BRICK_FENCE)));

    public static final Block SAPPHIRE_FENCE_GATE = registerBlock("sapphire_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copyOf(Blocks.NETHER_BRICK_FENCE), WoodType.ACACIA));

    public static final Block SAPPHIRE_WALL = registerBlock("sapphire_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.NETHER_BRICK_WALL)));

    public static final Block SAPPHIRE_DOOR = registerBlock("sapphire_door",
            new DoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_DOOR), BlockSetType.IRON));

    public static final Block SAPPHIRE_TRAPDOOR = registerBlock("sapphire_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copyOf(Blocks.IRON_TRAPDOOR), BlockSetType.IRON));

    //Ores
    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DIAMOND_ORE)));

    public static final Block DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_DIAMOND_ORE)));

    public static final Block NETHER_SAPPHIRE_ORE = registerBlock("nether_sapphire_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_QUARTZ_ORE)));

    public static final Block END_SAPPHIRE_ORE = registerBlock("end_sapphire_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));





    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Submerged.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registries.ITEM, new Identifier(Submerged.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Submerged.LOGGER.info("Registering Blocks");
    }
}
