package Replit;

import java.util.Scanner;

public class Replit_64 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String word = scan.next();
        int i = word.length();//number


        if (word.length() >= 3 && word.length() % 2 != 0) {
            System.out.println(word.charAt(word.length()/2));
        }else if(word.length() == 1){
            System.out.println((word+word+word));
        }else if(word.length() >= 4 && word.length() % 2 == 0) {
            //int middle = word.length() / 2;
            //int indexBefore = middle - 1;
            //int indexAfter = middle + 1;
            System.out.println(word.substring(word.length()/2-1,word.length()/2+1));
        }else{
            System.out.println(word+word);
        }


        /*int num = word.length()/2;
        System.out.println(num);
        System.out.println(word.substring(0,1));
*/

        }

    }



/*
if ind %2 != 0
You have a word, do the following:

When word has odd number of characters and:
            - 3 or more characters, print middle letter
      oak ==> a
      javav ==> v
             - Single character, print that character 3 times
      # ==> ###
      q ==> qqq

When word has even number of characters and:
           - 4 or more characters, print middle 2
     java ==> av
     apples ==> pl
     #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
      @@ ==>@@@@
      $$ ==>$$$$
      hi ==> hihi

 */