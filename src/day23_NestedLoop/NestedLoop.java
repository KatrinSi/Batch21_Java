package day23_NestedLoop;

public class NestedLoop {
    public static void main(String[] args) {

        for(int j = 1; j <=5; j++){
            for (int i = 1; i <=10; i++) {
                System.out.print(i + " ");
            }
            System.out.println();

        }

        for(int b = 1; b <= 5; b++) {
            for (int a = 1; a <= 7; a++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
