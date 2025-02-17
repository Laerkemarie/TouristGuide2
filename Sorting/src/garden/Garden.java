package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    public static void main(String[] args) {

        ArrayList<Flower> blomsterListe = new ArrayList<>();

        blomsterListe.add(new Flower("Anemone", "Hvid"));
        blomsterListe.add(new Flower("Rose", "Rød"));
        blomsterListe.add(new Flower("Viol", "blå"));
        blomsterListe.add(new Flower("Påskelilje", "gul"));
        blomsterListe.add(new Flower("Vinterkæk", "hvid"));
        blomsterListe.add(new Flower("Krysantemum", "rød"));


        printFlowersByColour(blomsterListe, "Hvid");
        printFlowersByColour(blomsterListe, "Rød");
        printFlowersByColour(blomsterListe, "blå");
        printFlowersByColour(blomsterListe, "gul");

    }

    // Returnerer en liste af blomster med en bestemt farve
    public static List<Flower> getFlowersByColor(List<Flower> flowers, String color) {
        List<Flower> result = new ArrayList<>();
        for (Flower flower : flowers) {
            if (flower.getColour().equalsIgnoreCase(color)) {
                result.add(flower);
            }
        }
        return result;
    }

    public static void printFlowersByColour(List<Flower> flowers, String color) {
        List<Flower> filteredFlowers = getFlowersByColor(flowers, color);
        System.out.println("Blomster med farven " + color + ": ");
        for (Flower flower : filteredFlowers) {
            System.out.println(flower.getSpecies());
        }
        System.out.println("========================");
    }
}
