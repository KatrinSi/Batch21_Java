package Library;

public class StringUtility {

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

    public static String reverseStr2(String str){

        String result = "";

        for (int i = str.length()-1; i >=0; i--){
            result +=str.charAt(i);
        }

        System.out.println(result);
        return result;
    }

    public static void removeDuplicates(String str) {
        String result = "";//abc
/*
        for (String each : str.split("")) {// each: ["a","a","b","c","c","b"]
            if (!result.contains(each)) {
                result += each;
            }
        }
        System.out.println(result);

 */
        for (int i = 0; i < str.length(); i++) {// each: ['a,'a','b','c','c','b']

            if (!result.contains("" + str.charAt(i))) {// each: ['a,'a','b','c','c','b']
                result += str.charAt(i);
            }

        }

    }




}
