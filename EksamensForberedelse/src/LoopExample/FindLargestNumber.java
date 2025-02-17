package LoopExample;

import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Please write a positive number");
        } else {
            int largestNumber = Integer.MIN_VALUE;

            System.out.println("Enter " + n + " numbers:");
            int count = 0;
            while (count < n) {
                int number = scanner.nextInt();
                if (number > largestNumber) {
                    largestNumber = number;
                }
                count++;
            }
            System.out.println("The largest number is: " + largestNumber);
            scanner.close();
        }
    }
}
