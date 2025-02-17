import java.util.Scanner;

public class CookieOpskrift {
        public static void main(String[] args) {
            String line;

            Scanner input = new Scanner(System.in);
            System.out.print("Hvor mange cookies ønsker du at bage? ");

            double cookie = input.nextDouble();

            Scanner input2 = new Scanner(System.in);
            System.out.println("Hvor meget mel skal der bruges til én cookie? ");

            double mel = input2.nextDouble();

            System.out.println(mel * cookie + " gram skal der bruges til det ønskede antal cookies");
        }
    }

