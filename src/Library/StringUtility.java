package Library;

import java.util.Arrays;

public class StringUtility {

    public static int frequency(String str, char ch) {
        int count = 0;
        for (char each : str.toCharArray()) {//[a,a,a,b,c]
            if (each == ch) {
                count++;
            }
        }

        return count;
    }
    //returns the frequency of the given char from the given string as an int

    public static String unique(String str) {
        String unique = "";
        for (char each : str.toCharArray()) {
            if (frequency(str, each) == 1) {
                unique += each;
            }
        }
        return unique;

    }
    //returns a unique chars from the given string

    public static String reverseStr2(String str){

        String result = "";

        for (int i = str.length()-1; i >=0; i--){
            result +=str.charAt(i);
        }

        return result;
    }
    //reverses the given string object and returns it

    public static String removeDuplicates(String str) {
        String result = "";//abc
/*
        for (String each : str.split("")) {// each: ["a","a","b","c","c","b"]
            if (!result.contains(each)) {
                result += each;
            }
        }
        System.out.println(result);

 */
        for (int i = 0; i < str.length(); i++) {// each: ['a,'a','b','c','c','b']

            if (!result.contains("" + str.charAt(i))) {// each: ['a,'a','b','c','c','b']
                result += str.charAt(i);
            }

        }
        return result;

    }
    //removes duplicates from the string and returns it

    public static String frequencyOfChars(String str) {
        String result = "";//  a3b4c2
        String nonDup = StringUtility.removeDuplicates(str);

        for (int i = 0; i < nonDup.length(); i++) {
            char ch = nonDup.charAt(i); //a
            int count = StringUtility.frequency(str, ch);
            result += "" + ch + count;
        }

        return result;

    }
    //returns the frequency of appeared chars

    public static boolean isAnagram (String str1, String str2){

        str1 = removeDuplicates(str1);
        str2 = removeDuplicates(str2);

        char[] ch1 = str1.toCharArray();//[c,a,b]
        char[] ch2 = str2.toCharArray();//[b,a,c]

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);


    }
    //checks if two strings are anagram. Returns the boolean result.

    public static boolean isPalindrome(String str){

        return reverseStr2(str).equalsIgnoreCase(str);
    }
    // verifies if the word is palindrome

    public static int frequencyOfWord (String sentence, String word){
        int frequency = 0;
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        while (sentence.contains(word)){
            sentence = sentence.replaceFirst(word,"");
            frequency++;
        }

        return frequency;
    }
    //checks a word in a sentence and returns frequency of a word


}
