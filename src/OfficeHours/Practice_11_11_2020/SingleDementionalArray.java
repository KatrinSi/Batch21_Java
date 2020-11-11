package OfficeHours.Practice_11_11_2020;

import java.util.Arrays;

public class SingleDementionalArray {
    public static void main(String[] args) {

        int[] scores = new int[5];
        scores[0] = 10;
        scores[1] = 20;
        scores[2] = 50;
        scores[3] = 30;
        scores[4] = 40;
        System.out.println(Arrays.toString(scores));
//                   or i < scores.length;
        for (int i = 0; i <= scores.length-1; i++){
            System.out.println(scores[i]);
        }
        System.out.println("==============================");

        for (int each : scores){//each represents an element
            System.out.println(each);
        }


    }
}
