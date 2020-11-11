package OfficeHours.Practice_11_11_2020;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};

        String result = "";
        int eachNum = 0;


        for( int i= 0; i < arr1.length; i++){

            if (arr1[i]==arr2[i]){
                result+= " "+arr1[i];
            }

        }
        System.out.println(result);

    }
}


/*
Write a program that can print out the common elements from two integer array
        Ex:
            arr1: {1,2,3,4,5}
            arr2: {4,5,6,7,8}
            output:
                4 5
    solution 1:
            DO NOT use any for each loop
    solution 2:
            MUST use for each loops
 */