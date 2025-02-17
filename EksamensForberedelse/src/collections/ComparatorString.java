package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorString {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Elefant");
        words.add("Kat");
        words.add("Sommerfugl");
        words.add("Hund");

        System.out.println("Før sortering " + words);

        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String word1, String word2) {
                return word1.compareTo(word2);
            }
        });

        System.out.println("Efter sortering (efter alfabetisk rækkefølge): " + words);

        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String word1, String word2) {
                return Integer.compare(word1.length(), word2.length());
            }
        });

        System.out.println("Efter sortering (efter tekstlængde): " + words);
    }
}
