package day09_If_Statement;

public class EligibleToVoid {
    public static void main(String[] args) {
        String name = "Jimmy";
        boolean isUSAcitizen = false;
        int age = 25;
        boolean hasCriminalBackground = true;

        boolean isEligible = isUSAcitizen == true && age>=18 && hasCriminalBackground == false;

        System.out.println(name+" is eligible to vote: "+isEligible);

        System.out.println("================================================");

        String name2 = "John";
        String citizenShip1 = "Canada";
        String citizenShip2 = "USA";

        boolean isEligibleToVoit = citizenShip1 == "USA" || citizenShip2 == "USA";

        System.out.println(name2+" is eligible to void: "+ isEligibleToVoit);



    }
}

