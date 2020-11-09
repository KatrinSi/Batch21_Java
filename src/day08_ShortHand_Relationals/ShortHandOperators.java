package day08_ShortHand_Relationals;

public class ShortHandOperators {
    public static void main(String[] args) {
        int a = 10;

        System.out.println(a);

        a = 30; //reassigned a value


        System.out.println(a);

        int b = 100;
            b -= 62;

        System.out.println(b);

        double salary = 100000; // 0.28
               salary -= salary*0.28; //= 28000
            // salary = salary - 28000
            // salary = 100000 - 28000
        System.out.println(salary);

        int x2 = 999999;
            x2 -= 25;

        System.out.println(x2);

        int y2 = 400;
            y2 += 10000* 0.1;
            // y2 = += 1000
            // y2 = 1400


        int a2 = 100;
            a2 %= 3;


        System.out.println(a2);

    }
}
