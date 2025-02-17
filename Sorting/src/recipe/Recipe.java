package recipe;

public class Recipe {
    String navn;
    String ingrediensListe;

    public Recipe (String navn, String ingrediensListe) {
        this.navn = navn;
        this.ingrediensListe = ingrediensListe;
    }

    public String getFormattedRecipe() {
        return "Opskrift: " + navn + "\nIngrediens: " + ingrediensListe;
    }

    public boolean isInRecipe(String inputIngrediens){
        return ingrediensListe.toLowerCase().contains(inputIngrediens.toLowerCase());
    }
}
