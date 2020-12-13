package Replit;

public class Assessment_test_4_1_is_sorted {

    public static void main(String[] args) {

        int[] nums = {7,8,9,10};
        System.out.println(isSort(nums));

    }
    public static boolean isSort(int[] nums) {
        boolean isSort= true;

        for (int i = 0; i < nums.length-1;i++){
            if (nums[i]>nums[i+1]){
                isSort = false;
            }
        }

        return isSort;
    }

}
