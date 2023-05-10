package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Module.Vehicle;

public interface VehicleRepo extends JpaRepository<Vehicle, Integer>
{
	@Query(value="Select * from Vehicle",nativeQuery = true)
	List<Vehicle> findAllvehicle();
	
	@Query(value="select * from vehicle where vcolour=?1",nativeQuery = true)
	List<Vehicle> findByColour(String vcolour);
	
	@Query(value="Select*from Vehicle order by vprice Desc", nativeQuery = true)
	List<Vehicle> findAllSortedPrice();
	
	@Query(value="select*from vehicle order by vprice desc,vcolour Asc",nativeQuery = true)
	List<Vehicle> findAllSortedPriceColour();
	
	@Query(value = "select*from vehicle where vprice>=1000000",nativeQuery=true)
	List<Vehicle> findVehicleAboveLakh();
}

























