package net.autra.submerged;

import net.autra.submerged.block.ModBlocks;
import net.autra.submerged.datagen.ModWorldGenerator;
import net.autra.submerged.enchantment.ModEnchantment;
import net.autra.submerged.item.ModItemGroup;
import net.autra.submerged.item.ModItems;
import net.autra.submerged.util.ModRegistries;
import net.autra.submerged.villager.ModVillagers;
import net.autra.submerged.world.gen.ModWorldGeneration;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Submerged implements ModInitializer {
	public static final String MOD_ID = "submerged";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		LOGGER.info("Hello Autra Submerged Mod Initialized world!");
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegistries.registerModRegistries();
		ModEnchantment.registerModEnchantments();
		ModVillagers.registerVillagers();
		ModWorldGeneration.generateModWorldGeneration();
	}
}