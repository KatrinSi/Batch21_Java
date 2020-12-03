package day33_ArrayList;

public class PasswordValidation {
    public static void main(String[] args) {
        String password = "Password#7";

        boolean atLeast8char = password.length() >= 8;
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean digits = false;
        boolean chars = false;//_.!$

        for (int i = 0; i < password.length(); i++) {

            char each = password.charAt(i);
            if (Character.isUpperCase(each)) {
                upperCase = true;
            } else if (Character.isLowerCase(each)) {
                lowerCase = true;
            } else if (Character.isDigit(each)) {
                digits = true;
            } else {
                chars = true;
            }

        }
        boolean isValid = atLeast8char && upperCase && lowerCase && digits && chars;
        System.out.println(isValid);

    }
}
