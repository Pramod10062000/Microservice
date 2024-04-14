package com.RatingService.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RatingService.RatingServiceImpl.RatingServiceImpl;
import com.RatingService.enitites.Rating;

@RestController
@RequestMapping("/ratings")
public class RatingController {
	
	@Autowired
	private RatingServiceImpl ratingServiceImpl;

	
	@PostMapping
	public ResponseEntity<Rating> create(@RequestBody Rating rating){
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingServiceImpl.create(rating));
	}
	
	//getAll
	@GetMapping()
	public ResponseEntity<List<Rating>> getAllRatings(){
		return ResponseEntity.ok(ratingServiceImpl.getAllRatings());
	}
	
	//getAll by userID
	@GetMapping("/users/{userId}")
	public ResponseEntity<List<Rating>> getAllRatingsByUserId(@PathVariable String userId){
		return ResponseEntity.ok(ratingServiceImpl.getAllRatingsByUserId(userId));
	}
	
	
	//getAll by HotelId
	@GetMapping("/hotels/{HotelId}")
	public ResponseEntity<List<Rating>> getAllRatingsByHotelId(@PathVariable String HotelId){
		return ResponseEntity.ok(ratingServiceImpl.getAllByHotelId(HotelId));
	}
	
	
	
	
	@GetMapping("/home")
	public String Home(){
		return "Home";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
