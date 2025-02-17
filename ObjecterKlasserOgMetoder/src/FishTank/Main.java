package FishTank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FishTank fishTank = new FishTank();
        Fish wogglie = new Fish("Wogglie", "hun");
        Fish swimmie = new Fish("Swimmie", "hun");

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Diana's Akvarium ---");
            System.out.println("1. Registrer vandskifte");
            System.out.println("2. Vis seneste vandskifte");
            System.out.println("3. Tilføj sundhedsnotet til fisk");
            System.out.println("4. Vis seneste sundhedsnotat for en fisk");
            System.out.println("5. Afslut program");
            System.out.println("Vælg en mulighed: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println("Bemærkning til vandskifte: ");
                    String note = scanner.nextLine();
                    System.out.println("Kvalitet (PERFEKT, GODT, OKAY, DÅRLIGT): ");
                    String qualityInput = scanner.nextLine().toUpperCase();
                    FishTank.WaterQuality quality;
                    try {
                        quality = FishTank.WaterQuality.valueOf(qualityInput);
                        fishTank.changeWater(note, quality);
                        System.out.println("Vandskifte registeret.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Ugyldig kvalitet");
                    }
                }
                case 2 -> System.out.println(fishTank.getLastWaterChangeInfo());
                case 3 -> {
                    System.out.println("Vælg fisk (1 = Wogglie, 2 = Swimmie): ");
                    int fishChoice = scanner.nextInt();
                    scanner.nextLine();
                    Fish fish = (fishChoice == 1) ? wogglie : swimmie;
                    System.out.println("Skriv sundhedsnotat");
                    String note = scanner.nextLine();
                    fish.addHealthNote(note);
                }
                case 4 -> {
                    System.out.println("Vælg fisk (1 = Wogglie, 2 = Swimmie): ");
                    int fishChoice = scanner.nextInt();
                    scanner.nextLine();
                    Fish fish = (fishChoice == 1) ? wogglie : swimmie;
                    System.out.println(fish.getLatestHealthNote());
                }
                case 5 -> {
                    running = false;
                    System.out.println("Farvel!");
                }
                default -> System.out.println("Ugyldigt valg.");
            }
        }
        scanner.close();
    }
}
