package PresentationTasks;

public class Task5_FibonacciNumbers {
    //Write a return method that returns the Fibonacci of any given number


    public static void main(String[] args) {
        //The Fibonacci number is a sum of the two preceding numbers
        //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233 ...

        int num = 5; //represents the fibonacci index

        System.out.println(fibonacciNumber(num));
    }

    //a  b
    public static int fibonacciNumber(int num) {//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233 ...
                                                //1  2  3  4  5  6  7  8  9..
        int fibonacci = 0, previous = 0, next = 1;

        for (int i = 2; i < num; i++) {
            fibonacci = previous + next;
            previous = next;
            next = fibonacci;
        }
        if (num == 1) {
            return previous;
        } else if (num == 2) {
            return next;
        }
        return fibonacci;
    }

}
