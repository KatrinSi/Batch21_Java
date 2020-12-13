package Replit;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit_MethodsWithArrayList_2Times {

    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(twoTimes(nums));
    }
    //create your method below

    public static ArrayList<Integer> twoTimes(ArrayList<Integer> nums){
        ArrayList<Integer> newArr = new ArrayList<>();

        for(int i = 0; i < nums.size();i++){
            newArr.add(nums.get(i));
            newArr.add(nums.get(i));
        }

        return newArr;
    }


}
