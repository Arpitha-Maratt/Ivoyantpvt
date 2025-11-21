package JavaCourse.Collection.List;

import java.util.ArrayList;
import java.util.List;

public class createList {

//    Problem:Create a list of integers and print all elements.
    public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();

    numbers.add(10);
    numbers.add(20);
    numbers.add(30);
    numbers.add(40);
    numbers.add(50);

        System.out.println("List element:");
        for(int num : numbers){
            System.out.println(num);
        }
    }
}
