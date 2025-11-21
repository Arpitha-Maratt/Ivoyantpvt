package JavaCourse.Collection.List;

import java.util.Arrays;
import java.util.List;

public class ListToArray {
        public static void main(String[] args) {
            List<Integer> list = Arrays.asList(10, 20, 30);
            Integer[] arr = list.toArray(new Integer[0]);

            System.out.println("Array: " + Arrays.toString(arr));
        }
    }
