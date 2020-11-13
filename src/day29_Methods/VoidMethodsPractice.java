package day29_Methods;

public class VoidMethodsPractice {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 5, 7, 6, 33, 2};
        maxNums(arr);
        minNums(arr);
        uniqueNums(arr);
    }

    public static void maxNums(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println(max);
    }

    public static void minNums(int[] nums) {
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        System.out.println(min);

    }

    public static void uniqueNums(int[] nums) {

        for (int each:nums){
            int count = 0;

            for (int each2 : nums) {
                if (each == each2) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(each +" ");
            }
        }

    }


}
