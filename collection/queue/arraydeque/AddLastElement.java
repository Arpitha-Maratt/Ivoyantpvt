package JavaCourse.collection.queue.arraydeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class AddLastElement {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        dq.addLast(5);
        dq.add(2);
        dq.add(4);
        System.out.println(dq);

    }
}
