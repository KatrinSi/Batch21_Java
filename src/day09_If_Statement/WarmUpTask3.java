package day09_If_Statement;

public class WarmUpTask3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = a; //OR Delete int c

        System.out.println("a is "+ (a = b));
                   // a = 10;
        System.out.println("b is "+ (b = c));
    }

}
/*
write a program that can swipe two variables' value by using a temporary variable
	Ex:
		a =10;
		b= 15;

	output:
		a is 15
		b is 10
 */