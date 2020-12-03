package day33_ArrayList;

import java.util.ArrayList;

public class CombineTwoArrs {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[][] arr3 = {arr1, arr2};
        ArrayList<Integer> result = new ArrayList<>();

        /*for (int each : arr1) {
            result.add(each);
        }
        for (int each : arr2) {
            result.add(each);
        }

         */


        for (int[] eachArr : arr3) {
            for (int eachElem : eachArr) {
                result.add(eachElem);
            }
        }
        System.out.println(result);

    }
}
