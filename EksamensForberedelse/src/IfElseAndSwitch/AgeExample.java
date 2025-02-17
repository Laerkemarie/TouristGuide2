package IfElseAndSwitch;

import java.util.Scanner;

public class AgeExample {
    public static void main(String[] args) {

        System.out.println("Hvor gammel er personen? Indtast alder:");
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        if (age < 13) {
            System.out.println("Personen er et barn");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Personen er teenager");
        } else {
            System.out.println("Personen er voksen");
        }
    }
}
