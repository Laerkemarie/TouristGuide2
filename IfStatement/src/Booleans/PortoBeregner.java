package Booleans;

import java.util.Scanner;

public class PortoBeregner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hvor meget vejer brevet? Indtast i hele gram: ");
        int brev = sc.nextInt();
        int pris = 0;

        if (brev <=-1) {
            System.out.println("Et brev med denne vægt kan vi ikke sende");
            return;

        } else if (brev >= 1 && brev < 250) {
            pris = 25;

        } else if (brev >= 250 && brev < 500) {
            pris = 50;

        } else if (brev >= 500 && brev <= 2000) {
            pris = 75;

        } else if (brev > 2000) {
            System.out.println("Et brev med denne vægt kan vi ikke sende");
            sc.close();
            return;
        }
        System.out.println("Portoen for dit brev er: " + pris + " kr. ");
    }
}

