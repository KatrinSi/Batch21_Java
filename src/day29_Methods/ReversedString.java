package day29_Methods;

public class ReversedString {

    //"Cybertek" ==> "ketrebyC"
    public static void main(String[] args) {
        reverse("Cybertek School");
        System.out.println("==============================");

        String[] names = {"Mama", "Kate", "Tima", "Lenny"};
        for (String each:names){
            reverse(each);
        }
    }

    public static void reverse(String word) {
        String result = "";

        for (int i = word.length()-1; i  >= 0; i--){
          result +=  word.charAt(i);
        }
        System.out.println(result);
    }

}
