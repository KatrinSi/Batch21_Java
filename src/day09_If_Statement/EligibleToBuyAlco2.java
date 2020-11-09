package day09_If_Statement;

public class EligibleToBuyAlco2 {

    public static void main(String[] args) {

        int age = 20;

        boolean eligible= age >=21;
        if (eligible) {
            System.out.println("You are eligeble to buy alcohol.");

        }
        if (!eligible) {
                System.out.println("Go buy a milk.");
        }

        System.out.println("===================");

        boolean isBreakTime = true;
        if (isBreakTime) {
            System.out.println("Time to take a break!");
        }
        if (!isBreakTime) {
            System.out.println("Let's continue the class.");
        }
    }
}
