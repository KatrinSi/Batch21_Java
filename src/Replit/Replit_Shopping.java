package Replit;
import java.util.Scanner;

public class Replit_Shopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Item1, count and its price:");
        String item1 = scan.next();
        double price1 = scan.nextDouble();
        int count1 = scan.nextInt();
        System.out.println("Item1 is "+"\""+item1+"\""+", "+ "count is "+count1+", "+"price is "+price1);

        System.out.println("Enter Item2, count and its price:");
        String item2 = scan.next();
        double price2 = scan.nextDouble();
        int count2 = scan.nextInt();
        System.out.println("Item2 is "+"\""+item2+"\""+", "+ "count is "+count2+", "+"price is "+price2);

        System.out.println("Enter Item3, count and its price:");
        String item3 = scan.next();
        double price3 = scan.nextDouble();
        int count3 = scan.nextInt();
        System.out.println("Item3 is "+"\""+item3+"\""+", "+ "count is "+count3+", "+"price is "+price3);
        String report = "";
        double totalPrice = 0;
        if (count1>0||count2>0||count3>0){
            System.out.println("Total price: "+ price1+price2+price3);
        }

    }

}
