package com.user.services;

import java.util.List;

import com.user.entities.UserEntity;

public interface UserServices {
	
	//method to save/create user taking user object
	UserEntity save(UserEntity user);
	
	//method to get all the users in list of user type
	List<UserEntity>getAllUser();
	
	//method to get a single user by id
	UserEntity getUserById(String Id);
	
	
	

}
