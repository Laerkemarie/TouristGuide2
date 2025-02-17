package marsvin;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class GuineaPigManager {
    private static final String INPUT_FILE = "marsvin.txt";

    // 1. Læs data fra tekstfil
    public void run() {
        File file = new File(INPUT_FILE);
        if (!file.exists()) {
            System.err.println("Input file does not exist: " + file.getAbsolutePath());
            return;
        }


        List<Marsvin> marsvinList = readFromFile(INPUT_FILE);

        // 2. Sorter efter navn og skriv til fil
        Collections.sort(marsvinList);
        writeToFile(marsvinList, "navn.txt");

        // 3. Sorter efter race og skriv til fil
        marsvinList.sort(Comparator.comparing(Marsvin::getRace));
        writeToFile(marsvinList, "race.txt");

        // 4. Sorter efter foder og skriv til fil
        marsvinList.sort(Comparator.comparingInt(Marsvin::getFoder).reversed());
        writeToFile(marsvinList, "foder.txt");
    }

    private List<Marsvin> readFromFile(String filename) {
        List<Marsvin> marsvinList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) continue;
                String[] parts = line.split(";");
                if (parts.length == 3) {
                    String navn = parts[0].trim();
                    String race = parts[1].trim();
                    int foder = Integer.parseInt(parts[2].trim());
                    marsvinList.add(new Marsvin(navn, race, foder));
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return marsvinList;
    }

    private void writeToFile(List<Marsvin> marsvinList, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Marsvin marsvin : marsvinList) {
                writer.write(marsvin.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }
}
