package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Module.Vehicle;
import com.example.demo.Service.VehicleService;

@RestController
public class VehicleController 
{
	@Autowired
	VehicleService s;
	
//	localhost:9091/addVehicle
	@PostMapping("/addVehicle")
	ResponseEntity<Vehicle> addVehicle(@RequestBody Vehicle v)
	{
		return new ResponseEntity<Vehicle>(s.addVehicle(v), HttpStatus.CREATED);		
	}
	
//	localhost:9091/deleteByID
	@DeleteMapping("/deleteByID")
	ResponseEntity<Vehicle> deleteByID(@RequestHeader Integer vid)
	{
		return new ResponseEntity<Vehicle>(s.deleteByID(vid), HttpStatus.OK);
	}
	
//	localhost:9091/getByID
	@GetMapping("/getByID")
	ResponseEntity<Vehicle> findByID(@RequestHeader Integer vid)
	{
		return new ResponseEntity<Vehicle>(s.getById(vid), HttpStatus.FOUND);
	}
	
//	localhost:9091/getAll
	@GetMapping("/getAll")
	ResponseEntity<List<Vehicle>> findAllVehicle()
	{
		return new ResponseEntity<List<Vehicle>>(s.getAllVehicle(), HttpStatus.FOUND);
		
	}
	
//	localhost:9091/findByColour
	@GetMapping("/findByColour")
	ResponseEntity<List<Vehicle>> findByColour(@RequestHeader String vcolour)
	{
		return new ResponseEntity<List<Vehicle>>(s.getByColour(vcolour), HttpStatus.FOUND);
	}
	
//	localhost:9091/getSortedPrice
	@GetMapping("getSortedPrice")
	ResponseEntity<List<Vehicle>> findAllSortedPrice()
	{
		return new ResponseEntity<List<Vehicle>>(s.getAllBySortedPrice(), HttpStatus.FOUND);
	}
	
//	localhost:9091/getSortedPriceColour
	@GetMapping("getSortedPriceColour")
	ResponseEntity<List<Vehicle>> findAllSortedPriceColour()
	{
		return new ResponseEntity<List<Vehicle>>(s.getAllBySortedPriceColour(),HttpStatus.FOUND);
	}
	
//	localhost:9091/updateVehicleByID
	@PutMapping("/updateVehicleByID")
	ResponseEntity<Vehicle> updateVehicleByID(@RequestBody Vehicle v)
	{
		return new ResponseEntity<Vehicle>(s.updateBasedOnID(v), HttpStatus.OK);		
	}
	
//	localhost:9091/getVehicleBelowLakh
	@GetMapping("/getVehicleBelowLakh")
	ResponseEntity<List<Vehicle>> findVehicleBelowLakh()
	{
		return new ResponseEntity<List<Vehicle>>(s.getVehicleAboveLakh(), HttpStatus.FOUND);
	}
}

















