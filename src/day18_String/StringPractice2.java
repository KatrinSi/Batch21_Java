package day18_String;

import java.util.Scanner;

public class StringPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter apple product name:");
        String product = scan.nextLine();
        product = product.replace(" ", "").toLowerCase();//macbook;

        switch (product) {
            case "macbook":
                System.out.println("Which model of MacBook would you like?");
                String model = scan.nextLine().toUpperCase();
                if (model.equalsIgnoreCase("air")) {
                    System.out.println("MacBook Air is $ 2400");
                }else if (model.equalsIgnoreCase("pro")){
                    System.out.println("MacBook Pro is 2500");
                }else{
                    System.out.println("Invalid model for MacBook");
                }
                break;
            case "iphone":
                System.out.println("Which model of IPhone would you like?");
                String model2 = scan.nextLine().toLowerCase();
                if (model2.equals("12")){
                    System.out.println("Iphone 12 is $1000");
                }else if(model2.equals("11")){
                    System.out.println("Iphone 11 is $900");
                }else if(model2.equals("10")){
                    System.out.println("Iphone 10 is $800");
                }else if(model2.equals("8")){
                    System.out.println("Iphone 8 is $700");
                }else{
                    System.err.println("Invalid model for IPhone");
                }
                break;
            case "ipad":
                System.out.println("Which model of Ipad would you like?");
                String model3 = scan.nextLine().toLowerCase();
                switch (model3){
                    case "air":
                        System.out.println("Ipad Air is $500");
                        break;
                    case "mini":
                        System.out.println("Ipad Mini is $300");
                        break;
                    case "pro":
                        System.out.println("Ipad Pro is $400");
                        break;
                    default:
                        System.out.println("Invalid model for Ipad");
                }

                break;
            default:
                System.err.println("Invalid product name");

        }

    }
}
