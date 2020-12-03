package OfficeHours.Practice_11_27_2020;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] nums = {3, 2, 5, 6,}; //length = 4
        //   indexes: 0  1  2  3

        ReversedArr(nums);

        String[] arr2 = {"one","two","three"};
        arr2 = ReversedArr(arr2);
    }

    public static int[] ReversedArr(int[] arr) {

        int[] reversed = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = arr[i];
        }
        System.out.println(Arrays.toString(reversed));
        return reversed;

    }
    public static double[] ReversedArr(double[] arr) {

        double[] reversed = new double[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = arr[i];
        }
        System.out.println(Arrays.toString(reversed));
        return reversed;

    }
    public static char[] ReversedArr(char[] arr) {

        char[] reversed = new char[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = arr[i];
        }
        System.out.println(Arrays.toString(reversed));
        return reversed;

    }
    public static String[] ReversedArr(String[] arr) {

        String[] reversed = new String[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = arr[i];
        }
        System.out.println(Arrays.toString(reversed));
        return reversed;

    }



}
