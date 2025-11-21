package JavaCourse.collection.list;

import java.util.Arrays;
import java.util.List;

public class FindMaxElement {
    public static void main(String[] args) {

       /* List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(23);
        numbers.add(12);
        numbers.add(21);
        numbers.add(50);
*/
        List<Integer> numbers = Arrays.asList(10, 50, 20, 90, 40, 60);
        int max = numbers.get(0);

        for(int num : numbers){
            if(num > max){
                max = num;
            }
        }
        System.out.println("Maximum numbers : "+ max);
    }
}
