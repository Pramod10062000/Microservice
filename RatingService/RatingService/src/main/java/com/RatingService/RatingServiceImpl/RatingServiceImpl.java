package com.RatingService.RatingServiceImpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RatingService.Repository.RatingRepository;
import com.RatingService.Service.Ratingservice;
import com.RatingService.enitites.Rating;


@Service
public class RatingServiceImpl implements Ratingservice {
	
	@Autowired
	private RatingRepository ratingRepository;

	@Override
	public Rating create(Rating rating) {
		// TODO Auto-generated method stub
		String RatingId=UUID.randomUUID().toString();
		rating.setRatingId(RatingId);
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getAllRatings() {
		
		return ratingRepository.findAll();
	}

	@Override
	public List<Rating> getAllRatingsByUserId(String UserId) {
		
		return ratingRepository.findByUserId(UserId);
	}

	@Override
	public List<Rating> getAllByHotelId(String HotelId) {
		// TODO Auto-generated method stub
		return ratingRepository.findByHotelId(HotelId);
	}

}
