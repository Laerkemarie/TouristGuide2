import java.util.Scanner;

public class Tommeberegner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); {
            System.out.println("Hej, jeg kan omregne tommer til centimeter. Angiv et antal tommer: ");
        }

        double cm = input.nextDouble();
        double tommer = cm * 2.54;{
            System.out.println(cm + "cm er" + tommer + "tommer");
        }
    }
}

