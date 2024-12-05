package net.autra.submerged.item;

import net.autra.submerged.Submerged;
import net.autra.submerged.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroup {

    public static final ItemGroup SUBMERGED_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Submerged.MOD_ID,"submerged_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.submerged_group"))
                    .icon(()-> new ItemStack(ModItems.AUTRA_LOGO)).entries((displayContext, entries) -> {entries.add(ModItems.SAPPHIRE);
                       //items
                        entries.add(ModItems.CRACKED_SAPPHIRE);
                        entries.add(ModItems.IMBUED_SAPPHIRE);
                        entries.add(ModItems.EMPOWERED_SAPPHIRE);
                        entries.add(ModItems.GEM_FINDER);
                        //blocks
                        entries.add(ModBlocks.SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.CRACKED_SAPPHIRE_BLOCK);


                        //Decorative Blocks
                        entries.add(ModBlocks.SAPPHIRE_STAIRS);
                        entries.add(ModBlocks.SAPPHIRE_SLAB);
                        entries.add(ModBlocks.SAPPHIRE_BUTTON);
                        entries.add(ModBlocks.SAPPHIRE_PRESSURE_PLATE);
                        entries.add(ModBlocks.SAPPHIRE_FENCE);
                        entries.add(ModBlocks.SAPPHIRE_FENCE_GATE);
                        entries.add(ModBlocks.SAPPHIRE_WALL);
                        entries.add(ModBlocks.SAPPHIRE_DOOR);
                        entries.add(ModBlocks.SAPPHIRE_TRAPDOOR);

                        //Tools
                        entries.add(ModItems.SAPPHIRE_SWORD);
                        entries.add(ModItems.SAPPHIRE_PICKAXE);
                        entries.add(ModItems.SAPPHIRE_AXE);
                        entries.add(ModItems.SAPPHIRE_SHOVEL);
                        entries.add(ModItems.SAPPHIRE_HOE);

                        //Ores
                        entries.add(ModBlocks.SAPPHIRE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
                        entries.add(ModBlocks.NETHER_SAPPHIRE_ORE);
                        entries.add(ModBlocks.END_SAPPHIRE_ORE);
                    }).build());

    public static void registerItemGroups() {
        Submerged.LOGGER.info("Registering ItemGroups");
    }
}
