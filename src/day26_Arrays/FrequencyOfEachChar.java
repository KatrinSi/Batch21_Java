package day26_Arrays;

public class FrequencyOfEachChar {
    public static void main(String[] args) {

        String str = "aaabbc";
        //step 1: remove duplicates
        String nonDuplicated = ""; //abc

        for (int i = 0; i < str.length(); i++) {
            String eachChar = "" + str.charAt(i);// "aaabbc"

            if (!nonDuplicated.contains(eachChar)) {
                nonDuplicated += eachChar;// abc
            }
        }
        String result = ""; // a3b2c1
        // step 2: find the frequency of each char from the original string str

        for (int j = 0; j < str.length(); j++){

            char ch = nonDuplicated.charAt(j);//abc
            int count = 0; //contain the frequency of the char ch

            for (int i = 0; i < str.length(); i++){
                char eachChar = str.charAt(i);// "aaabbc"
                if (eachChar == ch){
                    count++;
                }
            }
            result +=""+ch +count;
        }
        System.out.println(result);

    }
}

/*
write a program that can return the frequency of characters from a String
            Ex:
                str = "ababaac";
                output:
                    a3b2c1

 */