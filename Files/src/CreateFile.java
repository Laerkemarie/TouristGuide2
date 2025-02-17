import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("nyfil.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists");
            }
            PrintStream printStream = new PrintStream("nyfil.txt");
            printStream.println("Files in java might be tricky, but it's fun enough!");
            printStream.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}
