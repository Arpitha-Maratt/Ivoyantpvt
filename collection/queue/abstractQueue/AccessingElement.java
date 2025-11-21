package JavaCourse.collection.queue.abstractQueue;

import java.util.AbstractQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class AccessingElement {
    public static void main(String[] args) {
        AbstractQueue<Integer> val = new LinkedBlockingQueue<Integer>();

        // Populating AQ1 using add method
        val.add(10);
        val.add(20);
        val.add(30);
        val.add(40);
        val.add(50);

        // print val to the console
        System.out.println("AbstractQueue1 contains : " + val);

        // access the head element
        System.out.println("head : " + val.element());
    }
}
