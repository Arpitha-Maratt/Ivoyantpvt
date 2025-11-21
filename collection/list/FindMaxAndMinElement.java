package JavaCourse.collection.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMaxAndMinElement {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(15, 42, 7, 28, 33);

        int max = Collections.max(numbers);

        int min = Collections.min(numbers);

        System.out.println("The maximum numbers is : "+ max);
        System.out.println("The minimum numbers is : "+ min);


    }
}
