package com.app.steam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class A {
    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Inception", 8.8, 2010));
        movies.add(new Movie("Interstellar", 8.6, 2014));
        movies.add(new Movie("Tenet", 7.5, 2020));
        movies.add(new Movie("Dunkirk", 7.9, 2017));
        
        System.out.println("=================RatingComparatorDesc=============");
        Collections.sort(movies, new RatingComparatorDesc());
        for (Movie m : movies) {
            System.out.println(m);
        }
        
        
        System.out.println("===================MovieSortByYear=================");
        Collections.sort(movies, new MovieSortByYear());
        for (Movie m : movies) {
            System.out.println(m);
        }
        
        System.out.println("==================MovieSortByYear==================");
        Collections.sort(movies, new MovieSortByName());
        for (Movie m : movies) {
            System.out.println(m);
        }
    }
}
