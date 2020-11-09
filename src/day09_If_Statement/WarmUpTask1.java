package day09_If_Statement;

public class WarmUpTask1 {
    public static void main(String[] args) {
        String name1 = "James";
        String name2 = "Aaron";
        int age1 = 19;
        int age2 = 39;
        int eligibleAge = 21;

        boolean isEligible1 = age1 >= eligibleAge;
        boolean isEligible2 = age2 >= eligibleAge;

        System.out.println(name1+" is eligible to buy alcohol?\n\t"+isEligible1);
        System.out.println(name2+" is eligible to buy alcohol?\n\t"+isEligible2);

    }

}
/*
write a program that can check if the person is eligible to buy alcohol
        Ex:
            name = "James"
            age = 19
            output:
                James is eligible to buy alcohol?
                    false
            name = "Aaron"
            age = 39
            output:
                Aaron is eligible to buy alcohol?
                    true
 */