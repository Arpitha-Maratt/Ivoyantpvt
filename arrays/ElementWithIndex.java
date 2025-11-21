package JavaCourse.Arrays;

public class ElementWithIndex {
    public static void main(String[] args) {

        String[] seats = {"Arpitha","Amulya","Akshay","Rachana"};
        for(int i = 0; i< seats.length ; i++){
            System.out.println("The seat number is :"+ i + " is taken by :"+ seats[i]);
        }
    }
}
