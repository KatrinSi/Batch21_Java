package day12_NestedIf;

public class EligibleToVote {
    public static void main(String[] args) {
        String citizenShip = "USA";
        int age = 19;

        if (citizenShip == "USA") {
            if (age >=18) {
                System.out.println("You are eligible to vote.");
            }else{
                System.out.println("You must be at least 18 years old to vote");
            }
        }else{
            System.out.println("You are not eligible to vote.");
        }
    }

}
