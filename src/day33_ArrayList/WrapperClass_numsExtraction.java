package day33_ArrayList;

public class WrapperClass_numsExtraction {
    public static void main(String[] args) {


        String str = "a1b2c3";

        int sum = 0;

        for (char each : str.toCharArray()) {
            if (Character.isDigit(each)) {
                sum += Integer.parseInt(each+"");
            }

        }

        System.out.println(sum);


        String password = "Password#7";
        String upperLetters = "";
        String lowerLetters = "";
        String digits = "";
        String specialChars = "";

        for (char each:password.toCharArray()){
            if (Character.isUpperCase(each)){
                upperLetters += each;
            }else if (Character.isLowerCase(each)){
                lowerLetters += each;
            }else if (Character.isDigit(each)){
                digits += each;
            }else {
                specialChars+= each;
            }
        }

        boolean isValid = password.length() >= 8 &&  upperLetters.length()>0&&lowerLetters.length()>0&&digits.length()>0&&specialChars.length()>0;


        System.out.println("upper" +upperLetters);
        System.out.println("lower"+lowerLetters);
        System.out.println("digits"+digits);
        System.out.println("chars"+specialChars);
        System.out.println(isValid);

    }

}


/*
3. write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)
                input: "Today's date is 04/27/2020"
                output: 17
                    (0+4+2+7+2+0+2+0=17)
 */