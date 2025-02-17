package collectionsSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorString {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("elefant");
        words.add("løve");
        words.add("tiger");
        words.add("abe");

        System.out.println("Arraylisten inden sortering: " + words);

        Collections.sort(words);

        System.out.println("Arraylisten efter sortering efter alfabetisk rækkefølge: " + words);

        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String word1, String word2) {
                return Integer.compare(word1.length(), word2.length());
            }
        });

        System.out.println("Arraylisten efter sortering efter tekstlængde: " + words);
    }
}
