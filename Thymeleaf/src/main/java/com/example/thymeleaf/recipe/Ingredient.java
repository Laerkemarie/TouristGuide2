package com.example.thymeleaf.recipe;

public class Ingredient {
    private String name;
    private boolean allergen;

    public Ingredient(String name, boolean allergen) {
        this.name = name;
        this.allergen = allergen;
    }

    public String getName() {
        return name;
    }

    public boolean isAllergen() {
        return allergen;
    }
}