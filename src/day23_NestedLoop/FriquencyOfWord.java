package day23_NestedLoop;

public class FriquencyOfWord {
    public static void main(String[] args) {
        String sentence = "Java is a programming language, I like to learn Java";
        String word = "Java";
        int count = 0;

        while (sentence.contains(word)){
            sentence = sentence.replaceFirst(word, "");
            count++;
        }
        System.out.println(count);

    }
}

/*
write a program that can return the frequncy of the a word from the sentence
        Ex:
            sentence = "Java is a programming language, I like to learn Java";
            word = "Java";
            output:
                2

 */