package day19_ForLoop;

public class OddNumbersLoop {
    public static void main(String[] args) {

        //odd: 1 3 5 7 9
        for (int i = 1; i <= 100; i += 2) {
            System.out.print(i + " ");

        }
        System.out.println();


        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();


            //even: 0 2 4 6 8 10
        for (int i = 0; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();


        for (int i = 0; i <=100; i++ ){
            if(i%2 == 0){
                System.out.print(i+" ");
            }
        }
    }
}

