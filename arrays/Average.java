package JavaCourse.Arrays;

public class Average {
    public static void main(String[] args) {

        //initialize and declare
        int[] ages = {20,34,12,51,19,23};
        float avg, summ = 0;
        //find the length
        int length = ages.length;

        //find sum
        /*for(int i = 0;i<ages.length;i++){
            summ += ages[i];
        }*/

        for (int age : ages){
            summ += age;
        }
        System.out.println("The sum of the differnt age is:"+summ);

        //find avg
        avg = summ / length;
        System.out.println("The average of different ages:"+avg);

    }
}
