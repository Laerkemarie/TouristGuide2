package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FileWriting {
    public static void main(String[] args) {

        File file = new File("src/files/output.txt");

        try {
            PrintStream printStream = new PrintStream(file);
            printStream.println("Dette er første linje");
            printStream.println("Dette er anden linje");
            printStream.println("Dette er tredje linje");
            printStream.println("Farvel :)");
            printStream.close();
            System.out.println("Linjer er skrevet til filen");
        } catch (FileNotFoundException e) {
            System.out.println("Kunne ikke finde filen!" + e.getMessage());
        }
    }
}
