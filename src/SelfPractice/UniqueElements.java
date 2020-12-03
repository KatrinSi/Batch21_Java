package SelfPractice;

public class UniqueElements {

    public static void main(String[] args) {


        int[] nums = {3, 2, 2, 4, 5, 5, 1, 7, 7};//9
        //  indexes   0  1  2  3  4  5  6  7  8

         /*
        for (int j = 0; j < nums.length; j++){
            int element = nums[j];
            int count = 0;

            //step 1
            for(int i = 0; i < nums.length; i++){
                if (element == nums[i]){
                    count++;
                }
            }
            if (count == 1){
                System.out.print(element+" ");
            }
        }

          */


        // step 2
        for (int eachEl : nums){
            int element = eachEl;
            int count = 0;
            //step 1
            for (int each : nums){
                if (element == each){
                    count++;
                }
            }
            if (count == 1){
                System.out.print(element+" ");
            }
        }





    }

}
