package PresentationTasks;

import java.lang.reflect.Array; //1:40 d34
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task2_FrequencyOfCharacters2 {
    public static void main(String[] args) {
        String str = "AAABBCDD";//A3B2C1D2
        System.out.println("frequencyOfChars(str) = " + frequencyOfChars(str));
    }

    //Write a return method that can find the frequency of characters "AAABBCDD"
    //result: A3B2C1D2
    public static String frequencyOfChars(String str) {
        String result = ""; //declare new String to store result

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(str.split("")));//add all chars to Array list: [A, A, A, B, B, C, D, D]

        for (String each : list) {
            int frequency = Collections.frequency(list, each);
            if (!result.contains(each)) {
                result += each + frequency;
            }
        }
        return result;
    }

}

//Write a return method that can find the frequency of characters "AAABBCDD"
//result: A3B2C1D2
class test{
    public static void main(String[] args) {//"AAABBCDD"
        String str = "AAABBCDD";
        String expectedResult = "A3B2C1D2";
        String actualResult = frequencyOfChars(str);
        if (expectedResult.equals(actualResult)){
            System.out.println("Task completed");
        }else {
            System.out.println("Task not completed");
            System.out.println("expectedResult = " + expectedResult);
            System.out.println("actualResult = " + actualResult);
        }
    }

    public static String frequencyOfChars(String str){
        String result = "";

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(str.split("")));

        System.out.println(result);

        for(String each:list){//each char from str
            int frequency = Collections.frequency(list, each);
            if(!result.contains(each)){
                result+= each+frequency;
            }
        }

        return result;
    }
}