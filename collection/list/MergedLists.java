package JavaCourse.Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergedLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(10, 20, 30);
        List<Integer> list2 = Arrays.asList(40, 50, 60);

        List<Integer> merged = new ArrayList<>(list1);
        merged.addAll(list2);

        System.out.println("Merged list:" + merged);
    }
}
