package day30_ReturnMethods;

import java.util.Arrays;

public class ReturnMethodMinMaxNums {
    public static void main(String[] args) {
        int[] nums = {3,2,23,5,6,1,4,0};
        System.out.println(MinNum(nums));
        System.out.println(MaxNum(nums));
        boolean isPositive = (MaxNum(nums) > 0);
        System.out.println(isPositive);
        int max = MaxNum(nums);
        System.out.println(max > 100);//false
        System.out.println(MinNum(nums)> MaxNum(nums));

        //sort
        int max2 = maxSort(nums);
        System.out.println(max2);

    }
    public static int MinNum (int[] arr){

        int min = arr[0];
        for (int each:arr){

            if (min > each){
                min=each;
            }
        }
        return min;
    }
    public static int MaxNum (int[] arr){
        int max = arr[0];
        for (int each:arr){
            if(each > max){
                max=each;
            }
        }
        return max;
    }

    public static int maxSort(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

}
