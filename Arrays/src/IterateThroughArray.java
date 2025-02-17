public class IterateThroughArray {
    public static void main(String[] args) {
        //Lav en main-metode og et double-array med værdierne {4.5, 25.3, 12.1, 34.0, 15.5 }.
        double[] doubleTal = {4.5, 25.3, 12.1, 34.0, 15.5};

        //Skriv et for-loop der itererer gennem et array, opløfter hvert tal i anden potens og skriver det ud til konsollen
        for (int i = 0; i < doubleTal.length; i++) {
            System.out.println(Math.pow(doubleTal[i], 2));
        }

        //Skriv et for-loop der finder den mindste værdi i arrayet.
        System.out.println();
        double smallest = doubleTal[0];
        for (int i = 0; i < doubleTal.length; i++) {
            if (doubleTal[i] < smallest) {
                doubleTal[i] = smallest;
            }
        }
        System.out.println(smallest);

        //Skriv et for-loop der finder den største værdi i arrayet
        System.out.println();
        double largest = doubleTal[0];
        for (int i = 0; i < doubleTal.length; i++) {
            if (doubleTal[i] > largest) {
                largest = doubleTal[i];
            }
        }
        System.out.println(largest);

        /* Skriv et for-loop der leder efter værdien 12.1.
        Hvis det tal findes i arrayet skal programmet udskrive ”Hurra! Jeg fandt 12.1.
        Det stod på index ” + hvilket index det så end stod på.*/

        System.out.println();
        for (int i = 0; i < doubleTal.length; i++) {
            if (doubleTal[i] == 12.1) {
                System.out.println("Hurra! Jeg fandt " + doubleTal[i] + " Det stod på index " + i);
            }
        }
    }
}

