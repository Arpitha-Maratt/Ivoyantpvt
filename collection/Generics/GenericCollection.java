package JavaCourse.collection.Generics;

import java.util.ArrayList;

public class GenericCollection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(25);
        list.add(26);
        Integer number = list.get(0);

        System.out.println(number);
    }
}
