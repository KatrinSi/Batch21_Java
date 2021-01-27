package day45_Exceptions;

public class FinallyBlock {
    public static void main(String[] args) {

        try {//mandatory
            System.out.println(9/0);
        }catch (ArrayIndexOutOfBoundsException e){//mandatory
            System.out.println("Catch block");
        }finally {//optional
            System.out.println("Closed");//finally block is ALWAYS executed!
        }
        System.out.println("Test completed");

    }
}
