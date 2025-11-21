package JavaCourse.arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Movie implements Comparable<Movie>{
    private String name;
    private double rating;
    private int year;

    public Movie(String name,double rating,int year){
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public int compareTo(Movie m){
        return this.year - m.year;
    }
public String getName() {
    return name;
}

public double getRating() {
    return rating;
}

public int getYear() {
    return year;
}
}

public class ComparableSorting {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<>();

        list.add(new Movie("Star wars" , 8.7,1977));
        list.add(new Movie("Empire Strikes back", 8.8 , 1980));
        list.add(new Movie("Return of the Jedi",8.4,1983));

        Collections.sort(list);

        System.out.println("Movies after sorting");
        for(Movie m : list) {
            System.out.println(m.getName() + " " + m.getRating() + " " + m.getYear());

        }
    }
}


