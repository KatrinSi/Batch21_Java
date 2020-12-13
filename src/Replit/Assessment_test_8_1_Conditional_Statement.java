package Replit;

public class Assessment_test_8_1_Conditional_Statement {
    public static void main(String[] args) {

        String word = "";

        System.out.println((word.endsWith("ife")) ? "-ives" :
                (word.endsWith("ey")) ? "-eys" :
                        (word.endsWith("y")) ? "-ies" : "s");


        String result = "";
        if (word.endsWith("ife")) {
            result = "-ives";
        } else if (word.endsWith("ey")) {
            result = "-eys";
        } else if (word.endsWith("y")) {
            result = "-ies";
        } else {
            result = "s";

            System.out.println(result);

        }
    }
}
