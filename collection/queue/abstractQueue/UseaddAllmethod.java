package JavaCourse.collection.queue.abstractQueue;

import java.util.AbstractQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class UseaddAllmethod {
    public static void main(String[] argv) throws Exception
    {

        AbstractQueue<Integer> A1 = new LinkedBlockingQueue<Integer>();


        A1.add(10);
        A1.add(20);
        A1.add(30);
        A1.add(40);
        A1.add(50);
        System.out.println("AbstractQueue contains : " + A1);

        AbstractQueue<Integer> A2 = new LinkedBlockingQueue<Integer>();

        System.out.println("AbstractQueue2 initially contains : " + A2);

        A2.addAll(A1);
        System.out.println( "AbstractQueue1 after addition contains : " + A2);
    }
}
