package com.user.CustomException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.user.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	//@ExceptionHandler is method level annotation used to specify which method will / should work when an Exception of the type will occur
	//It takes an argument name of the Custom Exception Class so when the exception of that type will occur this method should work
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse>handlerResourceNotFoundException(ResourceNotFoundException ex){
		String msg = ex.getMessage();
		ApiResponse  resp =new ApiResponse();
		resp.setMessage(msg);
		resp.setSuccess(true);
		resp.setStatus(HttpStatus.NOT_FOUND);
		return new ResponseEntity<ApiResponse>(resp,HttpStatus.NOT_FOUND);
		
	}
}