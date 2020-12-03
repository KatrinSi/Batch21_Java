package Replit;

public class Replit_179 {
    public static void main(String[] args) {
        //test your code
        System.out.println(uniqueChars("wooden-spoon"));
    }

    public static String uniqueChars(String str) {
        //TODO: write your below
        String[] arr = str.split("");

        String unique = "";

        for (String each:arr){
            if (!unique.contains(each)){
                unique += each;
            }
        }
        return unique;
    }
}

/*
uniqueChars is a method that you will code now, should be able to accept
any string in the world and return unique characters from the parameter.
Examples:
uniqueChars("java") ==> "jav"
uniqueChars("mama") ==> "ma"
uniqueChars("spoon") ==> "spon"
 */