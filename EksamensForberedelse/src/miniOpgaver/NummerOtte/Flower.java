package miniOpgaver.NummerOtte;

public class Flower {
    private String species;
    private String color;

    public Flower(String species, String color) {
        this.species = species;
        this.color = color;
    }
    public String getSpecies() {
        return species;
    }
    public String getColor() {
        return color;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Blomst " + species + " har farven " + color;
    }
}
