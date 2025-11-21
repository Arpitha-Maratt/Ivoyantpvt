package JavaCourse.arrays;

import java.util.*;

class Mov {
    private String name;
    private double rating;
    private int year;

    public Mov(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
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

    @Override
    public String toString() {
        return name + " - Rating: " + rating + ", Year: " + year;
    }
}

// Comparator to sort movies by rating (descending)
class RatingComparator implements Comparator<Mov> {
    @Override
    public int compare(Mov m1, Mov m2) {
        return Double.compare(m2.getRating(), m1.getRating());
    }
}

public class MovieComparator {
    public static void main(String[] args) {

        List<Mov> movies = new ArrayList<>();

        movies.add(new Mov("KGF", 8.9, 2018));
        movies.add(new Mov("Kantara", 9.5, 2022));
        movies.add(new Mov("Pushpa", 8.2, 2021));
        movies.add(new Mov("RRR", 9.0, 2022));

        System.out.println("Before Sorting:");
        for (Mov m : movies) {
            System.out.println(m);
        }

        Collections.sort(movies, new RatingComparator());

        System.out.println("\nAfter Sorting by Rating (High → Low):");
        for (Mov m : movies) {
            System.out.println(m);
        }
    }
}
