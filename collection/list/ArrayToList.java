package JavaCourse.Collection.List;

import java.util.ArrayList;
import java.util.List;

public class arrayToList {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        List<Integer> list = new ArrayList<>();
        for (int i : arr) list.add(i);

        System.out.println("List: " + list);
    }
}