package com.HotelService.HotelController;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.HotelService.entities.Hotels;
import com.HotelService.impl.ImplService;
@RestController
@RequestMapping("/hotel")
public class HotelController {

@Autowired
private ImplService implService;
	
	
@PostMapping
public ResponseEntity<Hotels> createHotel(@RequestBody Hotels hotels){
	return ResponseEntity.status(HttpStatus.CREATED).body(implService.create(hotels));
	
}


@GetMapping("/{HotelId}")
public ResponseEntity<Hotels> getSingle(@PathVariable String HotelId){
	return ResponseEntity.status(HttpStatus.OK).body(implService.getSingle(HotelId));
}
	

@GetMapping()
public ResponseEntity<List<Hotels>> getA(){
	return ResponseEntity.ok(implService.getEvery());
}
}
