package ForLoop;

public class AsciiArtAdvanced {
    public static void main(String[] args) {
        int antalRækker = 5;
        for (int i = antalRækker; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int antalRækker2 = 5;
        for (int i = 1; i <= antalRækker; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("1");
            }
            System.out.println();
        }
    }
}

