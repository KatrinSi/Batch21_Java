package Replit;

public class Replit_191 {
    public static String reverse(String input)
    {
        String reversed = "";

        String[] str1 = input.split("");

        for (int i = str1.length-1; i >= 0; i--){
            reversed+= str1[i];
        }

        return reversed;
    }

    public static void main (String[] args){
        String str = "oof";
    }
}

