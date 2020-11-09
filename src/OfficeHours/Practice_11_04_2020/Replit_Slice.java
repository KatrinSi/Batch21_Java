package OfficeHours.Practice_11_04_2020;

public class Replit_Slice {
    public static void main(String[] args) {

        int num = 12345;
        // the smallest 10000 digit num 10000
        int digit1 = num/10_000; //1.2345 == 1
        // the smallest 1000 digit num 1_0000
        int digit2 = num%10000/1000;
        //             2345/1000 = 2.345
        //                  2
        int digit3 = num % 10_000 % 1_000 / 100;
                //  2345 % 1000
                //      345/ 100 = 3.45
                //          3
        int digit4 = num % 10_000 % 1_000 % 100 / 10;
                //      345%100
                //       45/10 = 4.5
                //          4
        int digit5 = num % 10_000 % 1_000 % 100 % 10;
                //          45%10
                //              5

        System.out.println("digit 1 = "+digit1);
        System.out.println("digit 2 = "+digit2);
        System.out.println("digit 3 = "+digit3);
        System.out.println("digit 4 = "+digit4);
        System.out.println("digit 5 = "+digit5);



    }
}
