package day33_ArrayList;

import java.util.ArrayList;

public class ListMethods {

    public static void main(String[] args) {


        ArrayList<Character> list1 = new ArrayList<>();
        list1.add('A');
        list1.add('B');
        list1.add('C');
        list1.add('D');
        list1.add('E');

        //remove()int

        list1.remove(2);
        list1.remove(2);

        System.out.println(list1);

        //remove object
        System.out.println("============================");
        ArrayList<Character> list2 = new ArrayList<>();
        list2.add('A');
        list2.add('B');
        list2.add('C');
        list2.add('D');
        list2.add('E');

        Character ch = 'C';
        //list2.remove(ch);
        list2.remove(Character.valueOf('C'));
        System.out.println(list2);
    }
}
