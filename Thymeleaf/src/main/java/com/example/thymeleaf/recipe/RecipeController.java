package com.example.thymeleaf.recipe;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/recipe")
    public String viewRecipe(@RequestParam("name") String name, Model model) {
        Recipe recipe = recipeService.getRecipeByName(name);
        if (recipe == null) {
            model.addAttribute("error", "Opskriften blev ikke fundet");
            return "error-page";
        }
        model.addAttribute("recipe", recipe);
        return "recipe-detail";
    }

    @GetMapping("/")
    public String listRecipes(Model model) {
        List<Recipe> recipes = recipeService.getAllRecipes();
        model.addAttribute("recipes", recipes);
        return "recipe-list";
    }

    @GetMapping("/search")
    public String searchByIngredient(@RequestParam("ingredient") String ingredient, Model model) {
        List<Recipe> recipes = recipeService.searchByIngredient(ingredient);
        model.addAttribute("recipes", recipes);
        model.addAttribute("ingredient", ingredient);
        return "recipe-list";
    }
}
