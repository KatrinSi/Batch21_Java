package OfficeHours.Practice_11_11_2020;

import java.util.Arrays;

public class MultiDementionalArray {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};

        int[][] arr2 = {arr1, {1,2,3,4,5}, {1,2,3}, {1,2,3,4,5,6}};

        System.out.println(Arrays.toString(arr2[0]));//to print single array

        System.out.println(Arrays.deepToString(arr2));//to print entire array

        System.out.println("================================================");

        for(int[] each : arr2){
            System.out.println(Arrays.toString(each));

            for (int eachElement : each ){
                System.out.println(eachElement);
            }

        }
        System.out.println("==================================================");

        String odd = "";
        String even = "";
        for (int[] eachArr : arr2){//for odd or even
            for (int eachInt : eachArr){
                if (eachInt % 2 != 0){
                    odd += " "+ eachInt;
                }else{
                    even += " "+ eachInt;
                }
            }
        }
        System.out.println("Odd nums: "+odd);
        System.out.println("Even nums: "+even);
    }
}
