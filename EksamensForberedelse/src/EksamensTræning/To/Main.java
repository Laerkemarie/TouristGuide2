package EksamensTræning.To;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> shelterAnimals = new ArrayList<>();

        shelterAnimals.add(new Dog("Rollo"));
        shelterAnimals.add(new Dog("Lisa"));
        shelterAnimals.add(new Dog("Edward"));

        shelterAnimals.add(new Cat("Elsa"));
        shelterAnimals.add(new Cat("Tuborg"));
        shelterAnimals.add(new Cat("Lizzie"));

        for (Animal animal : shelterAnimals) {
            System.out.println(animal.getName() + " siger: " + animal.makeSound());
        }

    }
}
