package Replit;

import java.util.Arrays;

public class Replit_143 {
    public static void main(String[] args) {

        int[][] multiplicationTable = new int[4][4];

        //TODO: type your code below
        for (int i = 0; i < multiplicationTable.length; i++){
            multiplicationTable[0][0] = i;
            multiplicationTable[0][1] = i;

        }



        //Do not modify below line it will be used to test your code. And
        //Can be used by you while developing your code
        System.out.println(Arrays.deepToString(multiplicationTable));
    }
}



/*
Two-dimensional Arrays - 2D array has a type such as int[][] or String[][], with two pairs of square brackets.
The elements of a 2D array are arranged in rows and columns, and the new operator for 2D arrays specifies both
the number of rows and the number of columns.

You have  2D array multiplicationTable declared with 10 rows and 10 columns.
Write java program to populate the array with multiplication table values like in the picture below:
 */