package collectionsSort;

import java.util.ArrayList;
import java.util.Collections;

public class Testt {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(8);
        numbers.add(2);
        numbers.add(10);

        System.out.println("Arrayliste af numre inden sortering: " + numbers);

        Collections.sort(numbers);
        System.out.println("Arrayliste efter sortering: " + numbers);
    }
}
