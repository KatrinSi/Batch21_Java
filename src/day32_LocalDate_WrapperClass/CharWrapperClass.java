package day32_LocalDate_WrapperClass;

public class CharWrapperClass {
    public static void main(String[] args) {

        char ch = 'W';
        System.out.println(Character.isDigit(ch));
        System.out.println(Character.isLetter(ch));

        String str = "a1b2c3%^&*";
        String digits = "";
        String letters = "";
        String specialChar = "";

        for (char each:str.toCharArray()){
            if (Character.isDigit(each)){
                digits+= each;
            }else if(Character.isLetter(each)){
            letters += each;
            }else{
                specialChar+= each;
            }

        }


        System.out.println("letters: "+letters);
        System.out.println("special chars: "+specialChar);
        System.out.println("digits: "+digits);
    }
}
