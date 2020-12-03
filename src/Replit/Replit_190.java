package Replit;

import java.util.Arrays;

public class Replit_190 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {6, 7, 8, 9};


        int[] mergedArr = new int[a.length + b.length];//9

        for (int i = 0; i < a.length; i++) {//[1, 2, 3, 4, 5, 0, 0, 0, 0]
            mergedArr[i] = a[i];
        }               //5             9
        for (int i = a.length, j = 0 ; i < mergedArr.length; i++, j++){
            mergedArr[i] = b[j];
        }

        System.out.println(Arrays.toString(mergedArr));

    }
}
