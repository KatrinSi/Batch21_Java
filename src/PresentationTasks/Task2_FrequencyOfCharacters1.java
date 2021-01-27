package PresentationTasks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class Task2_FrequencyOfCharacters1 {
    public static void main(String[] args) {
        String str = "aaabbc";//a3b2c1
        System.out.println("frequencyOfChars(str) = " + frequencyOfCharsHardest(str));
    }

    //Write a return method that can find the frequency of characters
    public static String frequencyOfCharsHardest(String str) {
        //1. remove duplicates
        String nonDupl = "";//abc
        //2. to use loop to call charAt() method and remove duplicates
        for (int i = 0; i < str.length(); i++) {//0 1 2 3 4 5
            String eachChar = "" + str.charAt(i);//a, a, a, b, b, c
            if (!nonDupl.contains(eachChar)) {//contains method only accepts String
                nonDupl += eachChar;
            }
        }

        String result = "";

        for (int j = 0; j < nonDupl.length(); j++) {
            //3. find frequency each nonDupl char
            char ch = nonDupl.charAt(j);// a
            //4. compare ch with each char of str String by using loop
            int count = 0;

            for (int i = 0; i < str.length(); i++) { //frequency of a char
                char eachChar = str.charAt(i);
                if(ch == eachChar){
                    count++;
                }
            }
            //5. concat character and frequency to one String
            result+=""+ch+count;
        }



        return result;
    }


}
