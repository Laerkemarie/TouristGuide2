package recipe;

import java.util.Scanner;

public class RecipeMain {
    public static void main(String[] args) {
        Recipe recipe = new Recipe("Pandekager", "Mel, mælk, æg, sukker");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Opskriften er:\n" + recipe.getFormattedRecipe());
        System.out.println("Tast en ingrediens for at se, om den er i opskriften (eller 'q' for at afslutte):");

        while (true) {
            System.out.println("Indtast ingrediens: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                System.out.println("Afslutter program....");
                break;
            }

            if (recipe.isInRecipe(input)) {
                System.out.println("Ingrediensen '" + input + "' er i opskriften");
            } else {
                System.out.println("Ingrediensen '" + input + "' er ikke i opskriften");
            }
        }

        scanner.close();
    }
}
