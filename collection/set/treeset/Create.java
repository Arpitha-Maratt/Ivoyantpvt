package JavaCourse.collection.set.treeset;

import java.util.TreeSet;

public class Create {
    public static void main(String[] args) {
        //created
        TreeSet<String> cars = new TreeSet<>();

        //add
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");  // Duplicate
        cars.add("Mazda");

        System.out.println(cars);

    }
    }

