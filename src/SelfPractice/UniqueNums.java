package SelfPractice;

public class UniqueNums {
    public static void main(String[] args) {

        int[] nums = {10,10,11,13,13,14,15}; //6
        // indexes    0  1  2  3  4  5

        UniqueNums(nums);

    }
    public static void UniqueNums (int[] nums){
        //2 step
        for (int j = 0; j < nums.length; j++) {
            int element = nums[j];// 1
            int count = 0;

            //1 step:
            for (int i = 0; i <= nums.length - 1; i++) {
                if (element == nums[i]) {
                    count++;

                }
            }
            if (count == 1) {
                System.out.print(element + " ");
            }


        }

    }

}
