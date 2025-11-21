package JavaCourse.collection.queue.abstractQueue;

import java.util.AbstractQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class RemoveAllElement {
    public static void main(String[] args) {
        AbstractQueue<Integer> values = new LinkedBlockingQueue<>();

        values.add(1);
        values.add(2);
        values.add(3);

        System.out.println(values);

        values.clear();
        System.out.println(values);
    }
}
