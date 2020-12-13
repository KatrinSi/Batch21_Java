package Replit;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit_214 {
    public static void main(String[] args)
    {
        ArrayList<String>  arr = new ArrayList<String>(Arrays.asList("2", "66 6 uhukh", "foo bar"));
        System.out.println(search(arr, "uhukh"));
    }

    public static String search(ArrayList<String> r, String find){
        String result = "";
        for (String each : r){
            if (each.contains(find)){
                result = each;
            }else{
                result = "search failed";
            }
        }
        return result;
    }


}
