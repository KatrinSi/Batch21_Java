package day07_UnaryOperators;

public class PrePost {
    public static void main(String[] args) {
        int x = 2;
        int y = x++;
        System.out.println(x);

        int x1 = 2;
        System.out.println(x1++);

        int x2 =2;
        System.out.println(--x2);

        int x3 = 8;
        int y2 = x3--;
        System.out.println(y2);
        System.out.println(x3);


        System.out.println("===============================================");

        int a = 1;
        int b = -a-- +a++ / -a-- * --a;
        //  b = -1  +  0 + / -1   *  -1
        //  b = -1 + 0 * - 1
        //  b = -1

        System.out.println(b);
        System.out.println("==================================================");

        int A = 50;
        int B = --A + A++ + A-- + A++;
         // B = 49 + 49 + 50 + 49;
         // B =    98 + 99
         // B = 197

        System.out.println(B);

        System.out.println("==================================================================");

        int X = 4;
        int Y = X * 4 - X++;
        //  Y = 4 * 4 - 4
        //  Y =   16 - 4
        //  Y = 12

        System.out.println(Y);

        System.out.println("================================================================");

        int t = 100; //101
        int p =  - ++t * -t-- / t++ + --t;
        //  p = - 101 * - 101 / 100 + 100;
        //  p = 10201 / 100 + 100
        //  p = 102 + 100
        //  p = 202

        System.out.println(p);

        System.out.println("======================================================");

        int R = 20;//19--20---19----18
        int W = -R-- + -R++ + --R * R-- % 2;
        //  W = -20  + -19  +  19 *  19 % 2
        //  W = -20  + -19  +     361   % 2
        //  W = -20  + -19  + 1
        //  W =     -39     + 1
        //  W =        -38


        System.out.println(W);








    }
}
