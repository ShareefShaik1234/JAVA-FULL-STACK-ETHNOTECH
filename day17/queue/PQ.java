package day17.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ {
    public static void main(String[] args) {
        //PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(10);
        pq.offer(50);
        pq.offer(12);
        pq.offer(9);
        pq.offer(100);

        System.out.println(pq);

//        while (!pq.isEmpty()) {
//            System.out.print(pq.poll()+" ");
//        }


    }
}
