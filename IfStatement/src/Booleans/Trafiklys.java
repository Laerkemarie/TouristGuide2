package Booleans;

import java.util.Scanner;

public class Trafiklys {
    public static void main(String[] args) {
        System.out.println("Vælg én farve mellem rød, gul eller grøn:");
        Scanner farve = new Scanner(System.in);
        String farvevalg = farve.nextLine();

        switch (farvevalg) {
            case "rød":
                System.out.print("Stop, ");
                break;

            case "gul":
                System.out.print("Vent, ");
                break;

            case "grøn":
                System.out.print("Gå, ");
                break;

            default:
                System.out.println("Ugyldig farve");
                break;
        }
        String result = farvevalg.equals("rød") ? "det er ikke sikkert at krydse vejen" : "det er sikkert at krydse vejen";
        System.out.println(result);
    }
}

