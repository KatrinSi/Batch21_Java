package OfficeHours.Practice_10_28_2020;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String sentence = "Cat Cat Cat Cat Cat Cat Cat";
        String word = "Cat";

        int count=0;

        while (sentence.contains("Cat")){
            sentence = sentence.replaceFirst(word,"");
            count++;

        }
        System.out.println(count);



    }
}
