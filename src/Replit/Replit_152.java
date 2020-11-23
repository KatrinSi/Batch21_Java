package Replit;

import java.util.Scanner;

public class Replit_152 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {
            arr[i] = inp.nextInt();
        }

        plus_minus(arr);

    }//end of main method

    // write your codes here:

    public static void plus_minus(int[] arr) {

        String result = "";
        int countZero = 0;
        int countNeg = 0;
        int countPos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countZero++;
            } else if (arr[i] < 0) {
                countNeg++;
            } else if(arr[i]>0) {
                countPos++;
            }
            result += "positives:" + countZero+", ";
            result += "negative:" + countNeg+", ";
            result += "zeros:" + countPos;
        }
        System.out.println(result);

    }
}


