package euroMålScorer;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Statistics stats = new Statistics();

        System.out.println("Unikke målscorer: " + stats.getGoalScorers());
        System.out.println("Antal mål: " + stats.getNumberOfGoals("Poulsen"));
    }
}
