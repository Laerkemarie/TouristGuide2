package IfElseOgSwitch;

import java.util.Scanner;

public class AgeExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Indtast din alder i tal:");

        int age = scanner.nextInt();

        if (age < 13) {
            System.out.println("Du er et barn");
        } else if (age >= 13 && age <= 17) {
            System.out.println("Du er teenager");
        } else {
            System.out.println("Du er voksen");
        }
    }
}
