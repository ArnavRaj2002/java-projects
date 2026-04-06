package com.nit.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(OrderIDNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleOrderIDNotFoundException(OrderIDNotFoundException OIDNF) {
		ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now(), OIDNF.getMessage(),
				"404 - Order Not Exist in Db !!");
		return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorDetails> handleAllException(Exception e) {
		ErrorDetails errorDetails = new ErrorDetails(LocalDateTime.now(), e.getMessage(), "Problem in Execution !!");
		return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
