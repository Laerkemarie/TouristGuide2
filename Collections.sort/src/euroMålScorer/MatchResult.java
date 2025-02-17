package euroMålScorer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchResult {
    private String teams;
    private List<String> goalScores;

    public MatchResult(String teams, List<String> goalScores) {
        this.teams = teams;
        this.goalScores = goalScores;
    }

    public String getTeams() {
        return teams;
    }

    public List<String> getGoalScores() {
        return goalScores;
    }
}

