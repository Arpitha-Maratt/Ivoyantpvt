package JavaCourse.Collection.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class removeEvenNumber {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 15, 20, 25, 30, 35));

        for(int i = 0; i< numbers.size();i++){
            if(numbers.get(i) % 2 == 0){
               numbers.remove(i);
                i--; // to adjust the index after array
            }
        }

        System.out.println("List after removing element"+numbers);

    }
}
