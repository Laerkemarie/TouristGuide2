import java.util.Scanner;

public class ZodiacFinder2 {
    public static void main(String[] args) {
        String line;

        Scanner input = new Scanner(System.in);
        System.out.println("Hvilken måned er du født? Angiv fra 1-12:");

        int month = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Hvilken dato er du født? Angiv fra 1-31:");

        int day = input2.nextInt();

        if (month == 2) if (day <= 18) {
            System.out.println("Vandmand");
        } else System.out.println("Fisk");

        if (month == 3) if (day <=20) {
            System.out.println("Fisk");
        } else System.out.println("Vædder");

        if (month == 4) if (day <=19) {
            System.out.println("Vædder");
        } else System.out.println("Tyr");

        if (month == 5) if (day <=21) {
            System.out.println("Tyr");
        } else System.out.println("Tvilling");

        if (month == 6) if (day <=21) {
            System.out.println("Tvilling");
        } else System.out.println("Krebs");

        if (month == 7) if (day <=22) {
            System.out.println("Krebs");
        } else System.out.println("Løve");

        if (month == 8) if (day <=22) {
            System.out.println("Løve");
        } else System.out.println("Jomfru");

        if (month == 9) if (day <=22) {
            System.out.println("Jomfru");
        } else System.out.println("Vægt");

        if (month == 10) if (day <=22) {
            System.out.println("Vægt");
        } else System.out.println("Skorpion");

        if (month == 11) if (day <=21) {
            System.out.println("Skorpion");
        } else System.out.println("Skytte");

        if (month == 12) if (day <=19) {
            System.out.println("Skytte");
        } else System.out.println("Stenbuk");

        if (month == 1) if (day <=18) {
            System.out.println("Stenbuk");
        } else System.out.println("Vandmand");

        if (month == 2) if (day <=20) {
            System.out.println("Vandmand");
        } else System.out.println("Fisk");
    }
}
