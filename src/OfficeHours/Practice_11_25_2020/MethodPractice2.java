package OfficeHours.Practice_11_25_2020;

public class MethodPractice2 {

    public static void main(String[] args) {

        System.out.println(max(5,7));
        System.out.println(max(1,33,3));
        System.out.println(max(1,2,3,4));
    }


    public static int max(int a, int b) {
        int max = (a > b) ? a : b;
        return max;
    }

    public static double max(double a, double b) {
        double max = (a > b) ? a : b;
        return max;
    }

    public static int max(int a, int b, int c){
        return max(max(a,b),c);
    }

    public static int max (int a, int b, int c, int d){
        return max(max(a,b,c),d);
    }

}
