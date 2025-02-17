package MovieFinder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {

    public ArrayList<Movie> readMovies() {
        ArrayList<Movie> movies = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File("resources/film-imdb.csv"))) {


            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();

                if (line.isEmpty()) {
                    continue;
                }

                String[] details = line.split(";");

                if (details.length < 6) {
                    System.out.println("Fejl, der mangler data: " + line);
                    continue;
                }

                try {
                    String title = details[2].trim();
                    String subject = details[3].trim();
                    int year = Integer.parseInt(details[0].trim());
                    double length = Double.parseDouble(details[1].trim());
                    int popularity = Integer.parseInt(details[4].trim());
                    boolean wonAward = details[5].trim().equalsIgnoreCase("Yes");

                    Movie movie = new Movie(title, subject, year, length, popularity, wonAward);
                    movies.add(movie);

                } catch (NumberFormatException e) {
                    System.out.println("Fejl ved parsin af tal i linje: " + line);
                    continue;
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }

        return movies;
    }
}