package Tamagotchii;

import java.util.Scanner;
public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Start besked
        System.out.println("Hej og velkommen til din egen personlige tamagotchi! Vil du oprette en hund eller kat?");
        System.out.println("Tast 1 for kat og 2 for hund:");
        int choise = scanner.nextInt();
        scanner.nextLine(); // Ryd scanner buffer

        // Navngivning af dyret
        System.out.println("Du har nu valgt dit dyr. Hvad vil du kalde ham/hende?");
        String newName = scanner.nextLine();

        Tamagotchii pet; // Opret en variabel af typen Tamagotchi

        // Skab enten en kat eller en hund baseret på valget
        if (choise == 1) {
            pet = new Cat(newName);
            System.out.println("/\\_/\\\n" +
                    "( o.o )\n" +
                    " > ^ <");
        } else if (choise == 2) {
            pet = new Dog(newName);
            System.out.println(" |\\      _,,,---,,_\n" +
                    "   /,`.-'`'    -.  ;-;;,_\n" +
                    "     |,4-  ) )-,_. ,\\ (  `'-'\n" +
                    "    '---''(_/--'  `-'\\_)  ");
        } else {
            System.out.println("Ugyldigt valg, prøv igen!");
            return; // Afslut programmet hvis der er et ugyldigt valg
        }

        // Velkomstbesked
        System.out.println("Hej " + newName + "! Du ser sød ud! Nu kan vi starte spillet!");

        //whileloop, skal kunne blive ved med at spille
        boolean playing = true;
        while (playing) {

            // Valg af handling
            System.out.print("Hvad vil du lave med din tamagotchi?" + "\n" + "1: sove" + "\n" + "2: fodre" + "\n" +
                    "3: lege" + "\n" + "4: give medicin" + "\n" + "5: give bad" + "\n" + "6: sige en lyd" + "\n" + "7: slutte spillet" + "\n");

            int action = scanner.nextInt();
            switch (action) {
                case 1:
                    pet.sleep(6); // Antag at dyret sover i 6 timer
                    break;
                case 2:
                    pet.feed(); // Fodr dyret
                    break;
                case 3:
                    pet.play(); // Leg med dyret
                    break;
                case 4:
                    pet.medicine(true); // Giv medicin til dyret
                    break;
                case 5:
                    pet.clean(1); // Giv bad
                    break;
                case 6:
                    pet.makeSound(); // Dyret siger lyd
                    break;
                case 7:
                    System.out.println("Tak for spillet! Farvel");
                    playing = false;
                    break;
                default:
                    System.out.println("Ugyldigt valg.");
            }
        }
        scanner.close(); // Luk scanner
    }
}
