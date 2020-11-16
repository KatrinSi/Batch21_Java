package day30_ReturnMethods;

import java.util.Scanner;

public class WarmUpTask1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  // checking one num
        System.out.println("Enter a number:");
        //                 argument
        function(scan.nextInt());
        System.out.println("============================");

        int[] nums = {3,-2, 0}; //       checking nums in array

        for (int each:nums){
            function(each);
        }

    }

    //                           argument
    public static void function(int num) {

       /*if (num > 0 ){
           System.out.println("The number "+num+" is positive");
       }else if(num < 0){
           System.out.println("The number "+num+" is negative");
    }else{
           System.out.println("The number "+num+" is zero");
       }

        */

        String result = (num > 0) ? "The number " + num + " is positive"
                : (num < 0) ? "The number " + num + " is negative"
                : "The number " + num + " is zero";
        System.out.println(result);
    }




}
//1. create a function that can check if the given integer is positive, negative or zero
/*
 2. create a function that can calculate the garde of the student
    3. create a function that can print out the combination of two integer arrays
    4. create a function that can print a string without the duplicated characters
    5.  write a method that can print out the full name of a person in reugral format
            ex:
               fullName("cYbErTeK", "SCHOOL");
                output:
                    "Cybertek School"

 */