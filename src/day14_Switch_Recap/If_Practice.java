package day14_Switch_Recap;

public class If_Practice {
    public static void main(String[] args) {

        //if & else = only 2 options

        int num = 3;

        if (num%2 != 0){
            System.out.println(num +" is odd number");
        }else{
            System.out.println(num + " is even number");
        }
        System.out.println("==================================");

        int age = 14;

        if (age >= 16){
            System.out.println("You are eligible to get a drivers license");
        }else{
            System.out.println("You are eligible to get a drivers license");
        }
        System.out.println("====================================");

        char grade = 'A';

        if (grade == 'A' || grade == 'B' || grade == 'C'){
            System.out.println("You've passed the class");
        }else{
            System.out.println("You have not passed the class");
        }

    }
}
