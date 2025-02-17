package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {
    public static void main(String[] args) {

        File file = new File("src/files/output.txt");

        try {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
    } catch (FileNotFoundException e) {
            System.out.println("Filen blev ikke fundet!" + e.getMessage());
        }
        }
}
