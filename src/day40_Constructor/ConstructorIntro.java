package day40_Constructor;

public class ConstructorIntro {

    public ConstructorIntro(){

    }

    int a = 10;

    public static void main(String[] args) {
        System.out.println("Hello");
        //System.out.println(a);//static doesn't accept instance!


        int num = new ConstructorIntro().a;

    }

}
