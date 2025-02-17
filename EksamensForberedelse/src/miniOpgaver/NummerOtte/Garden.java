package miniOpgaver.NummerOtte;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    private ArrayList<Flower> flowers;

    public Garden() {
        this.flowers = new ArrayList<>();
    }

    public void setFlowers(ArrayList<Flower> flowers) {
        this.flowers = flowers;
    }
    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public ArrayList<Flower> getFlowersByColor(String color) {
        ArrayList<Flower> result = new ArrayList<>();
        for (Flower flower : flowers) {
            if (flower.getColor().equalsIgnoreCase(color)) {
                result.add(flower);
            }
        }
        return result;
    }
    public void displayAllFlowers() {
        for (Flower flower : flowers) {
            System.out.println(flower);
        }
    }
}
