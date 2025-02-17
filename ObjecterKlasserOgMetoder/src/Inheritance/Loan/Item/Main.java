package Inheritance.Loan.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hvor mange lån vil du registrere? ");
        int antalEnheder = scanner.nextInt();
        scanner.nextLine();

        ArrayList<LoanItem> loanItems = new ArrayList<>();

        for (int i = 0; i < antalEnheder; i++) {
            System.out.println("Låneenhed #" + (i + 1));
            System.out.print("Type: bog eller video? ");
            String type = scanner.nextLine();
            System.out.print("Titel: ");
            String title = scanner.nextLine();

            // Opret det korrekte objekt og tilføj til listen
            if (type.equalsIgnoreCase("bog")) {
                loanItems.add(new book(title));
            } else if (type.equalsIgnoreCase("video")) {
                loanItems.add(new video(title));
            } else {
                System.out.print("Ukendt type, springer over");
            }
        }
        System.out.println("\nDu har registreret følgende låneenheder: ");
        for (int i = 0; i < loanItems.size(); i++) {
            LoanItem item = loanItems.get(i);
            System.out.println((i + 1) + ". " + item.getType() + ": " + item.getTitle());
        }

        scanner.close();

    }
}
