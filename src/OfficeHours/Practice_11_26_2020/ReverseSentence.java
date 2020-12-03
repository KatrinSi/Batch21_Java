package OfficeHours.Practice_11_26_2020;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {

        String sentence = "Today is a great day to celebrate Thanksgiving by doing Java tasks";

        String result = "";

        String[] arr = sentence.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            result += arr[i]+" ";

        }
        System.out.println(result);

    }

}
