package miniOpgaver.NummerEt;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();

        dogs.add(new Dog("King", 6));
        dogs.add(new Dog("Buller", 10));
        dogs.add(new Dog("Mille", 4));
        dogs.add(new Dog("Lis", 11));

        // Find den ældste hund
        Dog oldestDog = findOldestDog(dogs);

        // Udskriv information om den ældste hund
        if (oldestDog != null) {
            System.out.println("Den ældste hund er: " + oldestDog.getName() +
                    " med en alder på " + oldestDog.getAge() + " år" +
                    " (" + oldestDog.getAgeInDogYears() + " hundeår).");
        }
    }

    // Metode til at finde den ældste hund i en liste
    public static Dog findOldestDog(ArrayList<Dog> dogs) {
        if (dogs.isEmpty()) {
            return null;
        }

        Dog oldest = dogs.get(0); // Antag den første hund er den ældste

        for (Dog dog : dogs) {
            if (dog.getAge() > oldest.getAge()) {
                oldest = dog;
            }
        }
        return oldest;
    }
}
