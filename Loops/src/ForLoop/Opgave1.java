package ForLoop;

public class Opgave1 {
    public static void main(String[] args) {

        //simpelt gange stykke, opgave 1.1
        for (int i = 1; i <= 4; i++) {
            System.out.println("2 gange " + i + " = " + (i * 2));
        }

        //opgave 1.2, printer talrække der stiger med 2
        System.out.println(" ");
        for (int i = 2; i <= 12; i = i + 2) {
            System.out.print(i + " ");
        }

        //for loop, printer talrække der stiger med 15
        System.out.println(" ");
        System.out.println(" ");
        for (int i = 4; i <= 79; i = i + 15) {
            System.out.print(i + " ");
        }

        //for loop, printer talrække der falder med 10
        System.out.println(" ");
        System.out.println(" ");
        for (int i = 30; i >= -20; i = i - 10) {
            System.out.print(i + " ");
        }

        //for loop, printer talrække der stiger med 4
        System.out.println(" ");
        System.out.println(" ");
        for (int i = -7; i <= 13; i = i + 4) {
            System.out.print(i + " ");
        }

        //for loop, printer talrække der falder med 3
        System.out.println(" ");
        System.out.println(" ");
        for (int i = 97; i >=82; i = i - 3) {
            System.out.print(i + " ");
        }
    }
}

