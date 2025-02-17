package miniOpgaver.NummerOtte;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();

        garden.addFlower(new Flower("Rose", "Rød"));
        garden.addFlower(new Flower("Viol", "Blå"));
        garden.addFlower(new Flower("Vintergæk", "hvid"));
        garden.addFlower(new Flower("tulipan", "Rød"));

        System.out.println("Alle blomster i haven:");
        garden.displayAllFlowers();

        System.out.println("\nBlomster med farven 'Rød':");
        ArrayList<Flower> redFlowers = garden.getFlowersByColor("Rød");
        for (Flower flower : redFlowers) {
            System.out.println(flower);
        }
    }
}
