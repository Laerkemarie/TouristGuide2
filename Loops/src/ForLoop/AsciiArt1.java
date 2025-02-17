package ForLoop;

import java.util.Scanner;

public class AsciiArt1 {
    // opret en ascii art
    public static void main(String[] args) {
        // scanner er tilføjet for at få input fra user
        Scanner sc = new Scanner(System.in);

        // bed user om at skrive et tal
        System.out.println("Skriv et tal:");
        int antalRækker = sc.nextInt();

        // der skal oprettes 2 loops, et for antal rækker og et for antal "*"
        for (int i = 1; i <= antalRækker; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // println skrives for at "*" kommer ud under hinanden
            System.out.println();
        }
        // her lukkes loopet
        sc.close();
    }
}

