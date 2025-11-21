package JavaCourse.collection.set.hashset;

import java.util.HashSet;

public class removeEle {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        numbers.remove(10);
        System.out.println(numbers);
    }
}
