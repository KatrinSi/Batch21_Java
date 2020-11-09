package day13_SwitchStatement;

public class WarmUpTask1 {
    public static void main(String[] args) {

        int num = 5;
        String word = " ";

        if (num >= 1 && num <= 9) {

            if (num == 1) {
                word = "One";
            }else if (num == 2) {
                word = "Two";
            }else if (num == 3) {
                word = "Three";
            }else if (num == 4) {
                word = "Four";
            }else if (num == 5) {
                word = "Five";
            }else if (num == 6) {
                word = "Six";
            }else if (num == 7) {
                word = "Seven";
            }else if (num == 8) {
                word = "Eight";
            }else{
                word = "Nine";
            }

        }else{
            word = "Invalid";
        }

        System.out.println(word);



    }
}
/*
write a java program that can convert numbers between 0 ~ 9 to words,
if the number is greater than 9 or less than zero, out put should be "Invalid".

	 		Note: MUST USE NESTED IF
 */