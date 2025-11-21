package JavaCourse.Collection.List.ArrayList;

import java.util.ArrayList;

public class LoopThroughElement {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Volva");
        cars.add("BMW");
        cars.add("Ford");

        for(int i=0;i<cars.size();i++){
            System.out.print(cars.get(i) + " ");
        }
    }

}
