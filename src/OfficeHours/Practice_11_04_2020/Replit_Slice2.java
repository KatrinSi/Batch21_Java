package OfficeHours.Practice_11_04_2020;

public class Replit_Slice2 {
    public static void main(String[] args) {

        int nums = 12345;

        String str = ""+nums; //"12345"
        /*System.out.println("digit 1"+str.charAt(0));
        System.out.println("digit 2"+str.charAt(1));
        System.out.println("digit 3"+str.charAt(2));
        System.out.println("digit 4"+str.charAt(3));
        System.out.println("digit 5"+str.charAt(4));

        */

        for (int i = 0, j = 1; i < str.length(); i++){
            System.out.println("digit "+j+ ": "+ str.charAt(i));
        }


    }
}
