package day26_Arrays;

import java.util.Scanner;

public class MinMaxInArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbs do you want to enter?");
        int length = scan.nextInt();

        int[] nums = new int[length];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("Enter a number");
            nums[i] = scan.nextInt(); //user enter numbers

        }
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min){
                min = nums[i];
            }

        }
        System.out.println("min = "+min);
        System.out.println("max = "+max);

    }
}
