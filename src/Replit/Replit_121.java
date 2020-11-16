package Replit;

public class Replit_121 {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,6};

        int count = 0;
        for (int i = 0; i < nums.length; i++){

            if (nums[i]%2 == 0){
                count++;
            }

        }
        System.out.println(count);



    }
}
