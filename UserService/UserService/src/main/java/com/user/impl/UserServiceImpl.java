package com.user.impl;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.CustomException.ResourceNotFoundException;
import com.user.ExternalService.HotelService;
import com.user.Repository.UserRepository;
import com.user.entities.Hotels;
import com.user.entities.Rating;
import com.user.entities.UserEntity;
import com.user.services.UserServices;
@Service
public class UserServiceImpl implements UserServices{
	@Autowired
	public UserRepository userRepository;
	@Autowired
	public HotelService hotelService;
	
	@Autowired
	public RestTemplate restTemplate;
	@Override
	public UserEntity save(UserEntity user) {
		String randomId=UUID.randomUUID().toString();
		user.setId(randomId);
		System.out.println(user);
		// TODO Auto-generated method stub
		UserEntity userE=userRepository.save(user);
		System.out.println(userE);
		return userE;
	}
	@Override
	public List<UserEntity> getAllUser() {
	List<UserEntity> userE=userRepository.findAll();
	System.out.println(userE);
		return userE;
	}
	@Override
	public UserEntity getUserById(String Id) {
		UserEntity userEntity= userRepository.findById(Id).orElseThrow(()-> new ResourceNotFoundException("User with given id is not found on Server !!:"+Id));
		
		Rating [] ratingUser=restTemplate.getForObject("http://Rating-Service-3/ratings/users/"+userEntity.getId(),Rating[].class);
		
		List<Rating>  ratings=Arrays.stream(ratingUser).toList();
		List<Rating> ratingList=ratings.stream().map(rating->{
//			ResponseEntity<Hotels> h=restTemplate.getForEntity("http://HOTELSERVICE/hotel/"+rating.getHotelId(),Hotels.class);
			Hotels hotel=hotelService.getHotel(rating.getHotelId());
			rating.setHotel(hotel);
			return rating;
			
		}).collect(Collectors.toList());
		userEntity.setRating(ratingList);
		return userEntity;
	}

}
