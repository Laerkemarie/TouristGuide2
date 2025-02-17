package funException;

public class FunException {

    public FunException() {
        System.out.println("Nu har jeg oprettet et objekt af min klasse" + "\n");
    }

    public void run() {

        String[] mitArray = new String[10];

//        for (int i = 0; i <= mitArray.length; i++) {
//            mitArray[i] = "Element: " + i;
//        }
//
//        for (String element : mitArray) {
//            System.out.println(element);
//        }

        for (int i = 0; i <= mitArray.length; i++) {
            try {
                mitArray[i] = "Element: " + i;

                System.out.println("mitArray[" + i + "] = " + mitArray[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("FEJL: Forsøger at tilgå index " + i + ", som er uden for arrayets grænser!");
            }

        }

     }
}
