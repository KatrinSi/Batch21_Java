package day17_String;

public class String_Length {
    public static void main(String[] args) {
        String s = "gygfhvhdsughoushgbehsk jkn";
        String s2 = "word";

        System.out.println(s.length());
        System.out.println(s2.length());

        int len = s.length();
        System.out.println(len == s2.length());//false 26!=4

        System.out.println(len == s.length());



    }
}
