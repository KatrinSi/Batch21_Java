package day45_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsVSTryCatch {
    public static void method1() throws FileNotFoundException {
        FileInputStream file = new FileInputStream("");
    }
    public static void method2() throws FileNotFoundException{
        method1();
    }

    public static void method3(){
        try {//allows to use this method again
            method1();
        } catch (FileNotFoundException e) {
        }
    }
    public static void method4(){
        method3();
    }
}
