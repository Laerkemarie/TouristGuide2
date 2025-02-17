package Inheritance.Bankkonto;

import java.util.Scanner;

public class MainKonto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indtast ejern af kontoens navn: ");
        String ejerNavn = scanner.nextLine();

        System.out.println("Indtast kontoens kontonummer: ");
        String kontoNummer = scanner.nextLine();

        System.out.println("Indtast en startsaldo: ");
        double startSaldo = scanner.nextDouble();

        //opretter ny konto

        Konto konto = new Konto(kontoNummer, ejerNavn, startSaldo);
        System.out.println("\nKonto er oprettet: ");
        System.out.println(konto);

        while (true) {
            System.out.println("\nVælg en handling:");
            System.out.println("1. Indsæt penge");
            System.out.println("2. Hæv penge");
            System.out.println("3. Se kontoinformation");
            System.out.println("4. Afslut");
            int valg = scanner.nextInt();

            if(valg == 1) {
                System.out.println("Indtast det beløb du ønsker at indsætte: ");
                double beloeb = scanner.nextDouble();
                double nySaldo = konto.indsaet(beloeb);
                System.out.println("Ny saldo: " + nySaldo + " kr");
            } else if (valg == 2) {
                System.out.println("Indtast det beløb du ønsker at hæve");
                double beloeb = scanner.nextDouble();
                double nySaldo = konto.haev(beloeb);
                if (nySaldo != -1) {
                    System.out.println("Ny saldo: " + nySaldo + " kr");
                } else {
                    System.out.println("Der er ikke nok penge på kontoen!");
                }
            } else if (valg == 3) {
                System.out.println(konto);
            } else if (valg == 4) {
                System.out.println("Der logges af kontoen. Farvel");
                break;
            } else {
                System.out.println("Ugyldigt valg. Prøv igen");
            }
        }
        scanner.close();
    }
}
