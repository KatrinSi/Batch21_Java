package day11_MutiBranchIf;

public class MaximumNumber {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        boolean num1IsMax = num1 > num2 && num1 > num3;
        boolean num2IsMax = num2 > num1 && num2 >num3;


        if (num1IsMax) {
            System.out.println(num1 + " is the maximum number.");
        }
        else if (num2IsMax) {
            System.out.println(num2 + " is the maximum number.");
        }else{
            System.out.println(num3 + " is the maximum number.");
        }

    }
}
