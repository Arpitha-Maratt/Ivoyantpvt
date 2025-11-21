package JavaCourse.Collection.List;

import java.util.Arrays;
import java.util.List;

public class sumAndAvg {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        // Calculate sum
        int sum = 0;
        for(int num : numbers) {
            sum += num;
        }

        // Calculate average
        double average = (double) sum / numbers.size();

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

}


