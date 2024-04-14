package com.RatingService.Service;

import java.util.List;

import com.RatingService.enitites.Rating;

public interface Ratingservice {
	
	//Create
	Rating create (Rating rating);
	
	//get All ratings
	List<Rating> getAllRatings();
	
	//get all ratings by uer id;
	
	List<Rating> getAllRatingsByUserId(String UserId);
	
	//getAll by Hotel Id
	
	List<Rating>getAllByHotelId(String HotelId);
	

}
