package day23_NestedLoop;

public class NestedLoopRectangle {
    public static void main(String[] args) {


       for(int j = 1; j <= 8; j++) { //1, 2, 3, 4, 5, 6, 7, 8
           System.out.print("\t\t\t\t");
           for (int i = 1; i <= j; i++) { // i = 1, 2, 3, 4, 5, 6, 7, 8
               System.out.print("*");

           }
           System.out.println();
       }
        for(int j = 1; j <= 10; j++) { //1, 2, 3, 4, 5, 6, 7, 8
            System.out.print("\t\t\t\t");
            for (int i = 1; i <= j; i++) { // i = 1, 2, 3, 4, 5, 6, 7, 8
                System.out.print("* ");

            }
            System.out.println();
        }

        System.out.println("=============================================");

        for(int j = 1; j <= 10; j++) { //1, 2, 3, 4, 5, 6, 7, 8
            System.out.print("\t\t\t\t");

            for (int i = 1; i <= j; i++) { // i = *, **, ***, ****, *****, ******, *******, ********
                System.out.print("* ");

            }
            System.out.println();
        }

    }
}
