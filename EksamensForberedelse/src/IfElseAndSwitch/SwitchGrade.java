package IfElseAndSwitch;

import java.util.Scanner;

public class SwitchGrade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hvilken karakter har eleven fået? A, B eller C?");

        String grade = scanner.nextLine();

        switch (grade) {
            case "A":
                System.out.println("Fantastisk!");
                break;
            case "B":
                System.out.println("Godt gået!");
                break;
            case "C":
                System.out.println("Acceptabelt");
                break;
            default:
                System.out.println("Ugyldig karakter!");
        }
        scanner.close();
    }
}
