package day07_UnaryOperators;

public class PrimitiveCastings {
    public static void main(String[] args) {
        short a = 3000;
        long b = a;


        double d1 = 200.5;
        int i1 = (int)d1;

        System.out.println(i1);


        long l1 = 100;
        short s1 = (short)l1;

        double d2 = 300;
        float f1 = (float) d2;

        long l3 = 100;
        byte b2 = (byte) l3;

        System.out.println(b2);
    }
}
