package arrayList;

import java.util.ArrayList;

public class ArrayListNumbers {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(5);
        numbers.add(8);
        numbers.add(10);
        numbers.add(4);

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Tal som eksisterer i listen: " + numbers);
        System.out.println("Tallene i arrayet lagt sammen: " + sum);
    }
}
