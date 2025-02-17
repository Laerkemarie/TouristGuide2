package LoopExample;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an positive number:");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Please write a positive number.");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            scanner.close();
            System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);
        }
    }
}
