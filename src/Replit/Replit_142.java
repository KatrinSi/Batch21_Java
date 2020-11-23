package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_142 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

//                          0       1
        int arr[][] = {{1, 2, 3}, {4, 5}};
//                      0  1  2    3  4

        int max = arr[0][0];
        for (int[] eachArr : arr) {
            for (int eachElement : eachArr){
                if (eachElement > max){
                    max = eachElement;
                }
            }

        }
        System.out.println(max);

    }//end main
}


/*
Given a 2d array of ints, find the biggest number(int) in the array and print it.
 */