package metoder;

public class Example {
    public static void main(String[] args) {
        int number = 10;
        number = modifyValue(number);
        System.out.println(number);
        printMessage("Dette er en besked");
    }

    public static int modifyValue(int num) {
        num = 20;
        return num;
    }

    //metode der ikke returnerer noget
    public static void printMessage(String message) {
        System.out.println(message);
    }
}

