package com.nit.controller;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nit.model.Movie;
import com.nit.service.IMovieService;

import jakarta.validation.Valid;

@Controller
public class MovieController {
	@Autowired
	private IMovieService movieService;
	@GetMapping("/")
	public String indexPage()
	{
		return "forward:/movie";
	}
	
	@GetMapping("/movie")
	public String getMovieList(Map<String, Object> map) {
		List<Movie> allMovies = movieService.getAllMovies();
		map.put("movieList", allMovies);
		return "movie-list";

	}

	//@GetMapping("/movies/add")
	@GetMapping("/add")
	public String displayAddMovieForm(@ModelAttribute("movie") Movie movie) {
		return "add-form";

	}

//	@GetMapping("/movies/forwardAdd") ??
//	public String forwardToAdd() {
//
//		return "forward:/movies/add";
//	}

	//@PostMapping("/movies/save")
	@PostMapping("/save")

	public String saveAddForm(@Valid @ModelAttribute("movie") Movie movie,BindingResult errors) {
		if (errors.hasErrors()) {
	        return "add-form";  // back to form with errors displayed
	    }
		movieService.addMovie(movie);
		return "redirect:/movie";
	}

	@GetMapping("/edit/{id}")
	public String displayEditForm(@PathVariable int id, Map<String, Object> map) {
		Movie movieById = movieService.getMovieById(id);
		map.put("editMovie", movieById);
		return "edit-form";

	}

	@PostMapping("/update")
	public String updateForm(@Valid @ModelAttribute("editMovie") Movie movie,BindingResult errors) {
		if (errors.hasErrors()) {
	        return "edit-form";  // back to form with errors displayed
	    }
		System.out.println(movie);
		movieService.updateMovie(movie);
		return "redirect:/movie";

	}

	@GetMapping("/delete/{id}")
	public String deleteMovie(@PathVariable int id) {
		movieService.deleteMovie(id);
		return "redirect:/movie";

	}
}
