package JavaCourse.Arrays;

public class Basic {
    public static void main(String[] args) {

        // declaring an Array
        int[] arr;

        // Initialization and declaration of an array
        int[] arr1 = {1, 2, 3, 4, 5};

        //Access the element from the array
        System.out.println(arr1[0]);

        //to find length
        System.out.println("The length of an arr1 is : " + arr1.length);

        //To create an array by specifying its size with new:
        String[] cars = new String[5];

        //to assign values
        cars[0] = "Volvo";
        cars[1] = "BMW";
        cars[2] = "Ford";
        cars[3] = "Enova";
        cars[4] = "Swift";

        System.out.println("The 5th element is :" + cars[4]);

        //to update values:
        System.out.println("the before cars[2] values is:" + cars[2]);
        cars[2] = "Thar";
        System.out.println("After updaing :" + cars[2]);

        /* With new - if we already know the values

        String[] cars = new String[] {"Volvo", "BMW", "Ford", "Mazda"};
                         or
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        */

        // Loop through an Array
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

    }
}