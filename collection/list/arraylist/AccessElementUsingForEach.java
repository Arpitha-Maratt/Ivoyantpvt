package JavaCourse.Collection.List.ArrayList;

import java.util.ArrayList;

public class AccessElementUsingForEach {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Volva");
        cars.add("BMW");
        cars.add("Ford");

        for(String car : cars){
            System.out.print(car);
        }
    }
}
