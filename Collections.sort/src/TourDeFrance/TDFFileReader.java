package TourDeFrance;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TDFFileReader {
    private String fileName;

    public TDFFileReader(String fileName) {
        this.fileName = fileName;
    }

    public List<Cyclist> readFile() {
        List<Cyclist> cyclists = new ArrayList<>();

        if (fileName == null || fileName.isEmpty()) {
            System.out.println("FEJL: Filnavnet er null eller tomt!");
            return cyclists;  // Returner tom liste, hvis filnavnet ikke er korrekt
        }

        try (Scanner scanner = new Scanner(new File(fileName))) {
            if (scanner.hasNextLine()) {
                scanner.nextLine();
            }

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(";");
                if (parts.length >= 3) {
                    String name = parts[1].trim();
                    String team = parts[2].trim();
                    cyclists.add(new Cyclist(name, team));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Filen blev ikke fundet" + fileName);
        }
        return cyclists;
    }
}
