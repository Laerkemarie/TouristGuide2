package ForLoop;

public class Opgave2 {
    //opgave 2.1, skriv hello world 3 gange
    public static void main(String[] args) {
        for (int i = 0; i <=2; i++) {
            System.out.println("Hello World ");
        }

        //opgave 2.2, print alle tal fra 1 - 10
        System.out.println(" ");
        for (int i = 1; i <= 10;i++) {
            System.out.print(i + " ");
        }

        //opgave 2.3, print '*' 10 gange
        System.out.println(" ");
        System.out.println(" ");
        for (int i = 0; i <=9;i++) {
            System.out.print("* ");
        }

        //opgave 2.4, print talle fra 5 til -5
        System.out.println(" ");
        System.out.println(" ");
        for (int i =5; i >=-5;i--) {
            System.out.print(i + (" "));
        }

        //opgave 2.5, print hver 3 tal fra 5 til 30
        System.out.println(" ");
        System.out.println(" ");
        for (int i = 5; i <= 30; i = i +3) {
            System.out.print(i + " ");
            System.out.println(" ");
        }
    }
}

