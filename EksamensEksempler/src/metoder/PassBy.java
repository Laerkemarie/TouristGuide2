package metoder;

public class PassBy {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Tal før: " + num);
        num = modifyedNum(num);
        System.out.println("Tal efter: " + num);
    }

//    public static void modifyedNum(int n) {
//        n += 5;
//    }

    public static int modifyedNum(int num) {
        num = 20;
        return num;
    }
}
