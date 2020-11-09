package day22_JavaRecap;

public class StringPractice3 {
    public static void main(String[] args) {

        String sentence = "Capital of Canada is Washington";

        System.out.println(sentence.replace("Canada", "The USA"));

        String s = "Cybertek School is in Boston, Cybertek Campus is in McLean";
        System.out.println(s.replaceFirst("Cybertek", "MIT")); //replaces only first occured Cybertek

        String p = "I like Java and Java Java Java Java Java";

        p = p.replace("Java", "").replace("like", "like Java");
        p =p.replaceFirst("Java", "java");

        System.out.println(p);

        //trim() removes white spaces only, cannot trim between words inside of the sentence


        String s2 = "I like to Learn Java";
        System.out.println("Contains Java "+ s2.contains("Java"));
//                          "Contains Java " true

        System.out.println(s2.toLowerCase().contains("java"));

        String email = "Java_Masters@java.com";

        if (email.endsWith("gmail") || email.endsWith("yahoo") || email.endsWith("hotmail") || email.endsWith("outlook")){
            System.out.println("Email is valid");
        }else{
            System.out.println("Email is not valid");
        }


    }
}
