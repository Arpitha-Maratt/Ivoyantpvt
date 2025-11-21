package JavaCourse.Collection.List;

import java.util.ArrayList;
import java.util.List;

public class CheckEmpty {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println(list.isEmpty() ? "Yes" : "No");
    }
}
