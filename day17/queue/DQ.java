package day17.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DQ {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(5);
        deque.addFirst(4);
        deque.addFirst(3);
        deque.addFirst(2);
        deque.addFirst(1);
        System.out.println(deque);
        deque.remove(3);
        System.out.println(deque);

        deque.pollFirst();
        System.out.println(deque);
        deque.pollLast();
        System.out.println(deque);



    }
}
