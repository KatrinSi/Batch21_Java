package day23_NestedLoop;

public class CatDog {
    public static void main(String[] args) {


        String sentence = "dog dog Dog Dog cat Cat cAT CAt";
        String temp = sentence.toLowerCase();
        int countDog = 0;
        int countCat = 0;

        while (temp.contains("dog")){
            temp = temp.replaceFirst("dog", "");
            countDog++;
        }
        while (temp.contains("cat")){
            temp = temp.replaceFirst("cat", "");
            countCat++;
        }

        System.out.println("Num of dogs: "+countDog);
        System.out.println("Num of cats: "+countCat);
        System.out.println(countCat==countDog);
    }
}
