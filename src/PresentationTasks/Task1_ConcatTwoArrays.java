package PresentationTasks;

import java.util.Arrays;

public class Task1_ConcatTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5};
        System.out.println(Arrays.toString(array(arr1, arr2)));
    }

    //Write a return method that can concat two arrays
    public static int[] array(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length + arr2.length]; //now the length = 5
        int j = 0;//will represent indexes of 3rd array

        for (int each : arr1) { //1, 2, 3
            arr3[j++] = each;
        }

        for (int each : arr2) {
            arr3[j++] = each;
        }

        return arr3;
    }
}


class task{
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5};
        int[] arr3 = new int[arr1.length+arr2.length];
        int j = 0;//will represent each index of arr3

        for(int each:arr1){
            arr3[j++] = each;
        }
        for(int each:arr2){
            arr3[j++] = each;
        }
       // System.out.println(Arrays.toString(arr3));

    }
}



