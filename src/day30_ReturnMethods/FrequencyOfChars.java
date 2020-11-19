package day30_ReturnMethods;

import Library.StringUtility;

public class FrequencyOfChars {

    public static void main(String[] args) {

        String str = "aaabbbbcc";
        //              a3b4c2
        String result = "";
        String nonDup = StringUtility.removeDuplicates(str);

        for (int i = 0; i < nonDup.length(); i++) {
            char ch = nonDup.charAt(i); //a
            int count = StringUtility.frequency(str, ch);
            result += "" + ch + count;
        }
        System.out.println(result);
        System.out.println("=================================");

        String str2 = "aaaaaaggggggggggdddddderrrrrr";
        String result2 = frequencyOfChars(str2);
        System.out.println(result2);

    }

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

}
