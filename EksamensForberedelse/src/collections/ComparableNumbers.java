package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();

        integers.add(3);
        integers.add(8);
        integers.add(2);
        integers.add(5);
        integers.add(1);

        System.out.println("Før sortering: " + integers);
        Collections.sort(integers);
        System.out.println("Efter sortering " + integers);
    }
}
