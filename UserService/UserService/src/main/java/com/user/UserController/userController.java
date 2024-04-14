package com.user.UserController;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entities.UserEntity;
import com.user.impl.UserServiceImpl;
import com.user.services.UserServices;

import ch.qos.logback.classic.Logger;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
@RequestMapping("/user")
public class userController {
	int retryCount=0;
	private Logger logger=(Logger) LoggerFactory.getLogger(userController.class);
	public userController() {
		System.out.println("Default Constructor");
	}
	@Autowired
	private UserServices userService;
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	
	//Create
	@PostMapping
	public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity userEntity){
		UserEntity user=userService.save(userEntity);
		return ResponseEntity.status(HttpStatus.CREATED).body(user);
	}
	
	
	@GetMapping("/{userId}")
//	@CircuitBreaker(name="ratingHotel",fallbackMethod = "ratingHotelFallBack")
//	@Retry(name="ratingHotelRetry",fallbackMethod = "ratingHotelFallBack")
	@RateLimiter(name="RateLimiter",fallbackMethod = "ratingHotelFallBack")
	public ResponseEntity<UserEntity>getSingleUser(@PathVariable String userId){
		retryCount++;
	    logger.info("Retry Count: {}",retryCount);
	    
		//used userserviceimpl rather than userService and for return used diff 
		UserEntity userEntity=userService.getUserById(userId);
		return ResponseEntity.status(HttpStatus.OK).body(userEntity);
		//return ResponseEntity.ok(userEntity);
		
	}
	
	public ResponseEntity<UserEntity>ratingHotelFallBack(String userId,Exception ex){
		
		UserEntity user = new UserEntity();
		user.setAbout(ex.getMessage());
		user.setEmail("dummy@gmail.com");
		user.setId(userId);
		user.setName("CircuitBreaker");
		
		return new ResponseEntity<>(user,HttpStatus.OK);
	}

	
	@GetMapping("/getAll")
	public ResponseEntity<List<UserEntity>>getAllUser(){
		List<UserEntity> l=userService.getAllUser();
		return ResponseEntity.ok(l);
		
	}
	@GetMapping("/home")
	public String Home() {
	 return "Hello world";
	}
	
	
	
	
	}
	
