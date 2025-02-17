package euroMålScorer;

import java.io.FileNotFoundException;
import java.util.*;

public class Statistics {
    public List<MatchResult> matchResults;

    public Statistics() throws FileNotFoundException {
        MatchResultFileReader fileReader = new MatchResultFileReader();
        this.matchResults = fileReader.readFile();
    }

    public Set<String> getGoalScorers() {
        Set<String> goalScorers = new HashSet<>();
        for (MatchResult result : matchResults) {
            goalScorers.addAll(result.getGoalScores());
        }
        return goalScorers;
    }

    public Map<String, Integer> getGoalScoresWithTotal() {
        Map<String, Integer> goalScorerTotal = new HashMap<>();
        for (MatchResult result : matchResults) {
            for (String scorer : result.getGoalScores()) {
                goalScorerTotal.put(scorer, goalScorerTotal.getOrDefault(scorer, 0) + 1);
            }
        }
        return goalScorerTotal;
    }

    public int getNumberOfGoals(String goalScorer) {
        int count = 0;
        for (MatchResult result : matchResults) {
            count += Collections.frequency(result.getGoalScores(), goalScorer);
        }
        return count;
    }
}
