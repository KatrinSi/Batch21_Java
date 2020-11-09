package Replit;

public class Replit_LoopDiv_3 {
    public static void main(String[] args) {
        String result = "";

        for (int i = 1; i <= 20; i++) { //i = 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
            if(i%3 == 0){
                result += i+" ";
            }

        }
        System.out.println("Result = "+result);

    }

}

    /*
    Write for and while loops so that they print those numbers between 1 and 20 and divisible by 3.
Expected Output:  3 6 9 12 15 18
     */
