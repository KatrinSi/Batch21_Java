package Replit;

import java.util.Scanner;

public class Replit_122 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        //1, 1, 2, 3, 4, 3, 4
        //TODO: write your code below

        for (int j = 0; j < nums.length; j++) {
            int count = 0;
            int num = nums[j];

            for (int i = 0; i < nums.length; i++) {
                if (num == nums[i]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(num);
            }

        }


    }
}


