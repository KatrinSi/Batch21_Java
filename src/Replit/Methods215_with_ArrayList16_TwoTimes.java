package Replit;

import java.util.ArrayList;
import java.util.Arrays;

public class Methods215_with_ArrayList16_TwoTimes {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,5,3,7));
        System.out.println(twoTimes(nums));

    }

    //create your method below:
    public static ArrayList<Integer> twoTimes(ArrayList<Integer> nums){

        ArrayList<Integer> newArr = new ArrayList<>();

        for ( Integer each : nums){
            newArr.add(each);
            newArr.add(each);
        }
        return newArr;
    }


}

/*
Create a method that:

is called twoTimes
returns a new ArrayList of Integers
takes in a single parameter - an ArrayList of Integers

This method should create a new ArrayList of Integers that contains every value of the ArrayList parameter repeated twice.

For example, if the parameter is
(1,5,3,7)
The method should return a new ArrayList of Integers with
(1,1,5,5,3,3,7,7)
 */