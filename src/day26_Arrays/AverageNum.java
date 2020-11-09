package day26_Arrays;

import java.util.Scanner;

public class AverageNum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many nums do you want to enter?");
        int length = scan.nextInt();

        int[] nums = new int[length];
        int sum = 0;

        for (int i = 0; i < nums.length; i++){
            System.out.println("Enter a num");
            nums[i] = scan.nextInt(); //user input
            sum += nums[i];
        }
        double average = (double)sum/ length;

        System.out.println("sum = "+sum);
        System.out.println("average = "+average);


    }
}
