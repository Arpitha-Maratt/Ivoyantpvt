package JavaCourse.collection.queue.abstractQueue;

import java.util.AbstractQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class RemovingElement {
    public static void main(String[] args) {
        AbstractQueue<Integer> a = new LinkedBlockingQueue<>();

        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);

        System.out.println(a);


        // remove first element
        int head = a.remove();
        System.out.println(head);

        a.remove(30);
        System.out.println(a);
    }
}
