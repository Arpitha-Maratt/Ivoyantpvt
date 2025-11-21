package JavaCourse.collection.list;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        Set<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);

        List<Integer> result = new ArrayList<>(uniqueNumbers);

        System.out.println("List after removing element"+ result);
    }
}
