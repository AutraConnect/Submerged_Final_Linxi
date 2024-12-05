package net.autra.submerged.world.gen;

import net.autra.submerged.world.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;

public class ModGeodeGeneration {
    public static void generateGeodes(){
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(),
                GenerationStep.Feature.LOCAL_MODIFICATIONS, ModPlacedFeatures.SAPPHIRE_GEODE_PLACED_KEY);
    }
}
