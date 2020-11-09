package OfficeHours.Practice_11_04_2020;

public class Task4_DuplicatedStringInArray {
    public static void main(String[] args) {

        String[] str = {"java", "python", "java", "c++", "python"};
        String result = "";

        for (int j = 0; j < str.length; j++) {
            int count = 0;
            String word = str[j];

            for (int i = 0; i < str.length; i++) {
                String eachWord = str[i];
                if (eachWord.equals(word)) {
                    count++;
                }
            }
            if (count > 1&&!result.contains(word)) {
                result += word+" ";
            }
        }
        System.out.println(result);
    }
}
