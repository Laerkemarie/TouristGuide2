package metoder;

public class Method {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        System.out.println(add(5, 7));
        System.out.println(add(10,8));

        printMessage("Dette er en metode som ikke returnerer noget!");
    }
}
