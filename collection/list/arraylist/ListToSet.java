package JavaCourse.Collection.List.ArrayList;

import java.util.*;

public class ListToSet {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Arpitha");
        list.add("Jhon");
        Set<String> set = new HashSet<>(list);
        System.out.println(set);
    }
}
