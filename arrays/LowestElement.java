package JavaCourse.Arrays;

public class LowestElement {
    public static void main(String[] args) {
        int[] ages = {20,34,12,51,19,23};
        int lowest = ages[0];

        for(int i=0;i<ages.length;i++){
            if(lowest > ages[i]){
                lowest = ages[i];
            }
        }
        System.out.println("The lowest element element is :"+lowest);
    }
}
