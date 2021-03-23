package day53_Collection;

import java.util.*;

public class IteratorPractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 1, 2, 3, 4));

        Iterator<Integer> it = list.iterator();//preferred loop is while
        while (it.hasNext()) {
            if (it.next() < 5) {
                it.remove();
            }
        }
        System.out.println(list);

        Set<Double> set = new LinkedHashSet<>(Arrays.asList(1.0,3.2,4.5,3.8,6.5));
        //set.removeIf(p->p<4.5);

        for (Iterator<Double> i = set.iterator();i.hasNext(); ){
            if(i.next()<4.5){
                i.remove();
            }
        }
        System.out.println(set);


        System.out.println("-----------------------------------------");

        List<String > names = new ArrayList<>(Arrays.asList("Daniel", "Steph", "Dasha", "Sobirjon"));
        //names.removeIf(p->p.equals("Daniel"));

        Iterator<String > n = names.iterator();
        while (n.hasNext()){
            if(n.next().equals("Daniel")){
                n.remove();
            }
        }

        System.out.println(names);



    }
}
