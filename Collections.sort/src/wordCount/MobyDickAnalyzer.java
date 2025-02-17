package wordCount;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class MobyDickAnalyzer {

    public static List<String> readWordsFromFile(String fileName) throws IOException {
        List<String> words = new ArrayList<>();
        File file = new File(fileName);

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String word = scanner.next().toLowerCase().replaceAll("[^a-z]", "");
                if (!word.isEmpty()) {
                    words.add(word);
                }
            }
        }
        return words;
    }

    public static Map<String, Integer> countWordOccurnces(List<String> words) {
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        return wordCount;
    }

    public static List<String> findMostFrequentWords(Map<String, Integer> wordCount, int minOccurnes) {
        List<String> frequentWords = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > minOccurnes) {
                frequentWords.add(entry.getKey());
            }
        }
        return frequentWords;
    }

    public static int countUniqueWords(List<String> words) {
        Set<String> uniqueWords = new HashSet<>(words);
        return uniqueWords.size();
    }

    public static Set<String> findThreeLetterWordsStartingWithA(List<String> words) {
        Set<String> threeLetterWords = new HashSet<>();

        for (String word : words) {
            if (word.length() == 3 && word.startsWith("a")) {
                threeLetterWords.add(word);
            }
        }
        return threeLetterWords;
    }
}
