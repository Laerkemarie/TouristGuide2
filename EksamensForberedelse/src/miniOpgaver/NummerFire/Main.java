package miniOpgaver.NummerFire;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Far til fire", "Hans Hansen", 6));
        movies.add(new Movie("Mine søsters børn", "Mads Madsen", 3));
        movies.add(new Movie("Klovn the movie", "Frank Hvam", 10));

        Collections.sort(movies, new MovieRating());

        System.out.println("Film sorteret efter rating:");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
