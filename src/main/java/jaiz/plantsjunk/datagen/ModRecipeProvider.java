package jaiz.plantsjunk.datagen;


import jaiz.plantsjunk.block.ModBlocks;
import jaiz.plantsjunk.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.Identifier;


public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        //Desert Oak

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROTTEN_DOOR, 3)
                .pattern("RR")
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.ROTTEN_PLANKS)
                .criterion(hasItem(ModBlocks.ROTTEN_PLANKS), conditionsFromItem(ModBlocks.ROTTEN_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ROTTEN_DOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROTTEN_TRAPDOOR, 2)
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModBlocks.ROTTEN_PLANKS)
                .criterion(hasItem(ModBlocks.ROTTEN_PLANKS), conditionsFromItem(ModBlocks.ROTTEN_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ROTTEN_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROTTEN_FENCE, 3)
                .pattern("RXR")
                .pattern("RXR")
                .input('R', ModBlocks.ROTTEN_PLANKS)
                .input('X', Items.STICK)
                .criterion(hasItem(ModBlocks.ROTTEN_PLANKS), conditionsFromItem(ModBlocks.ROTTEN_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ROTTEN_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROTTEN_FENCE_GATE, 1)
                .pattern("RXR")
                .pattern("RXR")
                .input('X', ModBlocks.ROTTEN_PLANKS)
                .input('R', Items.STICK)
                .criterion(hasItem(ModBlocks.ROTTEN_PLANKS), conditionsFromItem(ModBlocks.ROTTEN_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ROTTEN_FENCE_GATE)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModItems.ROTTEN_SIGN, 3)
                .pattern("RRR")
                .pattern("RRR")
                .pattern(" X ")
                .input('R', ModBlocks.ROTTEN_PLANKS)
                .input('X', Items.STICK)
                .criterion(hasItem(ModBlocks.ROTTEN_PLANKS), conditionsFromItem(ModBlocks.ROTTEN_PLANKS))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.ROTTEN_SIGN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModItems.HANGING_ROTTEN_SIGN, 6)
                .pattern("X X")
                .pattern("RRR")
                .pattern("RRR")
                .input('R', ModBlocks.STRIPPED_ROTTEN_LOG)
                .input('X', Blocks.CHAIN)
                .criterion(hasItem(ModBlocks.STRIPPED_ROTTEN_LOG), conditionsFromItem(ModBlocks.STRIPPED_ROTTEN_LOG))
                .criterion(hasItem(Blocks.CHAIN), conditionsFromItem(Blocks.CHAIN))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.HANGING_ROTTEN_SIGN)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROTTEN_SLAB, 6)
                .pattern("RRR")
                .input('R', ModBlocks.ROTTEN_PLANKS)
                .criterion(hasItem(ModBlocks.ROTTEN_PLANKS), conditionsFromItem(ModBlocks.ROTTEN_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ROTTEN_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROTTEN_STAIRS, 4)
                .pattern("R  ")
                .pattern("RR ")
                .pattern("RRR")
                .input('R', ModBlocks.ROTTEN_PLANKS)
                .criterion(hasItem(ModBlocks.ROTTEN_PLANKS), conditionsFromItem(ModBlocks.ROTTEN_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ROTTEN_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, Items.OAK_BOAT, 1)
                .pattern("R R")
                .pattern("RRR")
                .input('R', ModBlocks.ROTTEN_PLANKS)
                .criterion(hasItem(ModBlocks.ROTTEN_PLANKS), conditionsFromItem(ModBlocks.ROTTEN_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(Items.OAK_BOAT)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ROTTEN_WOOD, 4)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.ROTTEN_LOG)
                .criterion(hasItem(ModBlocks.ROTTEN_LOG), conditionsFromItem(ModBlocks.ROTTEN_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ROTTEN_WOOD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STRIPPED_ROTTEN_WOOD, 4)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.STRIPPED_ROTTEN_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_ROTTEN_LOG), conditionsFromItem(ModBlocks.STRIPPED_ROTTEN_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.STRIPPED_ROTTEN_WOOD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, ModBlocks.ROTTEN_PRESSURE_PLATE, 1)
                .pattern("RR")
                .input('R', ModBlocks.ROTTEN_PLANKS)
                .criterion(hasItem(ModBlocks.ROTTEN_PLANKS), conditionsFromItem(ModBlocks.ROTTEN_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ROTTEN_PRESSURE_PLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.ROT_BLOCK, 4)
                .pattern("XR")
                .pattern("RX")
                .input('R', Blocks.DIRT)
                .input('X', Items.BONE_MEAL)
                .criterion(hasItem(Blocks.DIRT), conditionsFromItem(Blocks.DIRT))
                .criterion(hasItem(Items.BONE_MEAL), conditionsFromItem(Items.BONE_MEAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.ROT_BLOCK)));

    }
}