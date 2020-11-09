package day28_MultiDementionalArray;

import java.util.Arrays;

public class TwoDementionalArray {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        int[] b = {6,7};
        int[] c = {8,9};
        int[] d = {10,11};

        int[][] arrays = {a,b,c,d};

        System.out.println(Arrays.deepToString(arrays));//[[1, 2, 3, 4, 5], [6, 7], [8, 9], [10, 11]]

        int max = arrays[0][0];
        int min = arrays[0][0];

        for (int i = 0; i < arrays.length; i++ ){// each array inside the arrays

            int[]arr1 = arrays[i];

            for (int j = 0; j < arr1.length; j++){// index numbers of the elements
                int eachElement = arr1[j];

                if (eachElement > max){
                    max = eachElement;
                }
                if (eachElement < min){
                    min = eachElement;
                }
            }
        }
        System.out.println("max: "+max);
        System.out.println("min :"+min);

    }
}
