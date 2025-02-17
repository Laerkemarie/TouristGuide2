package Metode;

import java.util.Scanner;

    //Lav  et program der spørger brugeren om to tal. Lav følgende metoder: plus, minus, gange, dividere, modulus
    public class Lommeregner {
        public static double plusLommeregner(double foersteTal, double andetTal) {
            return foersteTal + andetTal;
        }

        public static double minusLommeregner(double foersteTal, double andetTal) {
            return foersteTal - andetTal;
        }

        public static double gangeLommeregner(double foersteTal, double andetTal) {
            return foersteTal * andetTal;
        }

        public static double dividereLommeregner(double foersteTal, double andetTal) {
            return foersteTal / andetTal;
        }

        public static double modulusLommeregner(double foersteTal, double andetTal) {
            return foersteTal % andetTal;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("skriv ét tal:");
            double a = scanner.nextDouble();

            System.out.println("Skriv ét tal mere:");
            double b = scanner.nextDouble();

            System.out.println("Første og andet tal lagt sammen giver: " + plusLommeregner(a, b));
            System.out.println("Første og andet tal trukket fra hinanden giver: " + minusLommeregner(a, b));
            System.out.println("Første og andet tal ganget med hinaden giver: " + gangeLommeregner(a, b));
            System.out.println("Første og andet tal divideret med hinaden giver: " + dividereLommeregner(a, b));
            System.out.println("Første og andet tal modulus (resten) giver: " + modulusLommeregner(a, b));
        }
    }

