package SelfPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfChars {
    //Write a return method that can find the frequency of characters "AAABBCDD"
    //result: A3B2C1D2
    public static void main(String[] args) {
        String str = "AAABBCDD";
        String expectedResult = "A3B2C1D2";
        String actualResult = frequencyOfChars(str);
        if(expectedResult.equals(actualResult)){
            System.out.println("Task completed");
            System.out.println("actualResult = " + actualResult);
        }else {
            System.out.println("Task not completed!");
            System.out.println("expectedResult = " + expectedResult);
            System.out.println("actualResult = " + actualResult);
        }
    }

    public static String frequencyOfChars(String str){

        String result = "";
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(str.split("")));

        for (String each:list){
            int frequency = Collections.frequency(list, each);
            if(!result.contains(each)){
                result+= each+frequency;
            }
        }
        return result;
    }
}
