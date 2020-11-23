package day31_MethodOverLoading;

public class MethodOverloading2 {
    public static void main(String[] args) {
        System.out.println(Sum(10,20));
        System.out.println(Sum(1,2,3));
        System.out.println(Sum(1,2,3,4));
    }

    public static int Sum (int n1, int n2){
        return n1+n2;
    }
    public static int Sum (int n1,int n2, int n3){
        return Sum(n1,n2)+n3;
    }
    public static int Sum(int n1, int n2, int n3, int n4){
        return Sum(n1,n2,n3)+n4;
    }
    public static double Sum(double a, double b){
        return a+b;
    }

}
