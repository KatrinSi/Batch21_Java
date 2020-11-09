package day26_Arrays;

import java.util.Arrays;

public class ArraysDescendingOrder {
    public static void main(String[] args) {

        int[] nums = {3, 2, 1, 4, 5};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums)); //[1, 2, 3, 4, 5]
//                          4           0
        int[] descending = new int[nums.length]; //5, 4, 3, 2, 1
        int j = 0;

        for (int i = nums.length-1; i >= 0; i--){//5, 4, 3, 2, 1
            System.out.print(nums[i]+" ");
            //
        }





    }
}
