package com.example.demo.Service;

import java.util.List;

import com.example.demo.Module.Vehicle;


public interface VehicleService 
{
	Vehicle addVehicle(Vehicle v);
	
	Vehicle deleteByID(Integer vid);
	
	List<Vehicle> getAllVehicle();
	
	Vehicle getById(Integer vid);
	
	List<Vehicle> getByColour(String vcolour);
	
	List<Vehicle> getAllBySortedPrice();
	
	Vehicle updateBasedOnID(Vehicle v);
	
	List<Vehicle> getVehicleAboveLakh();
	
	List<Vehicle> getAllBySortedPriceColour();
}















