package ugedage;

import java.util.Scanner;

public class SkoledageEllerWeekend {
    public static void main(String[] args) {

        System.out.println("Vælg en ugedag fra 1-7:");
        for (int i = 0; i < Ugedage.values().length; i++) {
            System.out.println((i + 1) + ". " + Ugedage.values()[i]);
        }

        int brugerValg = -1;

        Scanner scanner = new Scanner(System.in);

        while (brugerValg < 1 || brugerValg > 7) {
            System.out.println("Indtast et tal mellem 1 og 7: ");
            if (scanner.hasNextInt()) {
                brugerValg = scanner.nextInt();
                if (brugerValg < 1 || brugerValg > 7) {
                    System.out.println("Du må kun skrive et tal fra 1-7. Prøv igen.");
                }
            } else {
                System.out.println("Du skal indtaste et tal. Prøv igen.");
                scanner.next();
            }
        }

        Ugedage ugedage = null;

        switch (brugerValg) {
            case 1:
                ugedage = Ugedage.MANDAG;
                break;
            case 2:
                ugedage = Ugedage.TIRSDAG;
                break;
            case 3:
                ugedage = Ugedage.ONSDAG;
                break;
            case 4:
                ugedage = Ugedage.TORSDAG;
                break;
            case 5:
                ugedage = Ugedage.FREDAG;
                break;
            case 6:
                ugedage = Ugedage.LØRDAG;
                break;
            case 7:
                ugedage = Ugedage.SØNDAG;
                break;
        }

        switch (ugedage) {
            case LØRDAG:
            case SØNDAG:
                System.out.println(ugedage + " - Det er weekend!");
                break;
            default:
                System.out.println(ugedage + " - Det er hverdag...");
                break;
        }

        scanner.close();
    }
}
