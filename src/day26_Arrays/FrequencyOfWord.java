package day26_Arrays;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String str = "I love java, java is a cool programming language and java is more useful than javascript";

        String[] arr = str.split(" ");
        int countJava = 0;
        int countPython = 0;

        for (int i = 0; i < arr.length; i++) {
            String eachWord = arr[i];
            if (arr[i].toLowerCase().contains("java")) {
                countJava++;
            }
            if (arr[i].toLowerCase().contains("Python")) {
                countPython++;
            }
        }
        System.out.println("java: " + countJava);
        System.out.println("python: " + countPython);
    }
}
