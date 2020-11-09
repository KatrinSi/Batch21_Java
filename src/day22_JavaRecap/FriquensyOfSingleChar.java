package day22_JavaRecap;

public class FriquensyOfSingleChar {


    public static void main(String[] args) {

        String text = "ajnjioaanjjnlaaanjknl";

           int numOfLetter = 0;

            while(text.contains("a")){
                numOfLetter++;

                text = text.replaceFirst("a","");
            }
        System.out.println(numOfLetter);

        }


    }




