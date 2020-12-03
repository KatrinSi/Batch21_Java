package OfficeHours.Practice_11_27_2020;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "Listen";
        String str2 = "Silent";

        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        str1 = sortedString(str1);
        str2 = sortedString(str2);
        System.out.println(str1.equals(str2));

        System.out.println("==========================");
        //another way to verify anagram without using Custom method:
        String s1 = "Listen";
        String s2 = "Silent";
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean isAnagram = Arrays.equals(arr1,arr2);
        System.out.println(isAnagram);

    }

    public static String sortedString(String str) {

        String result = "";
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        for (char each : ch) result += each;

        return result;
    }
}
