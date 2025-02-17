package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileFunReading {
    public static void main (String[] args) {
        new FileFunReading().run();
    }

    public void run() {
        File file = new File("src/files/text.txt");

        try {
            // læser linje for linje i filen
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Filen blev ikke fundet");
            e.printStackTrace();
        }
    }
}
