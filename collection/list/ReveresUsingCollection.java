package JavaCourse.Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reveresUsingCollection {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        // Using Collections.reverse()
        Collections.reverse(numbers);

        System.out.println("Reversed List: " + numbers);
    }
}
