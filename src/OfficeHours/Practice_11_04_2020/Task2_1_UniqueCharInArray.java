package OfficeHours.Practice_11_04_2020;

public class Task2_1_UniqueCharInArray {
    public static void main(String[] args) {

        char[] letters = new char[]{'r', 'r', 'a', 'b', 'b', 'c', 'e'};
        String result = " ";

        for (int j = 0; j < letters.length; j++) {
            char ch = letters[j];
            int count = 0;

            for (int i = 0; i < letters.length; i++) {
                char eachChar = letters[i];

                if (eachChar == ch) {
                    count++;
                }
            }
            if (count == 1) {
                result += ch+" ";
            }
        }
        System.out.println(result);
    }
}
