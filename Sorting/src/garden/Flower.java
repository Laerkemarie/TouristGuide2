package garden;

public class Flower {
    String species;
    String colour;

    public Flower(String species, String colour){
        this.species = species;
        this.colour = colour;
    }

    public String getSpecies(){
        return this.species;
    }

    public String getColour() {
        return colour;
    }
}
