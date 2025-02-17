package match;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MatchMain {

    public static void main(String[] args) {
        ArrayList<Match> kampe = new ArrayList<>();

        kampe.add(new Match(3,1));
        kampe.add(new Match(2,1));
        kampe.add(new Match(3,3));
        kampe.add(new Match(1,1));
        kampe.add(new Match(2,1));
        kampe.add(new Match(0,4));

        Collections.sort(kampe, new java.util.Comparator<Match>() {
            @Override
                    public int compare(Match m1, Match m2) {
                return Integer.compare(m2.goalDifferential(), m1.goalDifferential());
            }
        });

        System.out.println("Kampe sorteret efter største scoreforskel: ");
        for (Match match : kampe) {
            System.out.println(match.team1Score + " : " + match.team2Score + " - " + match.matchWinner());
        }
    }
}
