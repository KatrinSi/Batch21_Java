package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Inna1 {
    public static void main(String[] args) {
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};

        for (int i = arr2D.length-1;i>=0; i--){//arrays in arr2D
            for (int j = arr2D[i].length-1; j >= 0; j-- ){
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }
    }
}

/*


/*
task3:
        		13 12 11 10 9
        		8 7 6 5 4
        		3 2 1
*/

