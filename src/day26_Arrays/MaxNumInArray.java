package day26_Arrays;

public class MaxNumInArray {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int max = nums[0];

        for (int i = 1; i < nums.length; i++){
            if (nums[i] > max){
                max = nums[i];
            }
        }
        System.out.println("max num = "+max);

    }
}
