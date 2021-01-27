package PresentationTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task3_RemoveDuplicates {
    public static void main(String[] args) {//ABC

        String str = "AAABBBCCC";
        System.out.println(removeDuplicates1(str));
    }

    //Write a return method that can remove the duplicated values from String "AAABBBCCC"
    public static String removeDuplicates1(String str) {
        String result = "";
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(str.split("")));

        for (String each : list) {
            if (!result.contains(each)) {
                result += each;
            }
        }
        return result;
    }
}



