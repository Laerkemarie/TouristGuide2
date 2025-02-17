import java.util.Calendar;
import java.util.Scanner;

public class mainIndkøbskurv {
    public static void main(String[] args) {

        Vare maelk = new Vare("Mælk", 7);
        Vare mel = new Vare("Mel", 10);
        Vare smoer = new Vare("Smør", 22);
        Vare broed = new Vare("Brød", 14);

        Indkøbskurv kurv = new Indkøbskurv();

        kurv.tilføjVare(maelk, 4);
        kurv.tilføjVare(mel, 2);
        kurv.tilføjVare(smoer, 3);
        kurv.tilføjVare(broed, 1);

        System.out.println(kurv);
        System.out.println();

        // scanner mulighed for at kunde selv kan angive hvad han/hun ønsker at købe og hvor meget

        Indkøbskurv kurv2 = new Indkøbskurv();

        Scanner scanner = new Scanner(System.in);
        boolean forsæt = true;

        // while-loop mens kunden ønsker at fortsætte med at handle

        while (forsæt) {
            System.out.println("Hvad vil du købe?");
            System.out.println("1: Mælk som koster 7 kr?");
            System.out.println("2: Mel som koster 11 kr?");
            System.out.println("3: Smør som koster 22 kr?");
            System.out.println("4: Brød som koster 14 kr?");
            System.out.println("5: Afslut og hvis din kurv og samlet pris");

            System.out.println("Vælg et produkt fra 1-5:");
            int valg = scanner.nextInt();

            if (valg == 5) {
                forsæt = false;
                break;
            }

            System.out.println("Hvor mange ønkser du at købe?");
            int antal = scanner.nextInt();

            // Tilføj varer baseret på brugerens valg
            switch (valg) {
                case 1:
                    kurv2.tilføjVare(maelk, antal);
                    break;

                case 2:
                    kurv2.tilføjVare(mel, antal);
                    break;

                case 3:
                    kurv2.tilføjVare(smoer, antal);
                    break;

                case 4:
                    kurv2.tilføjVare(broed, antal);
                    break;
                default:
                    System.out.println("Ugyldigt valg, prøv igen.");
            }

            System.out.print("Vil du fortsætte med at handle? Ja eller nej? ");
            String svar = scanner.next();
            forsæt = svar.equalsIgnoreCase("ja");
        }
        scanner.close();

        System.out.println("\nDin indkøbskurv:");
        System.out.println(kurv2);
    }
}
