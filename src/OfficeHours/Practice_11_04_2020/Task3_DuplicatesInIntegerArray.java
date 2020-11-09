package OfficeHours.Practice_11_04_2020;

public class Task3_DuplicatesInIntegerArray {
    public static void main(String[] args) {

        int[] nums = {1, 1, 2, 3, 3, 4, 5};
        String duplicates = " ";


        for (int j = 0; j < nums.length; j++) {
            int num = nums[j];
            int count = 0;

            for (int i = 0; i < nums.length; i++) {
                int eachNum = nums[i];

                if (eachNum == num) {
                    count++;
                }
            }
            if (count > 1 && !duplicates.contains(num+"")) {
                duplicates += num+" ";
            }
        }


        System.out.println(duplicates);

    }
}
/*
3. write a program that can find the duplicated numbers from an integer array
 */