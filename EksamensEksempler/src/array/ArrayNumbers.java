package array;

public class ArrayNumbers {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int num : numbers) {
        sum += num;
            System.out.println("Tallene som indgår i arrayet: " + num);
        }
        System.out.println("Værdien af tallene i arrayet lagt sammen: " + sum);
    }
}
