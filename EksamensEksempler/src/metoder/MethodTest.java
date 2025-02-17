package metoder;

public class MethodTest {

    public static int sumOfNumbers(int x, int y) {
        return x + y;
    }

    public static int sumOfNumbers(int x, int y, int z) {
        return x + y + z;
    }

    public static int numbersDivided(int x, int y) {
        return x / y;
    }

    public static int numbersTimesEachOther(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        System.out.println(sumOfNumbers(5, 11));

        System.out.println("Summen af a og b lagt sammen: " + sumOfNumbers(a,b));
        System.out.println("Summen af a, b og c lagt sammen: " + sumOfNumbers(a, b, c));
        System.out.println("Summen af a og b divideret med hinanden: " + numbersDivided(a, b));
        System.out.println("Summen af a og b ganget med hinanden: " + numbersTimesEachOther(a, b));
    }
}
