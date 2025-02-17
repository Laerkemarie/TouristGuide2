package LoopExample;

public class LoopExample {
    public static void main(String[] args) {

        //for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop i: = " + i);
        }

        //for each loop
        System.out.println();
        int[] numbers = {10, 20, 30, 40};
        for (int number : numbers) {
            System.out.println("For each loop: number = " + number);
        }

        //while loop
        System.out.println();
        int j = 2;
        while (j < 5) {
            System.out.println("While loop: j = " + j);
            j++;
        }

        //do while loop
        System.out.println();
        int k = 0;
        do {
            System.out.println("Do while loop: k = " + k);
            k++;
        } while (k < 3);
    }
}
