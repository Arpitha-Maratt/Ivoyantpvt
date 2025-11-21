package JavaCourse.collection.set.hashset;

import java.util.HashSet;

public class SizeOfHashSet {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<Integer>();

        numbers.add(12);
        numbers.add(51);
        numbers.add(84);

        System.out.println(numbers.size());
    }
}
