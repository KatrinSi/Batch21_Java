package day29_Methods;

public class MethodsWithoutParameters2 {
    public static void main(String[] args) {

        printOddNums1to100();
        System.out.println("Hello world!");
        printOddNums1to100();
        printEvenNums1to100();


    }

    public static void printOddNums1to100() {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }

    public static void printEvenNums1to100(){
        for (int i = 1; i <= 100; i++){
            if ( i%2 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }



}
