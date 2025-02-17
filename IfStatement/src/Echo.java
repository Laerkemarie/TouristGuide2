import java.util.Scanner;

public class Echo {
        public static void main(String[] args) {
            String line;

            Scanner input = new Scanner(System.in);
            System.out.println("Hvad drikker møller?");

            line = input.nextLine();

            for (int i = 0; i <= 3; i++) {
                System.out.println(line);
            }
        }
}
