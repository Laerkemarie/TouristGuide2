public class FirstFunctionOpgave {
    //learning functions
    public static void duplicateNumber(int num) {

        System.out.println("The duplicated number is: " + num*2);
    }

    public static int gangNumbers (int number1, int number2) {
        int result = number1*number2;
        System.out.println("We are in gangNumbers " + result);
        return result;
    }

    public static void main(String[] args) {
        int number = 7;
        int result = 0;
        duplicateNumber(number);
        result = gangNumbers(5,3);
        System.out.println("We are in main " + result);
    }
}

