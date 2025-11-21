package JavaCourse.Collection.List;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class secondLargest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 40, 20, 50, 30);
        Collections.sort(numbers);
        int secondLargest = numbers.get(numbers.size() - 2);
        System.out.println("Second Largest: " + secondLargest);

    }
}
