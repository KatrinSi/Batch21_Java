package day29_Methods;

public class VoidMethodsPractice3 {
    public static void main(String[] args) {
        eligibleToVote("USA", 17, true);
    }

    public static void eligibleToVote(String citizenShip, int age, boolean isAlive){
        if (citizenShip.equalsIgnoreCase("USA")){
            if(isAlive){
                if (age >= 18){
                    System.out.println("You are eligible to vote");
                }else{
                    System.out.println("You must be at least 18 years old");
                }
            }else{
                System.err.println("You must be come back to live to be able to vote");
            }

        }else{
            System.err.println("You must be citizen of USA");
        }
    }
}
