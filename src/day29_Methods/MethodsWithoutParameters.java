package day29_Methods;

public class MethodsWithoutParameters {
    public static void main(String[] args) {

        printHello5Times();
        System.out.println("KatrinSi");
        printHello5Times();
        System.out.println("Cybertek");
        printHello5Times();

    }

    //AccessModifier  specifier   returnTYPE   MethodName       (Parameter){

        public         static      void       printHello5Times      () {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
        }

    }


}
