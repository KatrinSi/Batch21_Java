package day15_Scanner;

public class WarmUpTask1 {
    public static void main(String[] args) {

        String houseType = "Mansion";
        String statement = "\"" + houseType + "\" \n" + "Maximum occupation: ";

        switch (houseType) {
            case "Tree house":
                System.out.println(statement +=  1);
                break;
            case "Mobile home":
                System.out.println(statement +=  2);
                break;
            case "Apartment":
                System.out.println(statement += 4);
                break;
            case "Town house":
                System.out.println(statement += 6);
                break;
            case "Villa":
                System.out.println(statement += 8);
                break;
            case "Mansion":
                System.out.println(statement += 10);
                break;
            default:
                System.out.println("Incorrect value");


        }


    }
}
/*
Given a house type (String) print out the number of max occupants (int)
	Tree house: 1
	Mobile home: 2
	Apartment: 4
	Town house: 6
	Villa: 8
	Mansion: 10
 */