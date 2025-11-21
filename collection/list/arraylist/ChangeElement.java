package JavaCourse.Collection.List.ArrayList;

import java.util.ArrayList;

public class ChangeElement {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("volva");
        cars.add("Bmw");

        System.out.println("Before changing element"+cars);

        //to set element
        cars.set(0,"Opel");

        System.out.println("After changing element in arrayList" +cars);
    }
}
