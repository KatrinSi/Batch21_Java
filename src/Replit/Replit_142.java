package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_142 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int rows = 2, cols = 3;
        int[][] arr = new int[2][3];//{{1,2,3},{4,5}}

        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= cols - 1; j++) {
                arr[i][j] = inp.nextInt();
            }//end for cols
        }//end for rows

    }
}

      //  int min = arr[0][0];
        //TODO write your code below
       /* for (int[] each : arr) {
            min = arr[each][each];


        }

        System.out.println(Arrays.deepToString(arr));


    }//end main
}


/*
Given a 2d array of ints, find the biggest number(int) in the array and print it.
 */