package day18_String;

public class StringMethods4 {
    public static void main(String[] args) {
        //isEmpty, equals, equalsIgnoreCase, contains, startsWith, endsWith

        String str = "Hello Everyone";
        System.out.println(str.isEmpty());
        String str2 = "";
        System.out.println(str2.isEmpty());

        String sentence = "I like to learn Java";
        System.out.println(sentence.contains("C#"));
        System.out.println(sentence.contains("Java"));

        String webAddress = "www.amazon.com";
        boolean valid = webAddress.startsWith("www")&& webAddress.endsWith(".com");
        System.out.println(valid);
    }
}
