package Replit;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit_214 {
    public static void main(String[] args)
    {
        ArrayList<String>  arr = new ArrayList<String>(Arrays.asList("2", "uhukh njk", "foo bar"));
        System.out.println(search(arr, "uhukh"));
    }

    public static String search(ArrayList<String> strList, String find){
        String result = "search failed";
        for (int i = 0; i < strList.size();i++){
            if (strList.get(i).contains(find)){
                result = strList.get(i);
            }

        }
        return result;
    }


}
