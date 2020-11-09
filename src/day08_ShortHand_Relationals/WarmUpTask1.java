package day08_ShortHand_Relationals;

public class WarmUpTask1 {
    public static void main(String[] args) {
        int gallons = 100;
        int liters = (int) (gallons * 3.785);

        System.out.println(gallons+ " gallons equal to "+ liters+ " liters");
    }

}
/*
write a program that converts the given number of gallons to liters.
                Note: MUST return integer result

                Ex:
                    gallons: 100

                    output:
                        100 gallons equal to 378 liters

                Hint: 1 gallon = 3.785 liters
 */