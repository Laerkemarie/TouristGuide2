public class Compare2 {
    public static void main(String[] args) {
        int [] array1 = {1,2,3};
        int [] array2 = {1,2,3};

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                System.out.println("True " + array1[i]);
            } else {
                System.out.println("False " + array1[i]);
            }
        }
    }
}

