package day44_Inheritance;

import day14_Switch_Recap.Quiz;

public class QuizConstructor {

    public QuizConstructor() {
        System.out.println("Developer");
    }

    public void QuizConstructor(int a) {
        System.out.println("SDET");
    }

    public static void main(String[] args) {
        QuizConstructor obj = new QuizConstructor();
    }

}
