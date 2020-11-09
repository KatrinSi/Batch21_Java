package day15_Scanner;

import java.util.Scanner;

public class Float_Double {
    public static void main(String[] args) {

        Scanner decimal = new Scanner(System.in);

        System.out.println("Enter a float number: ");
        float floatNum = decimal.nextFloat();
        System.out.println("Number is "+ floatNum);

        System.out.println("Enter a double number: ");
        double doubleNum = decimal.nextDouble();
        System.out.println("Number is "+ doubleNum);

        System.out.println(decimal.nextFloat()+decimal.nextDouble());

    }
}
