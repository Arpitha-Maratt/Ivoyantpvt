package JavaCourse.collection.queue.priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class IteratingPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Arpi");
        pq.add("Appi");
        pq.add("Arpitha");

        Iterator iterator = pq.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
