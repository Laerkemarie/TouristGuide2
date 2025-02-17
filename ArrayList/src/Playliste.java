import java.util.ArrayList;
import java.util.Scanner;

public class Playliste {
    public static void main(String[] args) {
        ArrayList<Sang> sange = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean fortsæt = true;

        while (fortsæt) {
            System.out.println("\nVælg en handling:");
            System.out.println("1. Tilføj en ny sang");
            System.out.println("2. Fjern en sang fra playlisten");
            System.out.println("3. Vis alle sange på playlisten");
            System.out.println("4. Søg efter en sang");
            System.out.println("5. Rediger titlen på en sang");
            System.out.println("6. Afslut programmet");
            System.out.println("Indtast valg: ");

            int valg = scanner.nextInt();
            scanner.nextLine();

            switch (valg) {
                case 1:
                    System.out.println("Indtast en sangtitel: ");
                    String nyTitel = scanner.nextLine();
                    sange.add(new Sang(nyTitel));
                    System.out.println(nyTitel + " er blevet tilføjet til listen");
                    break;

                case 2:
                    System.out.println("Indtast titlen på den sang der skal fjernes");
                    String fjernTitel = scanner.nextLine();
                    boolean fundetOgFjernet = false;
                    for (Sang sang : sange) {
                        sange.remove(sang);
                        System.out.println(fjernTitel + " er blevet fjernet fra listen");
                        fundetOgFjernet = true;
                        break;
                    }
                    if (!fundetOgFjernet) {
                        System.out.println("Sange med titel " + fjernTitel + "' blev ikke fjernet. Prøv igen");
                    }
                    break;

                case 3:
                    if (sange.isEmpty()) {
                        System.out.println("Listen er tom");
                    } else {
                        System.out.println("Sange i listen:");
                        for (Sang sang : sange) {
                            System.out.println(sang);
                        }
                    }
                    break;

                case 4:
                    System.out.println("Indtast titel på sangen der skal søges efter");
                    String søgTitel = scanner.nextLine();
                    boolean fundet = false;
                    for (Sang sang : sange) {
                        if (sang.getSangTitel().equalsIgnoreCase(søgTitel)) {
                            System.out.println("Sangen " + søgTitel + " blev fundet");
                            fundet = true;
                            break;
                        }
                    }
                    if (!fundet) {
                        System.out.println("Sangen med titel " + søgTitel + " blev ikke fundet. Prøv igen");
                    }
                    break;

                case 5:
                    System.out.println("Indtast nuværende titel på den sang som skal redigeres");
                    String gammelTitel = scanner.nextLine();
                    boolean redigeret = false;
                    for (Sang sang : sange) {
                        if (sang.getSangTitel().equalsIgnoreCase(gammelTitel)) {
                            System.out.println("Indtast ny titel:");
                            String nySangTitel = scanner.nextLine();
                            sang.setSangTitel(nySangTitel);
                            System.out.println("Sangen er blevet opdateret til " + nySangTitel);
                            redigeret = true;
                            break;
                        }
                        if (!redigeret) {
                            System.out.println("Sangen med sangtitlen " + gammelTitel + " blev ikke redigeret");
                        }
                        break;

                    }
                case 6:
                    System.out.println("Afslutter programmet...");
                    fortsæt = false;
                    break;

                default:
                    System.out.println("Ugyldigt valg, prøv igen");
            }
        }
        scanner.close();
    }
}









