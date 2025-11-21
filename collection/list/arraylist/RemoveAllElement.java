package JavaCourse.Collection.List.ArrayList;

import java.util.ArrayList;

public class RemoveAllElement {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mazdon");
        cars.add("swift");
        System.out.println("Before removing all the element : "+cars);

        cars.clear();
        System.out.println("After removing"+ cars);
    }
}
