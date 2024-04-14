package com.user.GExceptionHandler;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.user.CustomException.ResourceNotFoundException;

//@RestControllerAdvice
public class GlobalExceptionHandler {

//	@ExceptionHandler(ResourceNotFoundException.class)
//	public ResponseEntity<Map<String,Object>>notFoundHandler(ResourceNotFoundException r){
//		Map m = new HashMap();
//		m.put("message", r.getMessage());
//		m.put("Success", false);
//		m.put("Status", HttpStatus.NOT_FOUND);
//		
//		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(m);
//	}
}
