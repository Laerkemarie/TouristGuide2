package miniOpgaver.NummerFem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Opret en liste af kampe
        List<Match> matches = new ArrayList<>();
        matches.add(new Match(3, 1));
        matches.add(new Match(2, 2));
        matches.add(new Match(5, 0));
        matches.add(new Match(1, 4));

        // Vis alle kampe og vinderen
        System.out.println("Alle kampe og resultater:");
        for (Match match : matches) {
            System.out.println(match + " - " + match.getWinner());
        }

        // Find kampen med den største scoreforskel
        Match largestDifferenceMatch = null;
        int largestDifference = 0;
        for (Match match : matches) {
            int difference = match.getScoreDifference();
            if (difference > largestDifference) {
                largestDifference = difference;
                largestDifferenceMatch = match;
            }
        }

        // Vis kampen med den største scoreforskel
        System.out.println("\nKampen med den største scoreforskel:");
        if (largestDifferenceMatch != null) {
            System.out.println(largestDifferenceMatch + " - Score difference: " + largestDifference);
        }
    }
}
