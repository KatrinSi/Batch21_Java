package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_156 {
    public static void add_to_r(int[] r, int n) {
        //create new array with one more position.
        int[] new_r;
        new_r = new int[r.length + 1];

        for (int i = 0; i < r.length; i++) {
            new_r[i] = r[i];
        }
        new_r[new_r.length - 1] = n;
        System.out.println(Arrays.toString(new_r));
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4};
        int n = 5;

        add_to_r(arr, n);


    }
}
