package com.HotelService.impl;
import java.util.List;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import com.HotelService.CustomEsception.ResourceNotFoundException;
import com.HotelService.HotelRepository.HotelRepository;
import com.HotelService.Service.Service;
import com.HotelService.entities.Hotels;
@org.springframework.stereotype.Service
public class ImplService implements Service
{
	@Autowired
	private HotelRepository hotelRepository;
	@Override
	public Hotels create(Hotels Hotel) {
		String hotelId=UUID.randomUUID().toString();
		Hotel.setId(hotelId);
		return hotelRepository.save(Hotel);
	}
	@Override
	public List<Hotels> getEvery() {
		List<Hotels> hotel = hotelRepository.findAll();
		return hotel;
	}
	@Override
	public Hotels getSingle(String id) 
	{
		return hotelRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Hotel with given id not found")
				);
	}

}
