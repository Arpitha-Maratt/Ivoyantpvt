package JavaCourse.Collection.List.ArrayList;

import java.util.ArrayList;

public class AccessElement {
    public static void main(String[] args) {
        //created ArrayList
        ArrayList<String> cars = new ArrayList<>();

        //Added
        cars.add("Volva");
        cars.add("Bmw");

        // to acess
        System.out.println(cars.get(0));
    }
}
