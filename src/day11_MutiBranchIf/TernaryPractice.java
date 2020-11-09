package day11_MutiBranchIf;

public class TernaryPractice {
    public static void main(String[] args) {
        int num = 100;
        String result1 = " ";

        if (num%2 == 0){
            result1 = "Even";
        }else{
            result1 = "Odd";
        }
        System.out.println(result1);

        System.out.println("==============================");

        String result2 = (num%2 == 0) ? "Even" : "Odd";
        System.out.println("===============================");

        int age = 25;
        String citizenShip = "USA";
        String eligibleToVote = (age >= 18 && citizenShip == "USA") ? "Eligible to vote" : "Not eligible to vote";
        System.out.println(eligibleToVote);
        System.out.println("================================");

        int age1 = 20;
        String eligibleToBuyAlco = (age1 >= 21) ? "Eligible to buy alco" : "Not eligible to vote";
        System.out.println("=================================");

        int number = 100;
        String s1 = "";
        if (number > 0) {
            s1 = "Positive";
        }else if (number < 0 ) {
            s1 = "Negative";
        }else{
            s1 = "Zero";
            System.out.println(s1);
        }
        String s2 = (number>0) ? "Positive" : (number<0) ? "Negative" : "Zero";
        System.out.println(s2);

    }
}
