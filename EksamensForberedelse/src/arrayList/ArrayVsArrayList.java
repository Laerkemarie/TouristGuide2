package arrayList;

import java.util.ArrayList;

public class ArrayVsArrayList {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Array:");
        for (int num : array) {
            System.out.println(num);
        }

        //Arraylist
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        //udskrift af arraylist ligesom array
//        System.out.println("Arraylist:");
//        for (int num : arrayList) {
//            System.out.println(num);

        //udskrift af arraylist som reel liste
        System.out.println("Arraylist: \n" + arrayList);

        arrayList.add(6);
        System.out.println("Efter tilføjelse af tal i arraylist:\n" + arrayList);
        }
    }

