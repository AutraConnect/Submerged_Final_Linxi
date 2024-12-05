package net.autra.submerged.item;

import net.autra.submerged.Submerged;
import net.autra.submerged.item.custom.EmpoweredSapphire;
import net.autra.submerged.item.custom.GemFinderItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import static net.autra.submerged.block.ModBlocks.CRACKED_SAPPHIRE_BLOCK;
import static net.autra.submerged.block.ModBlocks.SAPPHIRE_BLOCK;

public class ModItems {

    public static final Item SAPPHIRE = registerItem("sapphire",
         new Item(new FabricItemSettings()));

    public static final Item CRACKED_SAPPHIRE = registerItem("cracked_sapphire",
            new Item(new FabricItemSettings()));

    public static final Item IMBUED_SAPPHIRE = registerItem("imbued_sapphire",
            new Item(new FabricItemSettings().fireproof()));

    public static final Item EMPOWERED_SAPPHIRE = registerItem("empowered_sapphire",
            new EmpoweredSapphire(new FabricItemSettings().fireproof()));

    public static final Item AUTRA_LOGO = registerItem("autra_logo",
            new Item(new FabricItemSettings()));

    public static final Item GEM_FINDER = registerItem("gem_finder",
            new GemFinderItem(new FabricItemSettings().fireproof()));

    //Tools
    public static final Item SAPPHIRE_SWORD = registerItem("sapphire_sword",
            new SwordItem(ModToolMaterial.SAPPHIRE,2,2f, new FabricItemSettings()));
    public static final Item SAPPHIRE_PICKAXE = registerItem("sapphire_pickaxe",
            new PickaxeItem(ModToolMaterial.SAPPHIRE,1,1f, new FabricItemSettings()));
    public static final Item SAPPHIRE_AXE = registerItem("sapphire_axe",
            new AxeItem(ModToolMaterial.SAPPHIRE,7,-2f, new FabricItemSettings()));
    public static final Item SAPPHIRE_SHOVEL = registerItem("sapphire_shovel",
            new ShovelItem(ModToolMaterial.SAPPHIRE,0,0f, new FabricItemSettings()));
    public static final Item SAPPHIRE_HOE = registerItem("sapphire_hoe",
            new HoeItem(ModToolMaterial.SAPPHIRE,0,0f, new FabricItemSettings()));


    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(Submerged.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Submerged.LOGGER.info("Registering Mod Items for " + Submerged.MOD_ID);
    }
}
