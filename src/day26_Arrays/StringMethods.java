package day26_Arrays;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "abcd";
        char[] arr = str.toCharArray();

        System.out.println(Arrays.toString(arr));

        System.out.println("============================");

//anagram task:
        String s1 = "acb";
        String s2 = "bac";

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        boolean isAnagram = Arrays.equals(arr1,arr2); //!!!
            System.out.println(isAnagram);

            //split(str)
        String sentence = "Today is a great day";
         String[] words = sentence.split(" ");

        System.out.println ( Arrays.toString(words) );





    }
}
