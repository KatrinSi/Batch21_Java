package day11_MutiBranchIf;

public class MaxNumber {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 2;

        String maxNum = " ";
        if (num1 > num2) {
            maxNum = num1+" is maximum number.";
        }else{
            maxNum = num2+ " is maximum number.";
        }
        System.out.println(maxNum);
        System.out.println("====================");


        //String maxNum1 = (num1 > num2) ? num1+" is maximum number." : num2+ " is maximum number.";
        //System.out.println(maxNum1);
        int maxNum1 = (num1 > num2) ? num1 : num2;
        System.out.println(maxNum1+ " is maximum number.");
    }
}
