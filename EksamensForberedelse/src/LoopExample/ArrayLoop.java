package LoopExample;

public class ArrayLoop {
    public static void main(String[] args) {

        // for each loop
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int evenNumbers = 0;
        for (int number : numbers) {
            if (number %2 == 0) {
                evenNumbers += number;
            }
        }
        //For loop
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbers += numbers[i];
            }
        }
        System.out.println("Summen af lige tal er: " + evenNumbers);

        //find alle ulige numre i array

        int index = 0;
        System.out.println("Ulige numre i arrayet er: ");
        while (index < numbers.length) {
            if (numbers[index] % 2 != 0) {
                System.out.println(numbers[index]);
            }
            index++;
        }
    }
}
