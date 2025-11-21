package JavaCourse.Collection.Map.HashMap;

import java.util.HashMap;

public class Accessitem {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<>();

        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslo"); // Duplicate ignored
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities.get("England"));
    }
}