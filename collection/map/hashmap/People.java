package JavaCourse.collection.map.hashmap;

import java.util.HashMap;

public class People {
    public static void main(String[] args) {
        HashMap<String,Integer> people = new HashMap<>();

        people.put("John", 32);
        people.put("Steve", 30);
        people.put("Angie", 33);

        for(String i : people.keySet()){
            System.out.println(i + " Values : "+ people.get(i));
        }
    }
}
