package OfficeHours.Practice_01_06_2021;

import java.util.NoSuchElementException;

public class ExceptionHandling {
    public static void test1() {
        try {
            throw new NoSuchElementException("Element not found");
        }catch (NoSuchElementException e){

        }


    }
}
