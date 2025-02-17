package MovieFinder;

import java.util.ArrayList;

public class AnalysisEngine {
    private ArrayList<Movie> movies;

    public AnalysisEngine(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    // Metode til at finde film med det længste navn
    public Movie findLongestTitle() {
        Movie longestTitleMovie = null;
        for (Movie movie : movies) {
            if (longestTitleMovie == null || movie.getTitle().length() > longestTitleMovie.getTitle().length()) {
                longestTitleMovie = movie;
            }
        }
        return longestTitleMovie;
    }

    // Metode til at tælle Star Trek-film
    public int countStarTrekMovies() {
        int count = 0;
        for (Movie movie : movies) {
            if (movie.getTitle().toLowerCase().contains("star trek")) {
                count++;
            }
        }
        return count;
    }

    // Beregn gennemsnitlig længde af film
    public double calculateAverageLength() {
        double totalLength = 0;
        for (Movie movie : movies) {
            totalLength += movie.getLength();
        }
        return movies.size() > 0 ? totalLength / movies.size() : 0;
    }

    // Find maks antal ord i en filmtitel
    public int findMaxWordsInTitle() {
        int maxWords = 0;
        for (Movie movie : movies) {
            int wordCount = movie.getTitle().split(" ").length;
            if (wordCount > maxWords) {
                maxWords = wordCount;
            }
        }
        return maxWords;
    }

    // Tæl film, der har vundet priser
    public int countAwardWinningMovies() {
        int count = 0;
        for (Movie movie : movies) {
            if (movie.hasWonAward()) {
                count++;
            }
        }
        return count;
    }
}

