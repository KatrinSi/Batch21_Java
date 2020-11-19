package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class Replit_134 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] inner = new int[4];//2
        int[] outer = new int[7];//4
        for (int i = 0; i < 4; i++) {//2,4
            inner[i] = scan.nextInt();
        }
        for (int j = 0; j < 7; j++) {//1, 2, 4, 6
            outer[j] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);
        //WRITE YOUR CODE HERE

        int count = 0;
        String result = "";

        for (int j = 0; j <= inner.length - 1; j++) { // inner
            int elementInner = inner[j];//2
            for (int i = 0; i <= outer.length - 1; i++) { // outer
                if (outer[i] == elementInner&&!result.contains(""+outer[i])) {
                    result +=" "+outer[i];
                    count++;
                }
            }
        }

        System.out.println(count == inner.length);

    }
}




/*
Given two arrays of ints sorted in increasing order, outer and inner,
print out true if all of the numbers in inner appear in outer.
Take advantage of the fact that both arrays are already in sorted order.
Example:
input (outer): 1, 2, 4, 6
input (inner): 2, 4
output: true

Example:
input (outer): 1, 2, 4
input (inner): 6, 5
output: false

4 {-1 0 3 12}
7 {-1 0 3 3 3 10 12}


 */