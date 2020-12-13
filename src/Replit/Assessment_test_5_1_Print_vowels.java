package Replit;

public class Assessment_test_5_1_Print_vowels {
    public static void main(String[] args) {

        String word = "song lyrics galore";
        //write your code below
        String result = "";

        for (int i = 0; i < word.length(); i++){
            if (word.charAt(i) == 'a'|| word.charAt(i)== 'e'||word.charAt(i) == 'i' ||  word.charAt(i)== 'o' || word.charAt(i)=='u'){
                result+=word.charAt(i);
            }
        }

        System.out.println(result);
    }
}
