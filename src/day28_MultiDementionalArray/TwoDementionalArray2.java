package day28_MultiDementionalArray;

import java.util.Arrays;

public class TwoDementionalArray2 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7};
        int[] c = {8, 9};
        int[] d = {10, 11};

        int[][] arrays = {a, b, c, d};

        //System.out.println(Arrays.deepToString(arrays));//[[1, 2, 3, 4, 5], [6, 7], [8, 9], [10, 11]]

        int max = arrays[0][0];
        int min = arrays[0][0];

        for (int[] eachArray : arrays)
            for (int eachElement : eachArray) {
                if (eachElement > max)
                    max = eachElement;

                if (eachElement < min)
                    min = eachElement;
            }
        System.out.println("max: "+max);
        System.out.println("min: "+ min);
    }
}
