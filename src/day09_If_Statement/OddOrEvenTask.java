package day09_If_Statement;

public class OddOrEvenTask {
    public static void main(String[] args) {
        int a = 1;
        boolean isEven = a%2 ==0;

        if (isEven) {
            System.out.println(a+ " is even number.");
        }
        if (!isEven) {
            System.out.println(a+ " is odd number.");
        }
    }
}
