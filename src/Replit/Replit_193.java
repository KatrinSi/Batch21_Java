package Replit;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit_193 {
    public static void main(String[] args) {
        String[] str1 = {"f","o","o"};
        String[] str2 = {" b","a","r"};
        System.out.println(combineRs(str1,str2));

    }
    public static String combineRs(String[] r1,String[] r2)
    {
        ArrayList<String> list = new ArrayList<>();
        for(String each: r1) list.add(each);
        for (String each : r2) list.add(each);
        System.out.println(list);
        String combined="";
        for (String each:list){
            combined+= each;
        }

        return combined;
    }
}
