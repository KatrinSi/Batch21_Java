package day45_Exceptions;

import Library.BrowserUtility;

public class ThrowVSTryCatch {

    public static void main(String[] args) {
        method1();
        System.out.println("Try & Catch");

        BrowserUtility.sleep(3);

        System.out.println("Throws");
    }
    public static void method1() {


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

    }

    public static void method2() throws InterruptedException{
        Thread.sleep(2000);
    }
    //readable
    //clean
    //shorter

    //- for temporary solutions since does not handle exceptions, doesn't fix


}
