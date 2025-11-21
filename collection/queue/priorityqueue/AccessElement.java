package JavaCourse.collection.queue.priorityqueue;

import java.util.PriorityQueue;

public class AccessElement {
    public static void main(String[] args)
    {

        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Arpitha");
        pq.add("Amulya");
        pq.add("Akshay");
        System.out.println("PriorityQueue: " + pq);

        // Using the peek() method
        String element = pq.peek();
        System.out.println("Accessed Element: " + element);
    }
}
