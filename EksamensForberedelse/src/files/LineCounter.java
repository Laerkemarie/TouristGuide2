package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class LineCounter {
    public static void main(String[] args) {

        try {
            PrintStream testFile = new PrintStream("input.txt");
            testFile.println("Dette er linje 1");
            testFile.println("Dette er linje 2");
            testFile.println("Dette er linje 3");
            testFile.println("Dette er linje 4");
            testFile.close();

            File inputFile = new File("input.txt");
            int lineCount = 0;

            try (Scanner scanner = new Scanner(inputFile)) {
                while (scanner.hasNextLine()) {
                    scanner.nextLine();
                    lineCount++;
                }

                PrintStream output = new PrintStream("output.txt");
                output.println("Antal linjer i input filen: " + lineCount);
                output.close();

                System.out.println("Linjer talt og skrevet til output.txt");
            }

        } catch (FileNotFoundException e) {
                System.out.println("Fejl: " + e.getMessage());
            }
        }
    }