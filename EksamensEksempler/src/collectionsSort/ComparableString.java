package collectionsSort;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableString {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Kim");
        names.add("Martin");
        names.add("Anna");
        names.add("Liv");

        System.out.println("Arralisten før sortering: " + names);
        Collections.sort(names);
        System.out.println("Arraylisten efter sortering: " + names);
    }
}
