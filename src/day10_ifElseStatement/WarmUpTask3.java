package day10_ifElseStatement;

public class WarmUpTask3 {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 200;
        int num3 = 300;
        //or: boolean Num1IsMax = num1 > num2 && num1 > num3;
        //   boolean Num2IsMax = !Num1IsMax && num2 > num3;
        //   boolean Num3IsMax = !Num1IsMax && !Num1IsMax;
        //if (Num1IsMax) {
        // System.out.println (num1+ " is the maximum number.");
        // }...

        String str = " is the maximum number."; //!!!

        if (num1 > num2 && num1 > num3) {
            System.out.println(num1+ str);
        }
        if (num2 > num1 && num2 > num3) {
            System.out.println(num2+ str);
        }
        if (num3 > num1 && num3 > num2) {
            System.out.println(num3+ str);
        }
    }
}
/*
MaximumNumber
         write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)
 */