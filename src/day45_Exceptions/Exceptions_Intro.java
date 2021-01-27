package day45_Exceptions;

public class Exceptions_Intro {
    public static void main(String[] args) throws InterruptedException {

        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[100]);

        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 100
	    //at day45_Exceptions.Exceptions_Intro.main(Exceptions_Intro.java:7)
	    //  Unexpected event! --> unchecked exception --> runtime


        Thread.sleep(2000);
        //sleep - Unhandled exception: java.lang.InterruptedException
        //  Unwanted event --> checked exception --> compile time
    }
}
