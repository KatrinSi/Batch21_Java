package day09_If_Statement;

public class WarmUpTask2 {
    public static void main(String[] args) {

        String name1 = "John";
        String citizenShip1 = "USA";
        int age1 = 18;

        String name2 = "Jimmy";
        String citizenShip2 = "Korea";
        int age2 = 13;

        boolean isEligible1 = citizenShip1 == "USA"&& age1>= 18;
        boolean isEligible2 = citizenShip2 == "USA"&& age2>= 18;

        System.out.println(name1+" is eligible to vote for Donald Trump or Joe Biden?\n\t"+ isEligible1);
        System.out.println(name2+" is eligible to vote for Donald Trump or Joe Biden?\n\t"+ isEligible2);

    }

}
/*
write a program that can check if the person is eligible to vote for Donald Trump or Joe Biden
		Ex:
			name = "John"
			citizenShip = "USA"

			output:
				John is eligible to vote for Donald Trump or Joe Biden?
					true


			name = "Jimmy"
			citizenShip = "Korea"

			output:
				Jimmy is eligible to vote for Donald Trump or Joe Biden?
					false
 */