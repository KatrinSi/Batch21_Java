package day10_ifElseStatement;

public class IfStatements {
    public static void main(String[] args) {
        int angle1 = 90;
        int angle2 = 90;
        int angle3 = 90;
        int angle4 = 90;
        boolean isValidRectangle = angle1==90 && angle2 == 90 && angle3==90 && angle4 == 90;

        if (isValidRectangle) {
            System.out.println("The Rectangle is valid.");
        }else {
            System.out.println("The Rectangle is invalid.");
        }
        System.out.println("===========================================");

        int a = 200;
        int b = 3000;
        int max = 0;

        if (a > b) {
            max = a;
        }else {
            max = b;
        }
        System.out.println(max +" is greater number.");
        //OR:
       // if (a > b) {
           // System.out.println(a +" is greater number.");
        //}else
           // System.out.println((b+" is greater number."));


    }
}
