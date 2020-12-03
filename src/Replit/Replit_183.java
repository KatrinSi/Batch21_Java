package Replit;

public class Replit_183 {
    public static void main(String[] args) {
        limit("bla bla", 3);
    }

    public static String limit(String text, int maxLength)
    {

        String result = text.substring(0,maxLength);
        System.out.println(result);
        return result;
    }
}
