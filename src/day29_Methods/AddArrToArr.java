package day29_Methods;

import Library.ArraysUtility;

import java.util.Arrays;

public class AddArrToArr {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 7};
       int[] var1=  ArrToArr(arr1, arr2);
        System.out.println(Arrays.toString(var1));
        int[] var2 = ArraysUtility.CombinationOfArr(arr1,arr2);
        System.out.println(Arrays.toString(var2));
    }

    public static int[] ArrToArr(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length];//6

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i]; //[0,0,0,0,0,0] = [1,2,3,0,0,0]
        }
        //             ind  3                  3
        for (int j = arr1.length, i = 0; j < arr3.length; i++, j++) {
            arr3[j] = arr2[i];// [1,2,3,0,0,0] = [1,2,3,4,5,6]

        }
        return arr3;
    }

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
