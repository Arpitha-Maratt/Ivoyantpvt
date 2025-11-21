package JavaCourse.collection.queue.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class AddFirstElementToArrayDeque {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(1);
        System.out.println("First: "+ dq);
    }
}
