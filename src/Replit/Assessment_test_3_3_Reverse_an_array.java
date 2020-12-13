package Replit;

import java.util.Arrays;

public class Assessment_test_3_3_Reverse_an_array {

    public static void main(String[] args) {
        String[] arr = {"java", "java word, kiwi, java, power, word"};
            //write your codes here

            String[] reversed = new String[arr.length];
            int j = 0;

            for(int i = arr.length-1; i >= 0; i--){
                reversed[j++] = arr[i];
            }
        System.out.println(Arrays.toString(reversed));
    }
}
