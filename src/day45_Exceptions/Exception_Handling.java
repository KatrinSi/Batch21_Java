package day45_Exceptions;

public class Exception_Handling {
    public static void main(String[] args) {
        String str = "Cybertek";
        try {
            System.out.println(str.substring(200, 300));
            System.out.println("Try");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Catch");
            System.out.println("StringIndexOutOfBoundsException is occurred");//StringIndexOutOfBoundsException is occurred
            //or
            System.out.println(e.getMessage());//String index out of range: 300
            //or
           e.printStackTrace(); //gives a report
           //java.lang.StringIndexOutOfBoundsException: String index out of range: 300
            //at java.lang.String.substring(String.java:1963)
            //at day45_Exceptions.Exception_Handling.main(Exception_Handling.java:7)
        }

        try {
            Thread.sleep(2000);
            //System.out.println("Try block");
        }catch (InterruptedException e){
            //System.out.println("Catch block");
        }

        try {
            System.out.println(100/0);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Test completed");

    }
}
