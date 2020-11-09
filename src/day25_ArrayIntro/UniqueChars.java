package day25_ArrayIntro;

public class UniqueChars {
    public static void main(String[] args) {

        String str = "abcababe";                                                            //1
        String result = "";                                                                 //2

        for (int j = 0; j < str.length(); j++) {                                            //11
            char ch = str.charAt(j); // represents each char from the string str            //3
            int count = 0;                                                                  //4

            for (int i = 0; i < str.length(); i++) { // i is index of str                   //5
                char eachChar = str.charAt(i);                                              //6
                if (eachChar == ch) {                                                       //7
                    count++;                                                                //8
                }
            }// count the frequency of the each char

            if (count == 1) {                                                               //9
                result += ch;                                                               //10
            }
        }
        System.out.println(result);
    }
}
