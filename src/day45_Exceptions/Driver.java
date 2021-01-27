package day45_Exceptions;

import java.util.Locale;

public class Driver {
    public static void main(String[] args) {

        String browserName = "Cybertek";
        switch (browserName.toLowerCase()){
            case "chrome":
                System.out.println("Chrome is selected");
                break;
            case "firefox":
                System.out.println("Firefox is selected");
                break;
            case "safari":
                System.out.println("Safari is selected");
                break;
            case "opera":
                System.out.println("Opera is selected");
                break;
            default:
                throw new RuntimeException("Invalid Browser name");
        }

        System.out.println("-------------------");

        throw new ClassCastException("Invalid class");

    }
}
