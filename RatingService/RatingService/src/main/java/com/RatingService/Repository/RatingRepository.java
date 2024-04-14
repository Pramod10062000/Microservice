package com.RatingService.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.RatingService.enitites.Rating;
import java.util.List;


public interface RatingRepository extends JpaRepository<Rating, String> {
	
	
	List<Rating> findByHotelId(String hotelId);
	List<Rating> findByUserId(String UserId);
	

}
