package metoder;

public class MethodTest {
    public static void main(String[] args) {
        int a = 20;
        int b = 5;
        int c = 5;

        System.out.println("Sum af a og b lagt sammen er: " + sumOfNumbers(a,b));
        //method overload
        System.out.println("Sum af a og b og c lagt sammen er: " + sumOfNumbers(a,b, c));
        System.out.println("Sum af a og b divideret er: " + numbersDivided(a,b));
        System.out.println("Sum af a og b ganget er: " + numersTimesEachother(a,b));
    }

    public static int sumOfNumbers(int x, int y) {
        return x + y;
    }
    //method overload
    public static int sumOfNumbers(int x, int y, int z) {
        return x + y + z;
    }

    public static int numbersDivided(int x, int y) {
        return x / y;
    }

    public static int numersTimesEachother(int x, int y) {
        return x * y;
    }
}
