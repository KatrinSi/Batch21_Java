package OfficeHours.Practice_11_27_2020;

public class RemoveDigits {
    public static void main(String[] args) {

        String str = "qqddk%@B^5F%*338%479";

        String result = "";

        for (int i = 0; i < str.length();i++){
            if (!Character.isDigit(str.charAt(i))){
                result+=str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
