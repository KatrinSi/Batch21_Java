package day07_UnaryOperators;

public class LeapYear {
    public static void main(String[] args){
        int year = 1987;
        //0 < 1  ==> true
        boolean isLeapYear = year%4 < 1; //checks if year variable is evenly divisible by 4

        System.out.println(year+" is leap year: "+ isLeapYear);



    }
}
 /*
 1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
		Ex:
				year = 2020

			output:
				2020 is leap year: true


				year = 2021

			output:
				2021 is leap year: false

		Hint: if the number of year can be evenly divisible by 4, it's known as leap year

  */