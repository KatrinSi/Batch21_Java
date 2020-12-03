package day32_LocalDate_WrapperClass;

public class Task {
    public static void main(String[] args) {
        String str = "Cyber1234@&*(";

        String digits = "";
        String letters = "";
        String chars = "";

        for (char each : str.toCharArray()) {
            if (Character.isDigit(each)) {
                digits += each;
            } else if (Character.isLetter(each)) {
                letters += each;
            } else {
                chars += each;
            }
        }
        System.out.println("Digits: "+digits);
        System.out.println("Letters: "+letters);
        System.out.println("Special characters: "+chars);

    }
}

/*
Password validation
    1. 8 character at least
    2. there must be a digit            (isUpper   isLowercase)
    3. there must be a letter (at least one upper case & one lower case)
    4. there must be special character
 */
