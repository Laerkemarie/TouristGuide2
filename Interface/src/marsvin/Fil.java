package marsvin;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class Fil {
    public static void main(String[] args) {
        try {
            File myObj = new File("marsvin.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists");
            }
            PrintStream printStream = new PrintStream("marsvin.txt");
            printStream.println("Pjuske;Roset;30\n" +
                    "Putte;Glathåret;55\n" +
                    "Lunte;Roset;36\n" +
                    "Perle;Roset;38\n" +
                    "Banse;Angore;60");
            printStream.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
