package JavaCourse.collection.queue.abstractQueue;

import java.util.AbstractQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class AddElementToAbstractQueue {
    public static void main(String[] args) {
        AbstractQueue<Integer> a = new LinkedBlockingQueue<>();

        // add eleemnt

        a.add(1);
        a.add(5);
        a.add(3);

        System.out.println(a);

    }
}
