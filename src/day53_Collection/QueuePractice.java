package day53_Collection;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args) {

        Queue<Integer> arrayQueue = new ArrayDeque<>(Arrays.asList(23,34,2,12,56,3,44));
        System.out.println(arrayQueue);
        int i = arrayQueue.poll();
        System.out.println(i);
        System.out.println(arrayQueue);

    }
}
