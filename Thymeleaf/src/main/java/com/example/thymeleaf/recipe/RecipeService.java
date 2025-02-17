package com.example.thymeleaf.recipe;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public Recipe getRecipeByName(String name) {
        return recipeRepository.viewRecipe(name);
    }

    public List<Recipe> getAllRecipes() {
        return recipeRepository.getAllRecipes();
    }

    public List<Recipe> searchByIngredient(String ingredientName) {
        return recipeRepository.getAllRecipes().stream()
                .filter(recipe -> recipe.getIngredients().stream()
                        .anyMatch(ing -> ing.getName().equalsIgnoreCase(ingredientName)))
                .collect(Collectors.toList());
    }
}

