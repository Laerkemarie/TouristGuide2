package useradmin;

import java.util.Scanner;

public class Menu {

    private Scanner scanner;

    public Menu() {
        this.scanner = new Scanner(System.in);
    }

    public Menu(String menu, String s, String[] menuItems) {
    }

    // Metode til at vise menu og få et gyldigt valg fra brugeren
    public int showMenu() {
        System.out.println("\nVælg en mulighed:");
        System.out.println("1 - Opret ny bruger");
        System.out.println("2 - Vis liste af alle brugere");
        System.out.println("3 - Slet en bruger");
        System.out.println("9 - Afslut programmet");

        int choice = -1;
        boolean vaildInput = false;

        while (!vaildInput) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice == 1 || choice == 2 || choice == 3 || choice == 9) {
                    vaildInput = true;
                } else {
                    System.out.println("Ugyldigt valg. Prøv igen");
                }
            } catch (NumberFormatException e) {
                System.out.println("Indtast et tal. Prøv igen");
            }
        }
        return choice;
    }
 }
