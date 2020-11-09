package day18_String;

public class SubstringMethod {
    public static void main(String[] args) {

        String str = "I love Java Programming";

        str = str.substring(7,11);
        System.out.println(str);

        System.out.println("=================================");
        String str1 = "Today is Monday";

        str1 = str1.substring(9,15);
        System.out.println(str1);

        String email = "katrinsi@me.com";
        String domain = email.substring(9,11);
        System.out.println(domain);
        System.out.println(email.charAt(1));



    }
}
