import java.util.Arrays;

    public class StreamOpgave {
        public static void main(String[] args) {
            int [] arr = {12, 34, 56, 98, 102};

            System.out.println("Java Stream");
            Arrays.stream(arr).forEach(System.out::println);
            System.out.println("Java Stream ");
            Arrays.stream(arr).average().ifPresent(System.out::println);
            System.out.println("Java Stream ");
            Arrays.stream(arr).max().ifPresent(System.out::println);
            System.out.println("Java Stream ");
            Arrays.stream(arr).min().ifPresent(System.out::println);
        }
    }

