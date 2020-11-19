package day30_ReturnMethods;

import java.util.Arrays;

public class WarmUpTask3_CombiningTwoArr {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 7};
        CombinationOfArr(arr1, arr2);

    }

    //                                      123         4567
    public static int[] CombinationOfArr(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0; // represents the index nums of arr3
        for (int each : arr1) {
            arr3[i++] = each;//each element of arr1 is being assigned to the index of arr3
        }
        //i = 2
        for (int each : arr2) {
            arr3[i++] = each;//each element of arr2 is being assigned to the index of arr3
        }
        //Arrays.sort(arr3);
        //System.out.println(Arrays.toString(arr3));
        return arr3;

    }
}


//3. create a function that can print out the combination of two integer arrays