package day18_String;

public class StringMethods3 {
    public static void main(String[] args) {
        String sentence = "Java is fun, Java is cool";
        sentence = sentence.replace("Java", "Python");//"
        System.out.println(sentence);

        String email = "katrinsi@yahoo.com";
        email = email.replace("yahoo", "me");
        System.out.println(email);


        String essay = "Batch 21 is cool, Batch 20 is best, Batch 21 is funny";
        essay = essay.replace("20", "21");
        System.out.println(essay);

        String s = "I like to learn C#, C# is very cool";
        //System.out.println(s.replace("C#", "Java"));
        System.out.println(s.replaceFirst("C#", "Java"));

        String cat = "Cat is frendly, Cat is cute";
        cat = cat.replaceFirst("Cat", "Dog");
        System.out.println(cat);

        String java = "I like to learn Java, because Java is very smart language and also Java is very useful";
                                                    //Python                            //C#
        java = java.replaceFirst("Java is", "Python is").replaceFirst("Java ", "C# ");
        System.out.println(java);

        System.out.println("==========================");

        String a = "Yesterday was Monday, Today is Monday, Tomorrow is gonna be Monday";
        a = a.replaceFirst("Monday", "Sunday").replaceFirst("be Monday", "be Tuesday");
        System.out.println(a);

        String emailAddress = "katrinsi@me.com";
        int beginningInd = emailAddress.indexOf("@")+1;
        int endingInd = emailAddress.lastIndexOf(".com");
        String domain = emailAddress.substring(beginningInd, endingInd);
        System.out.println(domain);

        System.out.println("==================================");

        String p = "I like to watch movie and read books";
        String word2 = p.substring( p.indexOf("m"), p.indexOf(" a"));
        System.out.println(word2);
        System.out.println("===================================");

        String y = "I like to learn Java, Java is cool, I like to watch Jumanji ";
        int n1 = y.indexOf("Java ")+2;
        System.out.println(n1);

        int n2 = y.lastIndexOf("J");
        System.out.println(n2);

        String name = "My name is Muhtar";
        String result = name.substring(name.lastIndexOf("M"));
        System.out.println(result);


    }

}
