package wordCount;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static wordCount.MobyDickAnalyzer.*;

public class Main {
    public static void main(String[] args) {
        try {
            String fileName = "C:/Users/laerk/Downloads/MobyDick.txt";

            List<String> words = readWordsFromFile(fileName);

            // 1. Find de mest forekommende ord
            Map<String, Integer> wordCount = countWordOccurnces(words);
            List<String> frequentWords = findMostFrequentWords(wordCount, 2000);
            System.out.println("Ord med mere end 2000 forekomster: " + frequentWords);

            // 2. Antal unikke ord
            int uniqueWordCount = countUniqueWords(words);
            System.out.println("Antal unikke ord: " + uniqueWordCount);

            // 3. Find trebogstavsord der starter med 'A'
            Set<String> threeLetterWords = findThreeLetterWordsStartingWithA(words);
            System.out.println("Tre bogstavsord der starter med 'A': " + threeLetterWords);

        } catch (IOException e) {
            System.out.println("Fejl ved læsning af fil: " + e.getMessage());
        }
    }
}

