package day30_ReturnMethods;

public class WarmUpTask4_WithoutDuplicates {
    public static void main(String[] args) {
        removeDuplicates("aabccb");
        removeDuplicates("hujhnjfdnjhsdhshjshj");
    }

    //"aabccb"
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
