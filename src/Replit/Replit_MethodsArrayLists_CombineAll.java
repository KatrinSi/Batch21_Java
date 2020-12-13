package Replit;

import java.util.ArrayList;
import java.util.Arrays;

public class Replit_MethodsArrayLists_CombineAll {
    public static void main(String[] args) {

        ArrayList<String> arr1 = new ArrayList<>(Arrays.asList("a","b","c"));
        ArrayList<String> arr2 = new ArrayList<>(Arrays.asList("d","e"));

        System.out.println(combineAll(arr1,arr2));
    }

    public static ArrayList<String> combineAll(ArrayList<String> wordList1, ArrayList<String> wordList2){

        ArrayList<String> combined = new ArrayList<>();

        for(String each:wordList1){
            combined.add(each);
        }
        for(int i = 0; i < wordList2.size(); i++){
            combined.add(wordList2.get(i));
        }

        return combined;
    }
}
