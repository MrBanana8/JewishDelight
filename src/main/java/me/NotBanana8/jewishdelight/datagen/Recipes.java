package me.NotBanana8.jewishdelight.datagen;

import me.NotBanana8.jewishdelight.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import vectorwing.farmersdelight.client.recipebook.CookingPotRecipeBookTab;
import vectorwing.farmersdelight.common.tag.ForgeTags;
import vectorwing.farmersdelight.data.builder.CookingPotRecipeBuilder;
import vectorwing.farmersdelight.data.builder.CuttingBoardRecipeBuilder;

import java.util.function.Consumer;

public class Recipes extends RecipeProvider implements IConditionBuilder {
    public Recipes(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        CookingPotRecipeBuilder.cookingPotRecipe(ModItems.GEFILTE_FISH.get(),1,200,0)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.COD_SLICE.get(),1)
                .addIngredient(Items.ROTTEN_FLESH,1)
                .addIngredient(ModItems.SLICED_CARROT.get(),1).unlockedByAnyIngredient(vectorwing.farmersdelight.common.registry.ModItems.COD_SLICE.get(),Items.CARROT,Items.ROTTEN_FLESH)
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer);

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(Items.CARROT),
                Ingredient.of(ForgeTags.TOOLS_KNIVES),ModItems.SLICED_CARROT.get(),2).build(consumer);
    }
}
