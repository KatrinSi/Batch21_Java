package day14_Switch_Recap;

public class IfStatementNoBraces {
    public static void main(String[] args) {

        int a = 10;

        if (a % 2 == 0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");


        System.out.println("===========================");


        if (a > 0)
            System.out.println("Positive");
        else if (a < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");

        System.out.println("============================");

        int num = 5;
        String day = "";

        if (num >= 1 && num <= 7)

            if (num == 1)
                day = "Mon";
            else if (num == 2)
                day = "Tue";
            else if (num == 3)
                day = "Wed";
            else if (num == 4)
                day = "Thur";
            else if (num == 5)
                day = "Fri";
            else if (num == 6)
                day = "Sat";
            else
                day = "Sun";

        else
            day = "Invalid";

        System.out.println(day);
    }

}

