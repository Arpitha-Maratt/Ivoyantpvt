package JavaCourse.Collection.List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class countElement {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,2,3,2,4,5,6,2);

        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int target = sc.nextInt();

        for(int num : numbers){
            if(num == target){
                count++;
            }
        }
        System.out.println(target+ " is appeared : "+ count + " times");


    }
}
