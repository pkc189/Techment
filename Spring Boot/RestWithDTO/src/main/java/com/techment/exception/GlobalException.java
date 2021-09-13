package com.techment.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(value = IDNotFoundException.class)
	public ResponseEntity<Object> myException(IDNotFoundException exception) {
		return new ResponseEntity<Object>(exception.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = ValidationException.class)
    public ResponseEntity<List<String>> myValidationException(ValidationException exception){
   	 return new ResponseEntity<List<String>>(exception.getMessages(),HttpStatus.BAD_REQUEST);
    }
	
	

	
	
}
