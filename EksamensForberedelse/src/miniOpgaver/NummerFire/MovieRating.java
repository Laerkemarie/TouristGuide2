package miniOpgaver.NummerFire;

import java.util.Comparator;

public class MovieRating implements Comparator<Movie> {
    @Override
    public int compare(Movie movie1, Movie movie2) {
        return Integer.compare(movie2.getRating(), movie1.getRating());
    }
}
