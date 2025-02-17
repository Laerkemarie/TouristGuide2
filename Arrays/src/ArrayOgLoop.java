public class ArrayOgLoop {
    public static void main(String[] args) {
        int[] myArray = new int[8];
        myArray[0] = 34;
        myArray[7] = 117;

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }
}

