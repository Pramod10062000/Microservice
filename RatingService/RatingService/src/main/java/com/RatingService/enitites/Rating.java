package com.RatingService.enitites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ratings_Hotel")
public class Rating {
	
	@Id
	@Column(name = "Rating_Id")
	private String ratingId;
	@Column(name = "User_Id")
	private String userId;
	@Column(name = "Hotel_Id")
	private String hotelId;
	@Column(name="Ratings")
	private int rating;
	@Column(name="Feedback")
	private String feedback;
	
	public Rating(String ratingId, String userId, String hotelId, int rating, String feedback) {
		super();
		this.ratingId = ratingId;
		this.userId = userId;
		this.hotelId = hotelId;
		this.rating = rating;
		this.feedback = feedback;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public String getRatingId() {
		return ratingId;
	}
	public void setRatingId(String ratingId) {
		this.ratingId = ratingId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rating(String ratingId, String userId, String hotelId, int rating) {
		super();
		this.ratingId = ratingId;
		this.userId = userId;
		this.hotelId = hotelId;
		this.rating = rating;
	}

}
