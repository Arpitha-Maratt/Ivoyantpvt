package JavaCourse.collection.queue.priorityqueue;

import java.util.PriorityQueue;

public class RemovingElement {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Arpitha");
        pq.add("Amulya");
        pq.add("Arpitha");

        System.out.println("Initial PriorityQueue " + pq);

        // using the method
        pq.remove("Geeks");

        System.out.println("After Remove: " + pq);

        System.out.println("Poll Method: " + pq.poll());

        System.out.println("Final PriorityQueue: " + pq);
    }
}

