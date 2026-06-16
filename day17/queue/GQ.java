package day17.queue;

import java.util.LinkedList;
import java.util.Queue;

public class GQ {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();

        //Insertion
        q.add(1);
        q.add(2);
        q.add(3);
        q.offer(4);
        q.offer(5);
        System.out.println(q);


        //Deletion
        System.out.println(q.poll());
        System.out.println(q.remove());
        System.out.println(q);

        //clear
        q.clear();
        //System.out.println(q.remove());
        System.out.println(q.poll());
        q.offer(6);
        q.offer(7);
        q.offer(8);
        q.offer(9);

        //First element
       // System.out.println(q.element());
        System.out.println(q.peek());

        System.out.println(q.contains(10));



    }
}
