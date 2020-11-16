package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_139 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt(); //3
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = scan.nextInt();//1,2,3
        }
        //WRITE YOUR CODE HERE
        int[] arr = new int[0];
        for (int i = 0; i < 2; i++) {

            if (num.length > 1) {
                arr = new int[2];
                arr[0] = num[0];
                arr[1] = num[1];
            } else {
                arr = new int[1];
                arr[0] = num[0];

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

/*
Given an int array of any length, print a new array of its first 2 elements.
If the array is smaller than length 2, use whatever elements are present.

Example:
input 1, 2, 3
output: [1, 2]

Example:
input 1,
output: [1]
 */