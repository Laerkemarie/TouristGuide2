package com.example.thymeleaf.recipe;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RecipeRepository {
    private final List<Recipe> recipes = new ArrayList<>();

    public RecipeRepository() {
        addRecipe("Pandekager", List.of(
                new Ingredient("Mel", true),
                new Ingredient("Mælk", true),
                new Ingredient("Smør", true),
                new Ingredient("Æg", false),
                new Ingredient("Sukker", false),
                new Ingredient("Salt", false)
        ));

        addRecipe("Vaniljekranse", List.of(
                new Ingredient("Mel", true),
                new Ingredient("Vaniljestang", false),
                new Ingredient("Æg", false),
                new Ingredient("Sukker", false),
                new Ingredient("Mandler", true)
        ));

        addRecipe("Cookies", List.of(
                new Ingredient("Mel", true),
                new Ingredient("Chokolade", false),
                new Ingredient("Æg", false),
                new Ingredient("Brun farin", false),
                new Ingredient("Peanuts", true),
                new Ingredient("Smør", true)
        ));
    }

    public void addRecipe(String name, List<Ingredient> ingredients) {
        recipes.add(new Recipe(name, ingredients));
    }

    public Recipe viewRecipe(String name) {
        return recipes.stream()
                .filter(recipe -> recipe.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public List<Recipe> getAllRecipes() {
        return recipes;
    }
}
