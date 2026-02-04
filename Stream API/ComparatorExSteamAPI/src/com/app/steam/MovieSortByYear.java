package com.app.steam;

import java.util.Comparator;

public class MovieSortByYear implements Comparator<Movie> {

	@Override
	public int compare(Movie m1, Movie m2) {
		
		return Integer.compare(m1.year, m2.year);
	}

}
