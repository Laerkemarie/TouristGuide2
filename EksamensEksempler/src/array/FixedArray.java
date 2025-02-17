package array;

public class FixedArray {
    public static void main(String[] args) {

        int[] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        //for each loop
        System.out.println("Arrayets værdier er:");
        for (int number : numbers) {
            System.out.println(number);

          //for loop
//        System.out.println("Arrayets værdier er: ");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);
        }

        int sum = 0;
        int max = numbers[0];

        for (int num : numbers) {
            sum += num;
            if (num > max) {
                max = num;
            }
        }

        System.out.println();
        System.out.println("Summen af arrayet er: " + sum);
        System.out.println("Den højeste værdi i arrayet er: " + max);
    }
}
