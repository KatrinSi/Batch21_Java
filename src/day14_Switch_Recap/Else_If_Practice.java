package day14_Switch_Recap;

public class Else_If_Practice {
    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 3;

        if (num1 > num2){
            System.out.println(num1+ " is greater than "+ num2);
        }else if (num1 < num2){
            System.out.println(num2+ " is greater than "+ num1);
        }else{ // num1 == num2
            System.out.println(num1 + " is equal to "+ num2);
        }
        System.out.println("========================================");

        int numOfDay = 1;

        if (numOfDay == 1){
            System.out.println("Today is Monday");
        }else if (numOfDay == 2){
            System.out.println("Today is Tuesday");
        }else if (numOfDay == 3){
            System.out.println("Today is Wednesday");
        }else if (numOfDay == 4){
            System.out.println("Today is Thursday");
        }else if (numOfDay == 5){
            System.out.println("Today is Friday");
        }else if (numOfDay == 6){
            System.out.println("Today is Saturday");
        }else{
            System.out.println("Today is Sunday");
        }
        System.out.println("=======================================");

        int age = 21;

        if (age < 21){
            System.out.println("Teenager");
        }else if (age <= 55){
            System.out.println("Adult");
        }else{
            System.out.println("Senior");
        }


    }
}
