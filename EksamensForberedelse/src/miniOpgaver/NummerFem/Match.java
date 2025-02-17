package miniOpgaver.NummerFem;

import java.util.ArrayList;

public class Match {
    private int team1Score;
    private int team2Score;

    public Match(int team1Score, int team2Score) {
        this.team1Score = team1Score;
        this.team2Score = team2Score;
    }

    public int getTeam1Score() {
        return team1Score;
    }

    public int getTeam2Score() {
        return team2Score;
    }

    public void setTeam1Score(int team1Score) {
        this.team1Score = team1Score;
    }

    public void setTeam2Score(int team2Score) {
        this.team2Score = team2Score;
    }
    public String getWinner() {
        if (team1Score < team2Score) {
            return ("Hold 2 vinder!");
        } else if (team1Score > team2Score) {
            return ("Hold 1 vinder!");
        } else {
            return ("Uafgjort!");
        }
    }
    public int getScoreDifference() {
        return Math.abs(team1Score - team2Score);
    }
    @Override
    public String toString() {
        return "Kampresultat: Hold 1 scorede " + team1Score + " mål og hold 2 scorede " + team2Score + " mål";
    }
}
