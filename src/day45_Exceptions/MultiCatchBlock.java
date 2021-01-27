package day45_Exceptions;

import java.util.NoSuchElementException;

public class MultiCatchBlock {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
            //plan A
        } catch (NoSuchElementException e) {
            System.out.println("No Such Element Exception");
            //plan B
        } catch (ClassCastException e) {
            System.out.println("Class Cast Exception");
            //plan C
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
            //plan D
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
            //plan E
        } catch (RuntimeException e) {
            System.out.println("Runtime Exception");// at the end!! because RuntimeException is a PARENT exception.
            // Used for unchecked exceptions
        }
//Parent CANNOT be placed before a child!
        System.out.println("-----------------------------");


        try {
            Thread.sleep(2000);
            System.out.println("Try");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String[] arr = {"a", "s", "d", "f"};
        try {
            arr[10] = "g"; //ArrayIndexOutIfBound
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("Illegal Argument Exception");
        }catch (NoSuchElementException e) {
            System.out.println("NoSuchElementException");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException");
        }catch (IndexOutOfBoundsException e){
            System.out.println("IndexOutOfBoundsException");
        }catch (RuntimeException e){
            System.out.println("RuntimeException");
        }
        //MultiCatch block is only for unchecked exceptions!



    }
}
