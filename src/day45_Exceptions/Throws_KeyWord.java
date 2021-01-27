package day45_Exceptions;

public class Throws_KeyWord {
    public static void main(String[] args) {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Step 2");

    }

}
