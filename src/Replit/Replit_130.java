package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_130 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];//5
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();// {1,1,2,2,4}
        }
        //WRITE YOUR CODE HERE
                                // 5
        int[] newArr = new int[nums.length];
        //
        newArr[nums.length-1] = nums[0]; //6
        System.out.println(newArr[nums.length-1]);
        for (int i = 0; i < nums.length; i++) {
            if (i >= 0 && i <= nums.length - 2) {
                newArr[i] = nums[i+1];
            }

        }


        System.out.print(Arrays.toString(newArr));//[1, 2, 2, 4, 1]

    }
}
/*
Modify an array that is "left shifted" by one -- so {6, 2, 5, 3} becomes {2, 5, 3, 6}. You may modify and print the given array, or print a new array.
Example:
input: 6, 2, 5, 3
output: [2, 5, 3, 6]
 */