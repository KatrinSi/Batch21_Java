package SelfPractice;

import java.util.ArrayList;
import java.util.Arrays;

//Write a return method that can remove the duplicated values from String
//        Ex:  removeDup("AAABBBCCC")  ==> ABC

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "AAABBBCCC";
        System.out.println(removeDupl(str));
    }

    public static String removeDupl(String str){
        String result = "";

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(str.split("")));

        for (String each:list){
            if(!result.contains(each)){
                result+=each;
            }
        }

        return result;
    }

}
