package JavaCourse.Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SwapElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        Collections.swap(list, 1, 3); // swap elements at index 1 and 3
        System.out.println("After Swap: " + list);
    }
}
