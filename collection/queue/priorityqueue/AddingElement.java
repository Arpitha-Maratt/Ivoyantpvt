package JavaCourse.collection.queue.priorityqueue;

import java.util.PriorityQueue;

public class AddingElement {
    public static void main(String[] args) {
        PriorityQueue<Integer> elements = new PriorityQueue<>();

        for(int i=0;i<3;i++){
            elements.add(i);
           elements.add(1);
        }

        System.out.println(elements);
    }
}
