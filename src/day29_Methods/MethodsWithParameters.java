package day29_Methods;

public class MethodsWithParameters {

    public static void main(String[] args) {


        int age = 20;
        eligibleToBuyAlcohol(age);
        eligibleToBuyAlcohol(30);
        calculateAge(1987, 1987);

    }

    public static void eligibleToBuyAlcohol(int age) {
        if (age >= 21) {
            System.out.println("Eligible to buy alcohol");
        } else {
            System.out.println("Not eligible to buy alcohol");
        }


    }

    public static void calculateAge(int birthYear, int currentYear) {
        if (birthYear <= currentYear) {
            System.out.println("Your age is: " + (currentYear - birthYear));
        } else {
            System.err.println("Invalid data");
        }


    }

}
