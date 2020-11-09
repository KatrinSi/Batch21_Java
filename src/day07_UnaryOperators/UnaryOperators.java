package day07_UnaryOperators;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 0;
        boolean isPositive = a>0;
        boolean isNegative = a<0;


        System.out.println(a + " is positive: "+ isPositive);
        System.out.println(a + " is negative: "+ isNegative);

        int b = -100 -20;
        System.out.println(b);

        int c = 10 - - 20;
        System.out.println(c);

        int d = 100;
        --d;

        System.out.println(d);

        int z = 100;
        System.out.println(--z);

        int h = 5;
        System.out.println(h++);
        System.out.println(h);
        System.out.println(h);



    }
}
