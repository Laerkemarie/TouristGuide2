package LoopExample;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        int payRate = 190;
        int maxHours = 40;

        System.out.println("How many hours did you work this week?");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();

        while(hoursWorked > maxHours) {
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try agian");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();

        double gross = payRate * hoursWorked;
        System.out.println("Gross pay: DKK " + gross);
    }
}
