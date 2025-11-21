package JavaCourse.Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class reverse {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        List<Integer> reversed = new ArrayList<>();

        for(int i = numbers.size() -1 ;i>=0;i--){
            reversed.add(numbers.get(i));
        }

        System.out.println("Originale List: "+numbers);
        System.out.println("Reversed List: " + reversed);

    }
}
