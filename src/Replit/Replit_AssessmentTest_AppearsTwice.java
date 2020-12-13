package Replit;

import java.util.Arrays;

public class Replit_AssessmentTest_AppearsTwice {

    public static void main(String[] args) {
        System.out.println(appearsTwice("laptop", "I would like to buy a new laptop, because my laptop is too old."));
    }

    public static boolean appearsTwice(String target, String sentence) {

        String [] str = sentence.split(" ");
        int count = 0;
        for (String each : str){
            if (each.contains(target)){
                count++;
            }
        }

        if (count ==2){
            return true;
        }else{
            return false;
        }

    }
}
