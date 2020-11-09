package day26_Arrays;

public class UniqueWords {
    public static void main(String[] args) {

        String[] words = {"C#", "Java", "C#", "Python", "Python", "Ruby", "Swift", "C++", "Swift"};
        //                  0       1     2     3           4       5          6    7       8

        String result = ""; // Java Ruby C++

        for (int j = 0; j < words.length; j++) {
            String word = words[j]; // each word in the Array words
            int count = 0; // 1 +1
            for (int i = 0; i < words.length; i++) { // i represents the index of the array
                String eachWord = words[i]; // eachWord represents each word in the string words
                if (word.equals(eachWord)) {// when the word variable appears in eachWord we add +1 to count
                    count++;
                }
            } // this loop counts the frequency of word
            if (count == 1) { // if the frequency equals 1, the word is unique
                result += word+" ";
            }
        }

        System.out.println(result);
    }
}


/*
print the unique words from an array of String
            String[] words = {"C#", "Java", "C#", "Python", "Python", "Ruby", "Swift", "C++", "Swift"}
            output:
                Java Ruby C++
 */