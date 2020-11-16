package day30_ReturnMethods;

public class UniqueElements {
    public static void main(String[] args) {
        String str = "aaaeccccg";
        String result = unique(str);
        System.out.println(result);
    }

    //                             "aaabc", 'a' ==> 3
    public static int frequency(String str, char ch) {
        int count = 0;
        for (char each : str.toCharArray()) {//[a,a,a,b,c]
            if (each == ch) {
                count++;
            }
        }

        return count;
    }

    public static String unique(String str) {
        String unique = "";
        for (char each : str.toCharArray()) {
            if (frequency(str, each) == 1) {
                unique += each;
            }
        }
        return unique;

    }


    //frequencyOfChar("aaabbccccd") ==> "a3b2c4d1"



}
