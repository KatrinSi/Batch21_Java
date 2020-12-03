package Replit;

public class Replit_188 {

    public static void main(String[] args) {
        int arr[] = {6,2,4,3,5,8};
        System.out.println(findMax(arr));
    }

    public static int findMax(int[] nums){


        int max = nums[0];

        for (int each:nums){
            if (each > max){
                max = each;
            }
        }
        return max;
    }
}
