package JavaCourse.Collection.List.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class StoreIntegerElement {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);


        // to print in array Format
        Integer[] arr = numbers.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));


        for (int num : numbers){
            System.out.print(num + " ");
        }
    }
}
