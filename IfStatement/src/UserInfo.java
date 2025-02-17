import java.util.Scanner;

public class UserInfo {
    public class Userinfo {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Skriv dit navn: ");

            String navn = scanner.nextLine();

            System.out.println("Hvad er din ynglingsfarve?: ");

            String ynglingsfarve = scanner.nextLine();

            System.out.println("Hej " + navn + " din ynglingsfarve er " + ynglingsfarve);
        }
    }
}
