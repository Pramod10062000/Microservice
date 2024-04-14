package com.HotelService.Service;

import java.util.List;

import com.HotelService.entities.Hotels;

public interface Service {
	//create
	Hotels create(Hotels Hotel);
	
	//getAll
	List<Hotels> getEvery();
	
	//getSingle
	Hotels getSingle(String id);

}
