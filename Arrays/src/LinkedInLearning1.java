public class LinkedInLearning1 {
    public static void main(String[] args) {
        // array eksempel med for loop der printer rækkefølgen ud forfra
        int[] test = {92, 12, 38, 74 };
        for (int i = 0; i < test.length; i++) {
            System.out.println(test[i]);
        }

        // for loop der printer rækkefølgen ud bagfra
        System.out.println();
        for (int i = test.length - 1; i>= 0; i--) {
            System.out.println(test[i]);
        }

        // for loop der printer hvert 2 tal ud
        System.out.println();
        for (int i = test.length - 1; i >=0; i = i - 2) {
            System.out.println(test[i]);
        }

        // for each loop der printer rækkefølgen ud forfra "j" er vilkårlig og kan blive kaldt hvad som heslt
        System.out.println();
        for (int j : test) {
            System.out.println(j);
        }
    }
}

