package day10_ifElseStatement;

public class WarmUpTask4 {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        int num3 = 5;

        String str = " is the minimum number";

        if (num1 < num2 && num1 < num3) {
            System.out.println(num1+str);
        }
        if (num2 < num1 && num2 < num3) {
            System.out.println(num2+str);
        }
        if (num3 < num1 && num3 < num2) {
            System.out.println(num3+str);
        }
    }
}
/*
MinimumNumber
         write a java program that accepts three numbers and return the minimum number
                (assume that none of them are equal)
 */