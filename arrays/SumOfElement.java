package JavaCourse.Arrays;

public class SumOfElement {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        int sum = 0;
        for (int i = 0; i < numbers.length;i++){
            sum += numbers[i];
        }

       /* for(int n : numbers){
            System.out.print(n + " ");
        }*/


        System.out.println("The sum of all element : "+ sum);

    }
}
