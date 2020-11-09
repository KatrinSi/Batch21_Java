package day15_Scanner;
import java.util.Scanner;
public class BasicTask2 {
    public static void main(String[] args) {

        Scanner numbers = new Scanner(System.in);

        System.out.println("Print the first letter: ");
        int num1 = numbers.nextInt();

        System.out.println("Print the second letter: ");
        int num2 = numbers.nextInt();

        System.out.println(num1+ ", "+ num2+ " --> "+ num1 +" x "+num2+ " = "+(num1*num2));

    }

}

/*
Create a program that will take two int numbers and multiply them. Print in the following way:
	%numOne x %numTwo = %result
	Ex: 3,5 --> 3 x 5 = 15
	Ex: -2,30 --> -2 x 30 = -60
 */