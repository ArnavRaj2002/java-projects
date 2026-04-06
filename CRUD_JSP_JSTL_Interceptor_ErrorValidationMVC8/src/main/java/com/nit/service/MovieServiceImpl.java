package com.nit.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.nit.model.Movie;
@Service
public class MovieServiceImpl  implements IMovieService{
	List<Movie> listOfMovies = new ArrayList<Movie>();
public MovieServiceImpl()
{
	 
	// initialize mutable list from fixed entries
    listOfMovies.add(new Movie(11, "The Matrix", "Sci-Fi", 8.7, 1999));
    listOfMovies.add(new Movie(22, "Inception", "Sci-Fi", 8.8, 2010));
    listOfMovies.add(new Movie(333, "Interstellar", "Sci-Fi", 8.6, 2014));
}
	
	@Override
	public List<Movie> getAllMovies() {
		List<Movie> collect = listOfMovies.stream().collect(Collectors.toList());
 		return collect;
	}

	@Override
	public Movie getMovieById(int id) {
		 Movie orElseThrow = listOfMovies.stream().filter(m->m.getMovieId() == id).findFirst().orElseThrow(()-> new IllegalArgumentException(id+"::not exist !!"));
 		return orElseThrow;
	}

	@Override
	public void addMovie(Movie movie) {
	//	Movie orElseThrow = listOfMovies.stream().filter(m->m.getMovieId().equals(movie.getMovieId())).findFirst().orElseThrow(()-> new IllegalArgumentException());
		boolean anyMatch = listOfMovies.stream().anyMatch(m->m.getMovieId().equals(movie.getMovieId()));
		if(anyMatch) throw new IllegalArgumentException("Movie with id " + movie.getMovieId() + " already exists");
		listOfMovies.add(movie);
	}

	@Override
	public void updateMovie(Movie movie) {
       listOfMovies.stream().map(m->m.getMovieId()==movie.getMovieId()?movie:m).toList();
	}

	@Override
	public void deleteMovie(int id) {
 		//Movie orElseThrow = listOfMovies.stream().filter(m-> m.getMovieId() == id).findFirst().orElseThrow(()-> new IllegalArgumentException(id+"::not found !!"));
 		boolean removeIf = listOfMovies.removeIf(m->m.getMovieId()==id);
 		}

	@Override
	public void searchMovie(String name) {
  	listOfMovies.stream()
    .filter(n -> n.getTitle().toLowerCase().equals(name.toLowerCase()))
    .findFirst()
    .orElseThrow(() -> new IllegalArgumentException(name + ":: Name not exist !!"));	
	}

}
