import java.util.Scanner;

public class ZodiacFinder {
    public static void main(String[] args) {
        String line;

        Scanner input = new Scanner(System.in);
        System.out.println("Hvilken måned er du født? Angiv fra 1-12:");

        int month = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Hvilken dato er du født? Angiv fra 1-31:");

        int day = input2.nextInt();

        System.out.print("Dit stjernetegn er: ");

        if (month == 1 && day >= 20 || month == 2 && day <= 18) {
            System.out.println("Vandmand");

        } else if (month == 2 && day >= 19 || month == 3 && day <= 20) {
            System.out.println("Fisk");

        } else if (month == 3 && day >= 21 || month == 4 && day <= 19) {
            System.out.println("Vædder");

        } else if (month == 4 && day >= 20 || month == 5 && day <= 21) {
            System.out.println("Tyr");

        } else if (month == 5 && day >= 22 || month == 6 && day <= 21) {
            System.out.println("Tvilling");

        } else if (month == 6 && day >= 22 || month == 7 && day <= 22) {
            System.out.println("Krebs");

        } else if (month == 7 && day >= 23 || month == 8 && day <= 22) {
            System.out.println("Løve");

        } else if (month == 8 && day >= 23 || month == 9 && day <= 22) {
            System.out.println("Jomfru");

        } else if (month == 9 && day >= 23 || month == 10 && day <= 22) {
            System.out.println("Vægt");

        } else if (month == 10 && day >= 23 || month == 11 && day <= 22) {
            System.out.println("Skorpion");

        } else if (month == 11 && day >= 23 || month == 12 && day <= 21) {
            System.out.println("Skytte");

        } else if (month == 12 && day >= 22 || month == 1 && day <= 19) {
            System.out.println("Stenbuk");

        }
    }
}

