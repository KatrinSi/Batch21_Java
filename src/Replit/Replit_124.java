package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_124 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
//                          0               1               2               3               4               5               6
        //TODO: write your code below



/*
        int temp = nums[0];
        nums[0] = nums[6];
        nums[6] = temp;

        temp = nums[0+1];
        nums[0+1] = nums[6-1];
        nums[6-1] = temp;

        temp = nums[0+2];
        nums[0+2] = nums[6-2];
        nums[6-2] = temp;

        */
        int temp = nums[0];
        for (int i = 0; i < nums.length / 2; i++) {
            temp = nums[i];
            nums[i] = nums[(nums.length-1) - i];
            nums[(nums.length-1) - i] = temp;
        }



        //Do not change below statement:
        System.out.println(Arrays.toString(nums));
    }


}

/*
1. Take values at index 0 and last index and swap them
2. Take values at index 0+1 and last index-1 and swap them
3. Keep repeating step 1 and 2 using a loop until you reach the middle of the array (nums.length /2)

How to swap values:
Example:

int temp = nums[0];//1
nums[0] = nums[7];
nums[7] = temp;


 */
