package JavaCourse.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortElement {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Volva");
        cars.add("BMW");
        cars.add("Ford");

        //To sort
        Collections.sort(cars);

        // in array format
        String[] carArray = cars.toArray(new String[0]);
        System.out.println(Arrays.toString(carArray));

        // print sorted element
        for(String  car : cars){
            System.out.print(car + " ");
        }
    }
}
