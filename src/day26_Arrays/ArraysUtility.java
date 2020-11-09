package day26_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysUtility {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6};

        System.out.println(nums[0]);
        System.out.println(nums[1]);

        //Arrays.toString(array): Converts the array to String
        System.out.println(Arrays.toString(nums));

        String[] myClassmates = {"Erjon", "Lola", "Aamir", "Oguzhan", "Aibek", "Elvin", "Ilgar", "Nadira", "Beraat", "Parizat"};
        System.out.println(Arrays.toString(myClassmates));

        //Arrays.sort(array): sorts the array in ascending order
        int[] arr1 = {2, 6, 1, 8, 4, 5, 3};

        Arrays.sort(arr1);//doesn't return any value
        System.out.println(Arrays.toString(arr1));

        System.out.println("max num = " + arr1[arr1.length - 1]);
        System.out.println("min num = " + arr1[0]);

        double[] arr2 = {1.5, 5.3, 6.1, 4.8};

        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr2));

        System.out.println("second min num = " + arr2[1]);
        System.out.println("second max num =" + arr2[arr2.length - 2]);


        //Arrays.equals(array1, array2):

        int[] a1 = {1, 3, 2};
        int[] a2 = {1, 2, 3};
        Arrays.sort(a1);
        Arrays.sort(a2);
        boolean r1 = Arrays.equals(a1,a2);
        System.out.println(r1);

    }
}
