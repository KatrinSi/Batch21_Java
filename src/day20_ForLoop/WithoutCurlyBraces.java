package day20_ForLoop;

public class WithoutCurlyBraces {
    public static void main(String[] args) {

       for(int i = 1; i <=5; i++) {
           System.out.println("Hello");
           System.out.println("How are you?");

       }
        System.out.println("=========================");

        for(int i = 1; i <=5; i++) //without curly braces ONLY one statement might be used
            System.out.println("Hello");

    }
}
