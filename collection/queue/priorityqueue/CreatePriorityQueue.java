package JavaCourse.collection.queue.priorityqueue;

import java.util.PriorityQueue;

public class CreatePriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> prior = new PriorityQueue<>();

        prior.add(3);
        prior.add(8);
        prior.add(7);
        prior.add(2);

        System.out.println(prior);

    }
}
