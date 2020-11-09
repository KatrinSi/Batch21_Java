package day27_ForEachLoop;

import java.util.Arrays;

public class UniqueChars {
    public static void main(String[] args) {

        String str = "aabbbcddde";
        char[] arr = str.toCharArray();//to convert from string to char array: [a, a, b, b, b, c, d, d, d, e]
        //String[] arr = str.split(""); //from char array to string array

        for (int j = 0; j < arr.length; j++){
            char element = arr[j];
            int count = 0;

            for (int i = 0; i < arr.length; i++){

                if (arr[i] == element){
                    count++;
                }
            }

            if (count == 1){
                System.out.print(element + " ");
            }

        }

    }
}
