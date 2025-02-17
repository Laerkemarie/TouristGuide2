import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class FilerTest {
    public static void main(String[] args) {

        // file input (reading from a file)
        Scanner inFile = null;
        try {
            inFile = new Scanner(new File("words.txt"));
            while (inFile.hasNextLine()) {
                String line = inFile.nextLine();
                System.out.println(line);
            }
            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        // file output (writing to a file) vha printstream og outfile
        try {
            PrintStream outFile = new PrintStream(new File("out.txt"));
            outFile.println("This is my first line in my output file");
            outFile.println("This is my second line in my output file");
            // funktion til at printe 10 tilfældige slag med 6 siders terning
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                outFile.println(random.nextInt(6) + 1);
            }
            outFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open file for writning");
        }

        // file output vha filewriter og write
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Filer kan være tricky, men de er sjove nok når man forstår dem");
            myWriter.write("\n" + "Nu har jeg skrevet endnu en linje kode i min fil");
            myWriter.close();
            System.out.println("Du har skrevet til en fil");
        } catch (IOException e) {
            System.out.println("En fejl er opstået");
            e.printStackTrace();
        }

        // Metode til at læse fra en fil, file input
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Der opstod en fejl");
            e.printStackTrace();
        }
    }
}


