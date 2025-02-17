package metoder;

public class PassBy {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Number before: " + num);
        modifyedNum(num);
        System.out.println("Number after: " + num);

        StringBuilder stringBuilder = new StringBuilder("Hello");
        modifyString(stringBuilder);
        System.out.println("Modified String: " + stringBuilder);
    }

    public static void modifyedNum(int n) {
        n += 5;
    }


    public static void modifyString(StringBuilder str) {
        str.append(" world");
    }
}
