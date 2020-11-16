package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_124 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
//                          0               1               2               3               4               5               6
        //TODO: write your code below

        int temp = 0;
        for (int j = 0; j < nums.length; j++) {        //0 1 2 3 4 5 6
            for (int i = nums.length - 1; i >= 0; i--) { //6 5 4 3 2 1 0
                if (nums.length % 2!= 0) {
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }

        System.out.println(temp);
        //Do not change below statement:
        //System.out.println(Arrays.toString(nums));

    }
}
/*
1. Take values at index 0 and last index and swap them
2. Take values at index 0+1 and last index-1 and swap them
3. Keep repeating step 1 and 2 using a loop until you reach the middle of the array (nums.length /2)

How to swap values:
Example:

int temp = nums[0];
nums[0] = nums[4];
nums[4] = temp;


 */
