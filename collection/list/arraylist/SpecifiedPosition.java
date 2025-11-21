package JavaCourse.Collection.List.ArrayList;

import JavaCourse.Arrays.Array;

import java.util.ArrayList;

public class SpecifiedPosition {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Volva");
        cars.add("BMW");
        cars.add("Ford");

        cars.add(0,"Mazda");
        System.out.println(cars);

        cars.add(0,"Lambargini");
        System.out.println(cars);
    }
}
