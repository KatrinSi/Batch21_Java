package day33_ArrayList;

import java.net.Inet4Address;
import java.util.ArrayList;

public class ListPractice4 {
    public static void main(String[] args) {

        //indexOf
        //lastIndexOf

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.indexOf(3));

        //contains
        System.out.println(list.contains(6));
        System.out.println(list.contains(5));

        System.out.println("==============================");

        ArrayList<Character> chars = new ArrayList<>();

        chars.add('A');
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('D');
        chars.add('D');

        ArrayList<Character> nonDupl = new ArrayList<>();

        for(char each:chars){
            if(nonDupl.contains(each)){
                continue;
            }
            nonDupl.add(each);
        }
        System.out.println(nonDupl);

        System.out.println("===============================");
        //equals()
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);

        System.out.println(list2.equals(list3));

        //isEmpty()
        System.out.println(list2.isEmpty());//false
        list2.clear();
        System.out.println(list2.isEmpty());//true

    }
}
