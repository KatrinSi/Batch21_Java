package day26_Arrays;

public class OddEven {
    public static void main(String[] args) {

        int[] nums = new int[100];
        //                  last index = 99;
        for (int i = 0; i <= 99; i++) {
            nums[i] = i + 1;
        }
        int even = 0;
        int odd = 0;
        int count3 = 0;
        int count5 = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            int eachNum = nums[i];
            if (eachNum % 2 == 0) { // how many even numbers in the array
                even++;
            } else {
                odd++;
            }
            if (eachNum%3 == 0){
                count3++;
            }
            if (eachNum%5 == 0){
                count5++;
            }
        }
        System.out.println("odd = "+odd);
        System.out.println("even = "+even);
        System.out.println("divisible by 3 = "+ count3);
        System.out.println("divisible by 5 = "+ count5);
    }
}
