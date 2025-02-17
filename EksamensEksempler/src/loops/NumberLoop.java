package loops;

public class NumberLoop {
    public static void main(String[] args) {

        //for loop
        int [] numbers = {2, 5, 7, 9, 13};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        //for each
        for (int number : numbers) {
            System.out.println(number);
        }

        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Det største tal i arrayet er: " + max);
    }
}
