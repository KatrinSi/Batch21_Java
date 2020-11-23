package Replit;

public class Replit_150 {
    public static void main(String[] args) {

        /*for (int i = 1; i <= 5; i++){
            System.out.println("*");//length
        }
        for (int i = 1; i <= 5; i++) {

            if (i == 1 || i == 5) {
                for (int j = 1; j <= 3; j++) {
                    System.out.print("*");//width
                }
            } else {
                for (int j = 1; j <= 3; j++) {
                    System.out.print(" ");//width
                }

            }
            System.out.println("*");//length
        }

         */

        String star = "*";
        String str2 = "/";

        for (int j = 1; j <= 5; j++) {//столбец

            for (int i = 1; i <= 5; i++) {//строка
                    System.out.print(star);//*****
                if (i == 2 || i == 3 || i ==4){
                    System.out.print(str2);


                }
            }


        }

    }

}



/*
Create a method printHollowRect that prints a 5 on 5 hollow rectangle:

*****
*   *
*   *
*   *
*****

hint:you will need to use two nested for loops for that,
and an if that checks if its the last or first iteration
of the loop (so you will know whet to print "*" or " ")
 */