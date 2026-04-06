package com.nit.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(CourseIDNotFound.class)
	public ResponseEntity<ErrorDetails> handleCourseIDNotFound(CourseIDNotFound CIDNF) {
		ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now(), CIDNF.getMessage(),
				"404- resource not found");
		return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handleAllException(Exception e) {
		ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now(), e.getMessage(),
				"Internal Problem Occured !!");
		return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
