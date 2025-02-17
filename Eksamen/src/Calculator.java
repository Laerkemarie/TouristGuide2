public class Calculator {
    private int numberA;
    private int numberB;

    public Calculator(int numberA, int numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }
    public int getNumberA() {
        return numberA;
    }
    public int getNumberB() {
        return numberB;
    }
    public void setNumberA(int numberA) {
        this.numberA = numberA;
    }
    public void setNumberB(int numberB) {
        this.numberB = numberB;
    }

    public static int addNumbers(int numberA, int numberB) {
        return numberA + numberB;
    }

    public static double kvadratrod(int numberA, int numberB) {
        return Math.sqrt(addNumbers(numberA, numberB));
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(addNumbers(a, b));
        System.out.println(kvadratrod(10, 20));
    }
}
