package day29_Methods;

public class MethodsWithoutParameters {
    public static void main(String[] args) {

        printHello5Times();
        System.out.println("KatrinSi");
        printHello5Times();
        System.out.println("Cybertek");
        printHello5Times();
        System.out.print("Odd nums: ");
        MethodsWithoutParameters2.printOddNums1to100();//here we call the method from another class "MethodsWithoutParameters2"
        System.out.print("Even nums: ");
        MethodsWithoutParameters2.printEvenNums1to100();//here we call the method from another class "MethodsWithoutParameters2"

    }

    //AccessModifier  specifier   returnTYPE   MethodName       (Parameter){

        public         static      void       printHello5Times      () {

        for (int i = 1; i <= 5; i++) {
            System.out.print("Hello! ");
        }
            System.out.println();

    }


}
