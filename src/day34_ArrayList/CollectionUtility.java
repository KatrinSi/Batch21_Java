package day34_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {
        ArrayList<Character> chars = new ArrayList<>();

        chars.add('X');
        chars.add('A');
        chars.add('D');
        chars.add('Z');
        chars.add('H');
        System.out.println(chars);

        Collections.sort(chars);
        System.out.println(chars);

        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(70);
        scores.add(67);
        scores.add(79);
        scores.add(89);
        scores.add(65);
        scores.add(70);

        Collections.sort(scores);

        int min = scores.get(0);
        int max = scores.get(scores.size() - 1);

        System.out.println(scores);
        System.out.println("min: " + min);
        System.out.println("max: " + max);


        Collections.swap(scores, 0, scores.size() - 1);
        System.out.println(scores);

        Collections.swap(scores, scores.indexOf(67), scores.lastIndexOf(70));
        System.out.println(scores);

        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('D');
        list.add('B');
        list.add('F');
        list.add('T');
        list.add('A');
        list.add('A');

        /*for (int i =0; i < list.size(); i++){
            char each = list.get(i);
            if (each == 'A'){
                list.set(i, 'E');
            }
        }
         */

        Collections.replaceAll(list, 'A', 'E');

        int frequrencyOfE = Collections.frequency(list, 'E');
        System.out.println(frequrencyOfE);


        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(11);
        nums.add(15);
        nums.add(13);
        nums.add(12);
        System.out.println(Collections.max(nums));
        System.out.println(Collections.min(nums));



    }
}
