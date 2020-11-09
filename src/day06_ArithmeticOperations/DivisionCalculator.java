package day06_ArithmeticOperations;

public class DivisionCalculator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;
        int division = num1/num2;
        int remainder = num1%num2;

        String finalResult = (num1+ " divided by "+ num2+ " is equal to "+ division+ " with a remainder of "+ remainder);

        System.out.println(finalResult);

    }
}

/*

Task: DivisionCalculator

        write a program that can calculate first number by second number, and print out the result
            num1 = 10;
            num2 = 3;
            output:
                10 divide by 3 is equal to 3 with a remainder of 1
            num1 = 20
            num2 = 6
            output:
                 20 divide by 6 is equal to 3 with a remainder of 2
            num1 = 100;
            num2 = 20;
            output:
                 100 divide by 20 is equal to 5 with a remainder of 0

 */
