package collectionsSort;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(87);
        numbers.add(32);
        numbers.add(5);
        numbers.add(8);

        System.out.println("Arraylisten før sortering: " + numbers);
        Collections.sort(numbers);
        System.out.println("Arraylisten efter sortering: " + numbers);
    }
}
