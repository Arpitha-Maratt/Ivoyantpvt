package JavaCourse.Collection.List;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class specificElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,20,30,40,50);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int target = sc.nextInt();

        if(numbers.contains(target)){
            System.out.println(target+" is present in the list");
        }else{
            System.out.println(target+" is not present in the list");
        }
    }
}
