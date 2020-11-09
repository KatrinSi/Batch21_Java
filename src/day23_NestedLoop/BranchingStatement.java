package day23_NestedLoop;

import java.util.Scanner;

public class BranchingStatement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two nums");
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (b == 0){
            System.err.println("Invalid number");
            System.exit(0);  //forcefully terminate the program (num/0 cannot be executed!!!)
        }
        System.out.println(a/b);

    }
}
