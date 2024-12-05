package net.autra.submerged.datagen;

import net.autra.submerged.block.ModBlocks;
import net.autra.submerged.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GEM_FINDER)
                        .pattern(" S ")
                        .pattern("G G")
                        .pattern(" G ")
                        .input('S', ModItems.EMPOWERED_SAPPHIRE)
                        .input('G', Items.GOLD_INGOT)
                        .criterion(hasItem(ModItems.EMPOWERED_SAPPHIRE), conditionsFromItem(ModItems.EMPOWERED_SAPPHIRE))
                        .offerTo(exporter, new Identifier(getRecipeName(ModItems.GEM_FINDER)));

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.SAPPHIRE, RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.CRACKED_SAPPHIRE, RecipeCategory.MISC, ModBlocks.CRACKED_SAPPHIRE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SAPPHIRE_STAIRS, 5)
                .pattern("  S")
                .pattern(" SS")
                .pattern("SSS")
                .input('S', ModBlocks.SAPPHIRE_BLOCK)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SAPPHIRE_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SAPPHIRE_BUTTON)
                .pattern(" SS")
                .input('S', ModItems.SAPPHIRE)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SAPPHIRE_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SAPPHIRE_FENCE, 3)
                .pattern("BSB")
                .pattern("BSB")
                .input('B', ModItems.SAPPHIRE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SAPPHIRE_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SAPPHIRE_FENCE_GATE)
                .pattern("SBS")
                .pattern("SBS")
                .input('B', ModItems.SAPPHIRE)
                .input('S', Items.STICK)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SAPPHIRE_FENCE_GATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SAPPHIRE_TRAPDOOR, 2)
                .pattern("SSS")
                .pattern("SSS")
                .input('S', ModBlocks.SAPPHIRE_BLOCK)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SAPPHIRE_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SAPPHIRE_DOOR, 3)
                .pattern(" SS")
                .pattern(" SS")
                .pattern(" SS")
                .input('S', ModBlocks.SAPPHIRE_BLOCK)
                .criterion(hasItem(ModItems.SAPPHIRE), conditionsFromItem(ModItems.SAPPHIRE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.SAPPHIRE_DOOR)));

        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.SAPPHIRE_SLAB, ModBlocks.SAPPHIRE_BLOCK);
        offerPressurePlateRecipe(exporter, ModBlocks.SAPPHIRE_PRESSURE_PLATE, ModBlocks.SAPPHIRE_BLOCK);
        offerWallRecipe(exporter, RecipeCategory.MISC, ModBlocks.SAPPHIRE_WALL, ModBlocks.SAPPHIRE_BLOCK);
    }
}
