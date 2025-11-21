package JavaCourse.collection.queue.arraydeque;

import java.util.ArrayDeque;


public class AccessElement {
    public static void main(String[] args) {
        // getFirst(),getLast(),peek(),peekFirst,peekLast()

        ArrayDeque<String> dq = new ArrayDeque<String>();

        dq.add("a");
        dq.add("b");
        dq.add("c");
        dq.add("d");

        System.out.println(dq);

        // for first element
        System.out.println("First element "+dq.getFirst());

        //for last element

        System.out.println("Last element "+dq.getLast());

        //using peek : print 1st element
        System.out.println("Using peek "+dq.peek());

        //using peekLast
        System.out.println("Using peekLast "+dq.peekLast());
    }
}
