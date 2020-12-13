package Replit;

import java.util.Scanner;

public class Assessment_test_6_1_mIxEd_CaSe {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below

        String[] arr = s.split("");
        String result = "";

        for (int i = 0; i < arr.length;i++){
            if (i % 2 == 0){
                result+=arr[i].toLowerCase();
            }else{
                result+=arr[i].toUpperCase();
            }
        }
        System.out.println(result);

    }
}
