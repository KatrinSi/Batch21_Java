package day25_ArrayIntro;

public class MaxMinFromArray {
    public static void main(String[] args) {

        int[] nums =  {3, 1, 7, 5, 8, 4, 10, 2, 6};
        int max = 0;// 3; - ;7; -;8 ; - ;10; -; -

        for (int i = 0; i < nums.length; i++){ // check nums in array
            if (nums[i]>max){ //
                max = nums[i];
            }
        }
        System.out.println(max);
    }
}


/*
write a program that can find the maximum and minimum number for an array of integer

 */