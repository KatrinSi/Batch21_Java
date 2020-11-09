package day17_String;

public class String_Memory {
    public static void main(String[] args) {

        String strOne = "java";
        String strTwo = "java";

        String strThree = new String("java");
        String strFour = new String("java");

        System.out.println(strOne == strTwo);//true
        System.out.println(strOne == strThree);//false
        System.out.println(strThree == strFour);//false





    }
}
