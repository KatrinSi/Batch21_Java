package OfficeHours.Practice_11_27_2020;

public class CharacterPractice {
    public static void main(String[] args) {

        int max = Character.MAX_VALUE;
        int count = 0;

        for (int i = 1; i < max; i++) {
            char each = (char) i;
            if (Character.isLetter(each)) {
                count++;

            }
        }
        System.out.print(count + " ");
    }

}

