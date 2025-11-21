package JavaCourse.Collection.List;

import java.util.*;

public class sortList {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(50, 10, 30, 20, 40));

        Collections.sort(numbers);
        System.out.println("Ascending order;"+numbers);

        Collections.sort(numbers,Collections.reverseOrder());
        System.out.println("Descending order"+ numbers);

    }
}
