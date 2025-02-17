package MovieFinder;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        FileReader fileReader = new FileReader();
        ArrayList<Movie> movies = fileReader.readMovies();

        if (movies.isEmpty()) {
            System.out.println("Der blev ikke læst nogle film fra csv filen.");
            return;
        }

        AnalysisEngine analysisEngine = new AnalysisEngine(movies);

//        Movie longestTitleMovie = analysisEngine.findLongestTitle();
//
//        if (longestTitleMovie != null) {
//            System.out.println("Film med det længste navn: " + longestTitleMovie.getTitle());
//        } else {
//            System.out.println("Ingen film blev fundet i listen.");
//        }

        System.out.println("Film med det længste navn: " + analysisEngine.findLongestTitle().getTitle());
        System.out.println("Antal Star Trek film: " + analysisEngine.countStarTrekMovies());
        System.out.printf("Gennemsnitlig længde af film i timer: %.2f\n", analysisEngine.calculateAverageLength());
        System.out.println("Maksimalt antal ord i en filmtitel: " + analysisEngine.findMaxWordsInTitle());
        System.out.println("Antal film der har vundet priser: " + analysisEngine.countAwardWinningMovies());
    }
}
