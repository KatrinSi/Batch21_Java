package Replit;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit_MethodsWithArrayList_Search {

    public static String search(ArrayList<String> r, String find) {

        String result = "";

        for (int i = 0; i <r.size();i++){
            if(r.get(i).contains(find)){
                result = r.get(i);
            }else{
                result = "search failed";
            }
        }

        return result;
    }//end wineSeller

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<String>(Arrays.asList("one apple","two orange","four banana"));


        String find_tst = search(arr, "four");
        System.out.print(find_tst);//foo bar


    }//end main
}
