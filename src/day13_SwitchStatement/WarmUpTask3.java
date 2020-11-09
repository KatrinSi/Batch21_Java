package day13_SwitchStatement;

public class WarmUpTask3 {
    public static void main(String[] args) {
        int age = 31;
        String groupOfAge = " ";

        if (age >=0 && age <=150){

            if (age <= 21){
                groupOfAge = "Teenager";
            }else if (age >= 55){
                groupOfAge = "Senior";
            }else{
                groupOfAge = "Adult";
            }
        }else{
            System.out.println("Invalid number");
        }

        System.out.println(groupOfAge);

        System.out.println("======================================");

        if (age >=0 && age <= 150){
            groupOfAge = (age <= 21)? "Teenager"
                        :(age >=55)? "Senior"
                        :"Adult";
        }else{
            System.out.println("Invalid number");
        }
        System.out.println(groupOfAge);
    }


}
/*
write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

                Hint:  age cannot be negative or greater than 150

                  NOTE: MUST APPLY NESTED IF


 */