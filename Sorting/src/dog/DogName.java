package dog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DogName {


    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();


        dogs.add(new Dog(5, "Guller"));
        dogs.add(new Dog(2, "Buster"));
        dogs.add(new Dog (7, "Henriette"));
        dogs.add(new Dog(8, "King"));

        Collections.sort(dogs, new Comparator<Dog>() {
            @Override
            public int compare(Dog d1, Dog d2) {
                return Integer.compare(d2.getAge(), d1.getAge());
            }
        });

        System.out.println("Fra ældst til yngst: ");
        for (Dog dog : dogs) {
            System.out.println(dog.age + ": " + dog.name);
        }

        //Avanceret metode
//        Collections.sort(dogs, Comparator.comparingInt(Dog::getAge).reversed());
//        System.out.println("Fra Ældst til yngst: ");
//        dogs.forEach(Dog -> System.out.println(Dog.age + ": " + Dog.name));

    }
}

