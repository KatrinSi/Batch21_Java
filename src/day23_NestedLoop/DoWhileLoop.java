package day23_NestedLoop;

public class DoWhileLoop {
    public static void main(String[] args) {

        boolean condition = false;

        while(condition){           //think first
            System.out.println("Hello");
        }
        System.out.println("========================");

        do{                         //do first, think later
            System.out.println("Hello");
        }while (condition);

    }
}
