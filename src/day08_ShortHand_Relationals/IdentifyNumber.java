package day08_ShortHand_Relationals;

public class IdentifyNumber {
    public static void main(String[] args) {

        int a = 100;
        boolean isPositive = a > 0;
        boolean isNegative = a < 0;
        boolean isZero = a == 0;

        System.out.println(a+ " is positive number: "+ isPositive);
        System.out.println(a+ " is negative number: "+ isNegative);
        System.out.println(a+ " is zero : "+ isZero);
    }


}
