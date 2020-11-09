package day26_Arrays;

public class MinNumInArray {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int min = nums[0];

        for (int i = 1; i < nums.length; i++){
            if (nums[i]< min){
                min = nums[i];
            }

        }

        System.out.println("min num = "+min);
    }
}
