package JavaCourse.collection.queue.arraydeque;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class AddElementUsingAddAndOffer {
    public static void main(String[] args) {
        Deque<String> dq = new ArrayDeque<>();

        dq.add("My");
        dq.addFirst("Name is");
        dq.addLast("Arpitha");

        System.out.println(dq);

        dq.offer("I am");
        dq.offer("Learning");
        dq.offer("Java");

        System.out.println(dq);

    }
}
