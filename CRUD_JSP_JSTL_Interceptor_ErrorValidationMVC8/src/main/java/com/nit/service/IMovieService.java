package com.nit.service;

import java.util.List;

import com.nit.model.Movie;

public interface IMovieService {
	List<Movie> getAllMovies();
	Movie getMovieById(int id);
	void addMovie(Movie movie);
	void updateMovie(Movie movie);
	void deleteMovie(int id);
	void searchMovie(String name);

}
