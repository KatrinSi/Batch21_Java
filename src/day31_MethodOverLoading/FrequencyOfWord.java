package day31_MethodOverLoading;


import Library.StringUtility;

public class FrequencyOfWord {
    public static void main(String[] args) {
        String sentence = "Java java java python python";
        String word = "java";
        System.out.println(frequencyOfWord(sentence, word));

        System.out.println("==============================");

        String sentence1 = "dog cat cat cat dog dog dog dog";
        int cats = StringUtility.frequencyOfWord(sentence1, "cat");
        System.out.println("cats: "+cats);
        int dogs = StringUtility.frequencyOfWord(sentence1, "dog");
        System.out.println("dogs:"+dogs);
        System.out.println(cats == dogs);

    }
    public static int frequencyOfWord (String sentence, String word){
        int frequency = 0;
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();

        while (sentence.contains(word)){
            sentence = sentence.replaceFirst(word,"");
            frequency++;
        }

        return frequency;
    }

}

/*
Task1:
        1.  write a return method called frequencyOfWord that accepts two parameters: string str and String word, then returns the frequency of word
                Ex:
                    str = "Java java java python python"
                    word = "java";
                    frequency(str, word) ==>  3

 */