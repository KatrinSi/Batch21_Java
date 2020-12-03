package Replit;

import java.util.Scanner;

public class Replit_174 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();//[2, 5, 5, 6, 3, 6, 9, 34, 3]
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums) {
        //WRITE YOUR CODE HERE

        for (int j = 0; j < nums.length;j++){
            int element = nums[j];
            int count = 0;

            for(int i = 0; i < nums.length; i++){
                if(element == nums[i]){
                    count++;
                }
            }
            if (count == 1){
                System.out.println(element);
            }
        }


    }

}
