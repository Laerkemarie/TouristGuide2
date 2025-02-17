public class CompareArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = array2;

        System.out.println(array1 == array2);
        System.out.println(array3 == array2);
        System.out.println();

        if (array1 == array2) {
            System.out.println("De er ens");

        } else {
            System.out.println("De er ikke ens");
        }
        if (array3 == array2) {
            System.out.println("De er ens");
        } else {
            System.out.println("De er ikke ens");
        }
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            if (array1 == array2) {
                System.out.println("De er ens");
            } else {
                System.out.println("De er ikke ens");
            }
        }
    }
}

