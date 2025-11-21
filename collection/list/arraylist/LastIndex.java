package JavaCourse.Collection.List.ArrayList;
import java.util.ArrayList;
public class LastIndex {
    public static void main(String[] args) {

                ArrayList<String> cars = new ArrayList<String>();
                cars.add("Volvo");
                cars.add("Ford");
                cars.add("BMW");
                cars.add("Ford");
                cars.add("Mazda");
                System.out.println(cars.indexOf("Volvo"));
                System.out.println(cars.lastIndexOf("Volvo"));
            }
        }

