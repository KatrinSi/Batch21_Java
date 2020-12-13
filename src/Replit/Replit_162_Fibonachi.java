package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Replit_162_Fibonachi {
    public static void main(String[] args) {

        int num = 21;//index
        int[] fibonachi = new int[num+1];

        fibonachi[0]= 0;
        fibonachi[1] = 1;

        for (int i = 2; i < fibonachi.length;i++ ){
            fibonachi[i] = fibonachi[i-2]+fibonachi[i-1];
        }
        System.out.println(Arrays.toString(fibonachi));
    }

}



