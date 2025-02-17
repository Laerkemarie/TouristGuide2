package loops;

public class LoopExample {

    public static void main(String[] args) {

        //for loop
        System.out.println("For loop");
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //for each loop
        System.out.println("For each loop");
        int [] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }

        //while loop
        System.out.println("While loop");
        int j = 0;
        while (j < 5) {
            System.out.println(j);
            j++;
        }

        //do while loop
        System.out.println("Do while loop");
        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while (k < 5);
    }
}
