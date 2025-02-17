package metoder;

public class Parameteroverførsel {
    public static void main(String[] args) {
        int num = 10;
        num = modifyPrimitiveNum(num);
        System.out.println("Efter metoden: " + num);
    }

    // her vil int forblive 10 på trods af value er sat som 20
//    public static void modifyPrimitiveNum(int value) {
//        value = 20;
//    }

    // her vil int blive ændret til 20
    public static int modifyPrimitiveNum(int value) {
        return value = 20;
    }
}
