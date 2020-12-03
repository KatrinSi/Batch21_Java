package Replit;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Replit_159 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];//5
        for (int i = 0; i < size; i++) {
            nums[i] = scan.nextInt();//{1,1,2,3,3,4}
        }//                             0 1 2 3 4 5
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums) {
        //WRITE YOUR CODE HERE

        for (int j = 0; j < nums.length;j++){//j = 0 1 2 3 4 5
            int element = nums[j];//1
            int count = 0;// frequency of the element

            for (int i = 0; i < nums.length; i++) {//i = 0 1 2 3 4 5   (this for loop is for finding the frequency of one element)
                if (nums[i] == element) {
                    count++;
                }
            }
            if (count ==1){//verify if an element is unique
                System.out.println(element+" ");
            }
        }



    }
}

/*
Write a void method printUniqueNumbers that will print unique numbers from an array of ints.

Example:
input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
output:
2
9
34
 */