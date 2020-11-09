package day21_WhileLoops;

import java.util.Scanner;

public class StringPractice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();//java
        int lastInd = str.length() -1; // the last character
        char first = str.charAt(0);
        char last = str.charAt(lastInd);

        System.out.println(""+first+last);

        System.out.println("Batch "+ 2+1);
                            // Batch 2 1
        System.out.println("=============================================");

        //String buildingNum =      ( next()      )
        //String street =           ( nextLine()  )
        //String aptNum =           ( next()      )
        //String city =             ( nextLine()  )
        //String state =            (nextLine()   )
        // int zipcode =            (nextInt()    )

        while (true) {
            System.out.println("Enter your building number: ");
            String buildingNum = scan.next();
            scan.nextLine();

            System.out.println("Enter your street: ");
            String street = scan.nextLine();

            System.out.println("Enter your apartment number: ");
            String aptNum = scan.next();
            scan.nextLine();

            System.out.println("Enter your city: ");
            String city = scan.nextLine();

            System.out.println("Enter your state: ");
            String state = scan.nextLine();

            System.out.println("Enter your zipcode: ");
            int zipcode = scan.nextInt();
            String fullAddress = buildingNum + " "+ street+ " ,Apt#"+ aptNum+ "\n"+ city + ", "+ state + " "+ zipcode;
            System.out.println(fullAddress);
            System.out.println("Would you like to continue? Yes, No");
            String answer = scan.next();

            if (answer.equalsIgnoreCase("no")){
                break;
            }

        }






    }
}
