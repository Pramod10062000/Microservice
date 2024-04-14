package com.user.entities;

public class Rating {
	
	private String ratingId;
	private String userId;
	private String hotelId;
	private int rating;
	private Hotels hotel;
	
	@Override
	public String toString() {
		return "Rating [ratingId=" + ratingId + ", userId=" + userId + ", hotelId=" + hotelId + ", rating=" + rating
				+ ", hotel=" + hotel + ", feedback=" + feedback + "]";
	}

	public Rating(String ratingId, String userId, String hotelId, int rating, Hotels hotel, String feedback) {
		super();
		this.ratingId = ratingId;
		this.userId = userId;
		this.hotelId = hotelId;
		this.rating = rating;
		this.hotel = hotel;
		this.feedback = feedback;
	}

	public Hotels getHotel() {
		return hotel;
	}

	public void setHotel(Hotels hotel) {
		this.hotel = hotel;
	}

	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rating(String ratingId, String userId, String hotelId, int rating, String feedback) {
		super();
		this.ratingId = ratingId;
		this.userId = userId;
		this.hotelId = hotelId;
		this.rating = rating;
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

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	private String feedback;

}
