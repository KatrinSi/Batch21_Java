package OfficeHours.Practice_11_27_2020;

public class RemoveSpecialChars {
    public static void main(String[] args) {

        String str = "ab!cvje#$BN^&";

        String result = "";

        for(char each : str.toCharArray()) {
            if (Character.isLetterOrDigit(each)){
                result+=each;
            }
        }

        System.out.println(result);

    }
}
