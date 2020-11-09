package day11_MutiBranchIf;

public class MaxNumberBetween3 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        String maxNum = "";
        if (num1>num2 && num1>num3) {
            maxNum = num1 + " is the maximum number.";
        }else if (num2>num1 && num2>num3) {
            maxNum = num2 + " is the maximum number.";
        }else {
            maxNum = num3 + " is the maximum number.";
        }
        System.out.println(maxNum);
        System.out.println("========================");

        int maxNum2 = (num1>num2 && num1>num3) ? num1 : (num2>num1 && num2>num3) ? num2 : num3;
        System.out.println(maxNum2+ " is the maximum number.");
        //String maxNum2 = (num1>num2 && num1>num3) ? num1 + " is the maximum number." : (num2>num1 && num2>num3) ? num2 + " is the maximum number." : num3 + " is the maximum number.";
        //System.out.println(maxNum2);
    }
}
