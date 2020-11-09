package day27_ForEachLoop;

public class UniqueIntegers {
    public static void main(String[] args) {

        int[] nums = {2, 1, 2, 4, 3, 4};

        for (int j = 0; j <= nums.length - 1; j++) {
            int element = nums[j];
            int frequency = 0;

            for (int i = 0; i <= nums.length - 1; i++) {

                if (nums[i] == element) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                System.out.print(element + " ");

            }
        }
    }

}

