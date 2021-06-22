package com.libr.mng.book.configuration;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.libr.mng.book.util.BookException;

@ControllerAdvice
public class GlobalErrorHandler {
	
	@ExceptionHandler(BookException.class)
	public  ResponseEntity<String> throwException(BookException be){
		be.setErrorCode("libr.001");
		be.setErrorDescription("Something went wrong with the connection,Please contact System Adminstrator.");
		return new ResponseEntity<String>("Something went wrong with the connection,Please contact System Adminstrator.",HttpStatus.NOT_FOUND);
		
	}

}
