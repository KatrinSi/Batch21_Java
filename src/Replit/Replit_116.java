package Replit;

import java.util.Scanner;

public class Replit_116 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i <= 9; i++) {
            nums[i] = input.nextInt(); //[2, 1, 2, 2, 1, 2,  3,  4, 3, 4]) → 6
        }
        // above code will ask user 10 numbers while creating an array
        // just assume that you have int array with 10 numbers and start working on requirement
        // loop through the array and get the count of the even numbers
        //TODO: Write your code below
        /*
        int result = 0;
        /*
        for (int each : nums) {
            if (nums[each] % 2 == 0) {
                result++;
            }
        }
        System.out.println(result);
        */
        int result = 0;
        for (int eachNum : nums) {
            if (eachNum % 2 == 0) {
                result++;
            }
        }
        System.out.println(result);

    }
}

