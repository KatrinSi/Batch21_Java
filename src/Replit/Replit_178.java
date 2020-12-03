package Replit;

public class Replit_178 {
    public static void main(String[] args) {

        String s1 = "135";
        String s2 = "2468910";
        System.out.println(mergeStrings(s1, s2));
    }

    public static String mergeStrings(String one, String two) {

        String merged = "";
        String biggerWord = "";
        String smallerWord = "";
        if (one.length() > two.length()) {
            biggerWord = one;
            smallerWord = two;
        } else {
            biggerWord = two;
            smallerWord = one;
        }

        for (int i = 0; i < smallerWord.length(); i++) {
            merged += one.substring(i, i + 1) + two.substring(i, i + 1);
        }
        for (int i = smallerWord.length(); i < biggerWord.length(); i++) {
            merged += biggerWord.charAt(i);
        }
        return merged;
    }
}
