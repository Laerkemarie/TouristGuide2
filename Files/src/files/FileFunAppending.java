package files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FileFunAppending {
    public static void main (String[] args) {
        new FileFunAppending().run();
    }

    public void run() {

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("src/files/outputt.txt", true);
            PrintStream printStream = new PrintStream(fileOutputStream);
            printStream.println("Hey you");
            printStream.println("");
            printStream.println("Bye you!");
            printStream.println("Adding line 1");
            printStream.println("Adding line 2");
            printStream.println("Adding line 3");
            printStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("Kunne ikke finde filen");
            e.printStackTrace();
        }
    }


}
