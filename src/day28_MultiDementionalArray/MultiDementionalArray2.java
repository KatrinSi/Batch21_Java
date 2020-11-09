package day28_MultiDementionalArray;

import java.util.Arrays;

public class MultiDementionalArray2 {
    public static void main(String[] args) {

        int[] [] arr1 = {{1,2,3},{4,5,6}};
        int[][] arr2 = {{7,8,9},{10,11,12}};
        int[][] arr3 = {{13,14,15},{16,17,18}};

        int[][][] arrays = {arr1,arr2,arr3};

        //[[[1, 2, 3], [4, 5, 6]], [[7, 8, 9], [10, 11, 12]], [[13, 14, 15], [16, 17, 18]]]
        System.out.println(Arrays.deepToString(arrays));
        //[[7, 8, 9], [10, 11, 12]]
        System.out.println(Arrays.deepToString(arrays[1]));

        System.out.println(Arrays.toString(arrays[2][1]));

        System.out.println(Arrays.toString(arrays[1][0]));



    }
}

