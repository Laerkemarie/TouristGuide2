package collectionsSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {

        ArrayList<String> animal = new ArrayList<>();
        animal.add("Elefant");
        animal.add("Tiger");
        animal.add("Abe");
        animal.add("Isbjørn");

        System.out.println("Arraylist af dyr inden sortering: " + animal);

        Collections.sort(animal);
//        Collections.sort(animal, new Comparator<String>() {
//            @Override
//            public int compare(String word1, String word2) {
//                return word1.compareTo(word2);
//            }
//        });

        System.out.println("Arrayliste af dyr efter sortering: " + animal);
    }
}
