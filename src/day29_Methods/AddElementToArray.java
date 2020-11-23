package day29_Methods;

import java.util.Arrays;

public class AddElementToArray {
    public static void main(String[] args) {

        int[] nums = {1,2,3};
        addElement(nums,4);
    }

    //                             1,2,3     4
    public static void addElement(int[] arr, int num) {

        int[] result = new int[arr.length + 1];//{1,2,3,4}
        //                      4
        for (int i = 0; i < arr.length; i++) {

            result[i] = arr[i];

        }
        result[result.length - 1] = num;

        System.out.println(Arrays.toString(result));
    }

}
