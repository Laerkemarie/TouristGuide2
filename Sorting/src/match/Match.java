package match;

public class Match {
    int team1Score;
    int team2Score;

    public Match(int team1Score, int team2Score){
        this.team1Score = team1Score;
        this.team2Score = team2Score;
    }

    public String matchWinner(){
        if(team1Score > team2Score) {
            return "Team 1 vinder!";
        } else if(team1Score < team2Score) {
            return "Team 2 vinder!";
        } else {
            return "Uafgjort";
        }
    }
    public int goalDifferential(){
        return Math.abs(team1Score - team2Score);
    }
}
