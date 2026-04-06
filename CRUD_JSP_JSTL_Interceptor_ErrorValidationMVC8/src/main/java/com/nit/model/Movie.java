package com.nit.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
	private Integer movieId;
	@NotBlank(message = "title can't be empty")
	private String title;
	@NotBlank(message = "Genre is required")
	private String genre;
	@PositiveOrZero(message = "rating can't be -ve")
	@NotNull(message = "rating must be not null")
    private Double rating;
	@Min(value = 1888,message ="Enter a valid release year")
	private Integer releaseYear;
	
	
}
