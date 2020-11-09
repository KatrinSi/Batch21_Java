package day11_MutiBranchIf;

public class MinNumber {
    public static void main(String[] args) {

        int num1 = 3;
        int num2 = 8;
        String minNum = "";

        if (num1 < num2) {
            minNum = num1 + " is minimum number";
        }else{
            minNum = num2 + " is minimum number.";
        }
        System.out.println(minNum);
        System.out.println("=========================");

        int minNum2 = (num1 < num2) ? num1 : num2;
        System.out.println(minNum2+" is minimum number");
        //String minNum2 = (num1 < num2) ? num1+" is minimum number" : num2 + " is minimum number.";
        //System.out.println(minNum2);
    }
}
