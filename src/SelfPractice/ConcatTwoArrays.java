package SelfPractice;

import java.util.Arrays;

public class ConcatTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5};
        System.out.println(Arrays.toString(concatTwoArrays(arr1,arr2)));

    }

        public static int[] concatTwoArrays ( int[] arr1, int[] arr2){

            int[] arr3 = new int[arr1.length + arr2.length];
            int j = 0;//will represent each index of arr3

            for (int each : arr1) {
                arr3[j++] = each;
            }
            for (int each : arr2) {
                arr3[j++] = each;
            }
            return arr3;
        }
    }
