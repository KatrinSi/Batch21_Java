package OfficeHours.Practice_11_04_2020;

public class Task1_UniqueNums {
    public static void main(String[] args) {

        int[] nums = {3, 3, 4, 5, 5, 6, 8};                         //1
        //            0  1  2  3  4  5  6
        String result = "";                                         //2

        for (int j = 0; j < nums.length; j++){                      //11
            int num = nums[j];                                      //3
            int count = 0;                                          //4


            for (int i = 0; i < nums.length; i++) {                 //5

                int eachNum = nums[i];                              //6

                if (num == eachNum) {                               //7
                    count++;                                        //8
                }// count the frequency of each num

            }
            if (count == 1){                                        //9
                result += num+" ";                                  //10
            }
        }

        System.out.println(result);                                 //12

    }
}

/*
 1. write a program that can find the unique numbers from an integer array
 */