package com.HotelService.HotelRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import com.HotelService.entities.Hotels;
import com.HotelService.impl.ImplService;

public interface HotelRepository extends JpaRepository<Hotels,String> {

}
