package day07_UnaryOperators;

public class OperatorPrecedence {
    public static void main(String[] args) {
        int x = 2 + 3 * 2 / 1;
        //3*2=6
        //6/1=6
        //2+6=8

        int y = 78 / 2 * 2 + 3 - 5 % 5;
        // 78/2 = 39
        // 39 * 2 = 78
        // 5 % 5 = 0
        // 78 + 3 = 81
        // 81 - 0 = 81
    }
}
