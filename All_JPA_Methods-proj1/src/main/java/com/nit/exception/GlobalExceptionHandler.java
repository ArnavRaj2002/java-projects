package com.nit.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler  {
	@ExceptionHandler(IDNotFoundException.class)
 public ResponseEntity<String> handleIDNotFoundException(IDNotFoundException IDNFE)
 {
	 String message = IDNFE.getMessage();
	 return new ResponseEntity<String>(message,HttpStatus.NOT_FOUND);
 }
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleAnyException(Exception e)
	{
		String message = e.getMessage();
		return new ResponseEntity<String>(message,HttpStatus.NO_CONTENT);
	}
}
