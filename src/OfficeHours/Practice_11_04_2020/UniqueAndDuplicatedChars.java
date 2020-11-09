package OfficeHours.Practice_11_04_2020;

import java.util.Scanner;

public class UniqueAndDuplicatedChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = scan.next(); //b and d are unique

        String unique = "";// contains the expected result
        String duplicated = "";

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int frequency = 0;
            for (int i = 0; i < str.length(); i++) {
                if (ch == str.charAt(i)) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                unique += ch;
            }
            if (frequency>1){// && !duplicated.contains(""+ch)){
                duplicated += ch;
            }
        }
        System.out.println("unique chars: "+ unique);
        System.out.println("duplicated chars: "+duplicated);

    }
}
