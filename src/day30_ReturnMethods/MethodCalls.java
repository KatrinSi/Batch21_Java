package day30_ReturnMethods;

import Library.StringUtility;
import Library.ArraysUtility;

import java.util.Arrays;

public class MethodCalls {

    public static void main(String[] args) {

        String str = "Level";
        String reverseName = StringUtility.reverseStr2(str);
        System.out.println(str.equalsIgnoreCase(reverseName));

        String str2 = "aadddbfhvhhfchhsdskkf";
        String removed = StringUtility.removeDuplicates(str2);
        System.out.println(removed);

        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] descending = ArraysUtility.sort(arr);

        System.out.println(Arrays.toString(descending));
        System.out.println(ArraysUtility.printArray(descending));

        System.out.println("===========================");

        String s1 = "cccccccccbbbbbbaaaaaa";
        String s2 = "aaaabbbccccccccd";

        boolean r1 = StringUtility.isAnagram(s1,s2);
        System.out.println(r1);

    }
}
