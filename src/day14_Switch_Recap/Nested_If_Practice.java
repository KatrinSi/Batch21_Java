package day14_Switch_Recap;

public class Nested_If_Practice {
    public static void main(String[] args) {
        int age = 5;

        if (age >= 1 && age <= 150) {
            if (age < 21) {
                System.out.println("Teenager");
            } else if (age <= 55) {
                System.out.println("Adult");
            } else {
                System.out.println("Senior");
            }
        } else {
            System.out.println("Invalid input");
        }

        System.out.println("==========================================");

        int hourlyRate = 45;
        int weeklyHours = 60;
        int numberOfWeeks = 1000;
        int salary = 0;

        if (hourlyRate > 0) {

            if (weeklyHours > 1 && weeklyHours <= 65) {

                if (numberOfWeeks > 1 && numberOfWeeks <= 52) {

                    salary = hourlyRate * weeklyHours * numberOfWeeks;

                } else {
                    System.err.println("Number of weeks can not be less than 1 or greater than 52");
                }

            } else {
                System.err.println("Weekly hours can not be less than 1 or greater than 65");
            }
        } else {
            System.err.println("Hourly rate can not be Negative or Zero.");
        }
        if (salary != 0) {
            System.out.println("Your salary is: " + salary);
        }

        System.out.println("=============================================");


        String citizen = "Canada";
        boolean isResident = false;
        boolean isAlien = true;
        int yourAge = 12;
        boolean highSchoolDiploma = true;

        if (citizen == "USA"|| isResident|| isAlien && citizen != "China"){
            if (age >= 17 && age <= 34){
                if (highSchoolDiploma == true){
                    System.out.println("You are qualified for an Army");
                }else{
                    System.err.println("You need to get a high school diploma");
                }


            }else{
                System.err.println("You must be between 17 to 34 years old");
            }

        }else{
            System.err.println("You must be a U.S. citizen or Alien or Resident");
        }



    }
}
 /*
        1. write a program for the salary calculator
			given info:
					hourlyRate
					weeklyHours
					numberofWeeks
			pre conditions: hourlyRate cannot be negative
							weekly hours cannot be negative or more than 65
							numberOfWeeks cannot be more than 52 weeks or less than 1


    2. What are the qualifications to join the Army?
            You must be a U.S. citizen or a resident alien.
            Be between the ages of 17-34. ...
            Have a high school diploma.
            Have no more than two dependents.
         */