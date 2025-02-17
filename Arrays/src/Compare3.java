import java.util.Arrays;

public class Compare3 {
    public static void main(String[] args) {
        int [] array1 = {1,2,3};
        int [] array2 = {1,2,3};
        int [] array3 = {4,5,6};

        System.out.println(Arrays.equals(array1, array2));
        System.out.println(Arrays.equals(array1, array3));
        System.out.println();

        //Array.toString() printer det ud som står i ens array
        System.out.println("array 1 er " + Arrays.toString(array1));
        System.out.println("array 2 er " + Arrays.toString(array2));
        System.out.println("array 3 er " + Arrays.toString(array3));
    }
}

