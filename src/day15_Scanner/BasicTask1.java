package day15_Scanner;
import java.util.Scanner;
public class BasicTask1 {
    public static void main(String[] args) {
        Scanner sizes = new Scanner(System.in);

        System.out.println("Please, enter your height: ");
        double height = sizes.nextDouble();

        System.out.println("Please, enter your shoe size: ");
        byte shoeSize = sizes.nextByte();

        System.out.println("You like to wear hats? true/false");
        boolean hats = sizes.nextBoolean();

        System.out.println("Your height is: "+height);
        System.out.println("Your shoe size is: "+shoeSize);
        System.out.println("You like to wear hats? "+hats);

    }
}
/*
- Ask the user to enter their height (double),
shoe size (byte), and if they like to wear hats (boolean).
Print out the information
 */