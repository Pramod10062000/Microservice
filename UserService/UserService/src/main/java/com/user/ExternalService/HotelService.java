package com.user.ExternalService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.user.entities.Hotels;

@FeignClient(name="HOTELSERVICE")
public interface HotelService {
	
	@GetMapping("/hotel/{hotelId}")
	Hotels getHotel(@PathVariable("hotelId") String hotelId);

}
