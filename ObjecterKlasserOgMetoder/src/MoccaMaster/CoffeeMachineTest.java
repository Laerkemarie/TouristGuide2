package MoccaMaster;

import java.util.Scanner;

public class CoffeeMachineTest {
    public static void main(String[] args) {
        CoffeeMachine machine = new CoffeeMachine();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Velkommen til kaffebaren!");

        boolean keepOrdering = true;

        while (keepOrdering) {
            // Brugeren vælger en drik
            System.out.println("Hvilken drik kunne du tænke dig? Vi har: Sort kaffe, Espresso, Double eller Triple espresso, Latte Machiatto, Kakaomælk og Chokoladedrik:");
            String drinkType = scanner.nextLine();
            drinkType = drinkType.toLowerCase();

            // Validering af drik
            if (!isValidDrink(drinkType)) {
                System.out.println("Fejl: Vi tilbyder desværre ikke den drik. Prøv igen.");
                continue;
            }

            // Valg af størrelse
            String size = "Mellem"; // Standardstørrelse
            if (!drinkType.equalsIgnoreCase("Espresso")) {
                System.out.println("Hvilken størrelse? Lille, mellem eller stor:");
                size = scanner.nextLine();
                if (!isValidSize(size)) {
                    System.out.println("Fejl: Ugyldig størrelse. Prøv igen.");
                    continue;
                }
            }

            // Tjek for flødeskum
            boolean hasWhippedCream = false;
            if (drinkType.equalsIgnoreCase("Kakaomælk") || drinkType.equalsIgnoreCase("Chokoladedrik")) {
                System.out.println("Kunne du tænke dig flødeskum? (ja/nej): ");
                hasWhippedCream = scanner.nextLine().equalsIgnoreCase("ja");
            }

            // Bestil drik
            try {
                Cup order = machine.serve(drinkType, size, hasWhippedCream);
                System.out.println("Din bestilling er klar: " + order);
            } catch (IllegalArgumentException e) {
                System.out.println("Fejl: " + e.getMessage());
            }

            // Spørg om brugeren vil bestille igen
            System.out.println("Vil du bestille en ny drik? (ja/nej):");
            keepOrdering = scanner.nextLine().equalsIgnoreCase("ja");
        }

        System.out.println("Tak for besøget! Hav en god dag.");
        scanner.close();
    }

    // Metode til at validere drik
    private static boolean isValidDrink(String drink) {
        return drink.equalsIgnoreCase("Sort kaffe") ||
                drink.equalsIgnoreCase("Espresso") ||
                drink.equalsIgnoreCase("Double espresso") ||
                drink.equalsIgnoreCase("Triple espresso") ||
                drink.equalsIgnoreCase("Latte Machiatto") ||
                drink.equalsIgnoreCase("Kakaomælk") ||
                drink.equalsIgnoreCase("Chokoladedrik");
    }

    // Metode til at validere størrelse
    private static boolean isValidSize(String size) {
        return size.equalsIgnoreCase("Lille") ||
                size.equalsIgnoreCase("Mellem") ||
                size.equalsIgnoreCase("Stor");
    }
}



//        Cup order1 = machine.serve("espresso", null, false);
//        Cup order2 = machine.serve("kakaomælk", "stor", true);
//        Cup order3 = machine.serve("sort kaffe", "lille", false);
//
//        System.out.println(order1);
//        System.out.println(order2);
//        System.out.println(order3);


