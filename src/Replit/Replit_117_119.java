package Replit;

import java.util.Scanner;

public class Replit_117_119 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = input.nextLine(); //"apple", "banana","kiwi", "grape","milk", "soda","juice", "coffee"
                                      //    0        1       2       3       4       5       6        7
        }
       /* for (int i = 0, j = 1; j < arr.length; j++) {
            System.out.println(arr[i] + " , " + arr[j]);
            i += 2;
            j += 1;
        }

        */

        for (int i = 0, j = 1, n = 2; n < arr.length;n++) {
            System.out.println(arr[i] + " , " + arr[j]+ " , " + arr[n]);
            i += 1;
            j += 1;
        }

    }

}



/*
apple
banana
kiwi
grape
milk
soda
 */