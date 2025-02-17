package arrays;

public class ArraySum {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60};
        int sum = 0;

        for(int num : numbers) {
            sum += num;
        }

        System.out.println("Summen af arrayet er: " + sum);
    }
}
