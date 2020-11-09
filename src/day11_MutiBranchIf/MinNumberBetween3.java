package day11_MutiBranchIf;

public class MinNumberBetween3 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        String minNum = "";

        if (num1<num2 && num1<num3) {
            minNum = num1+" is minimum number.";
        }else if (num2<num1 && num2<num3) {
            minNum = num2+" is minimum number.";
        }else{
            minNum = num3+" is minimum number.";
        }
        System.out.println(minNum);
        System.out.println("========================");

        int minNum2 = (num1<num2 && num1<num3) ? num1 : (num2<num1 && num2<num3) ? num2 : num3;
        System.out.println(minNum2+ " is minimum number.");
        //String minNum2 = (num1<num2 && num1<num3) ? num1+" is minimum number." : (num2<num1 && num2<num3) ? num2+" is minimum number."  : num3+" is minimum number.";
        //System.out.println(minNum2);
    }
}
