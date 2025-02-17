package metoder;

public class MethodOverload {
        public static void main(String[] args) {
            System.out.println(addNumbers(5, 10));       // Kalder metoden med 2 parametre
            System.out.println(addNumbers(5, 10, 15));  // Kalder metoden med 3 parametre
        }

        // Metode med to parametre
        public static int addNumbers(int a, int b) {
            return a + b;
        }

        // Metode med tre parametre
        public static int addNumbers(int a, int b, int c) {
            return a + b + c;
        }
    }

    //metode til overload med forskellige typer parametre

//    public class OverloadingExample {
//        public static void main(String[] args) {
//            printValue(42);           // Kalder metoden med en int
//            printValue("Hello!");     // Kalder metoden med en String
//        }
//
//        public static void printValue(int number) {
//            System.out.println("Integer: " + number);
//        }
//
//        public static void printValue(String text) {
//            System.out.println("String: " + text);
//        }
//    }
