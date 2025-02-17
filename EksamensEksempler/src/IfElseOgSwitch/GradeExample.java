package IfElseOgSwitch;

public class GradeExample {
    public static void main(String[] args) {

        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Fantastisk!");
                break;
            case 'B':
                System.out.println("Ganske godt");
                break;
            case 'C':
                System.out.println("Acceptabelt");
                break;
            default:
                System.out.println("Karakteren der er indtastet er ikke gyldig!");
        }
    }
}
