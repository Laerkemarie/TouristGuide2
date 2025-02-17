package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class LineCount {
    public static void main(String[] args) {

        File inputFile = new File("inputFile.txt");

        try {
            PrintStream printStream = new PrintStream("inputFile.txt");
            printStream.println("Linje 1");
            printStream.println("Linje 2");
            printStream.println("Linje 3");
            printStream.println("Linje 4");
            printStream.close();

            int linecount = 0;

            try (Scanner scanner = new Scanner(inputFile)) {
            while (scanner.hasNextLine()) {
                scanner.nextLine();
                linecount ++;
            }

            PrintStream output = new PrintStream("output");
            output.println("Antal linjer i filen: " + linecount);
            output.close();

                System.out.println("Linjer talt og skrevet til output filen");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Filen blev ikke fundet!" + e.getMessage());
        }
    }
}
