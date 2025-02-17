package LoopExample;

public class NumberLoop {
    public static void main(String[] args) {

        int[] numbers = {2, 5, 7,75, 75,  9, 55, 24, 75, 31, 67, 42};

        //for loop
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
         }
        // for each loop
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Det største tal er: " + max);

        int count = 0;
        int index = 0;
        while (index < numbers.length) {
            if (numbers[index] == max) {
                count++;
            }
            index++;
        }
        System.out.println("Det største antal tal optræder " + count + " gange");
    }
}
