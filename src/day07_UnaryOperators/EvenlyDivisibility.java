package day07_UnaryOperators;

public class EvenlyDivisibility {
    public static void main(String[] args) {
        int number = 3;
        boolean isdivisibleBy2 = number%2 < 1;// =1
        boolean isdivisibleBy3 = number%3 < 1;// =2
        boolean isdivisibleBy5 = number%5 < 1;// =0


        System.out.println(number+" is divisible by 2: "+ isdivisibleBy2);
        System.out.println(number+" is divisible by 3: "+ isdivisibleBy3);
        System.out.println(number+" is divisible by 5: "+ isdivisibleBy5);
    }


}
/*
 Divisibility, write a program that can check if a number is evenly divisible by 2, 3, 5,
			Ex:
				number = 65;  ==> int
				divisibleBy2 ==> true/false
				divisibleBy3 ==> true/false
				divisbileBy5 ==> true/false

			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true


				number = 80;

			output:
				80 is divisible by 2: true
				80 is divisible by 3: false
				80 is divisible by 5: true
 */