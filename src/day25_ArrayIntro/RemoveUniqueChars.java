package day25_ArrayIntro;

public class RemoveUniqueChars {
    public static void main(String[] args) {

        String str = "abcabd"; //abab
        String result = "";

        for(int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); //first  char  - 'a'
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }
            if (count > 1&& !result.contains(""+ch)) {
                result += ch;
            }
        }
        System.out.println("result = "+result);

    }
}
