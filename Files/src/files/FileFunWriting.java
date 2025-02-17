package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FileFunWriting {
    public static void main(String [] args) {
        new FileFunWriting().run();

    }
    public void run() {
        File file = new File("src/files/output.txt");

        try {
            PrintStream printStream = new PrintStream(file);
            printStream.println("Dette er den første linje i filen.");
            printStream.println("Dette er den anden linje.");
            printStream.println("Farvel!");
            printStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Kunne ikke finde filen");
            e.printStackTrace();
        }
    }
    }