package JavaCourse.collection.queue.abstractQueue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();


        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");
        queue.add("David");
        System.out.println("Queue: " + queue);

        // it will remove first element from the queue
        String first = queue.remove();
        System.out.println("Removed element: " + first);

        System.out.println("Queue: " + queue);

        // It will Peek at the first element in the queue
        String peeked = queue.peek();
        System.out.println("Peeked element: " + peeked);
        System.out.println("Queue: " + queue);
    }
}
