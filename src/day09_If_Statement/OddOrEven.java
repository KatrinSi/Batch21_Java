package day09_If_Statement;

public class OddOrEven {
    public static void main(String[] args) {

        int num = 1000;

        boolean isEven = num%2 == 0;
        boolean isOdd = !isEven ;

        System.out.println(num + " is even number: "+isEven);
        System.out.println(num + " is odd number: "+isOdd);

        System.out.println("=======================================");

        int n = 200;

        boolean isPositive = n > 0;
        boolean isNegative = n < 0;
        boolean isZero = !isPositive && !isNegative;

        System.out.println(n+ " is positive: "+isPositive);
        System.out.println(n+ " is negative: "+isNegative);
        System.out.println(n+ " is zero: "+isZero);
        System.out.println("==================================");

        String weather = "Shinny";
        int degree = 70;

        boolean r1 = !(weather == "Rainy" || degree == 70);
        System.out.println(r1);

    }
}
