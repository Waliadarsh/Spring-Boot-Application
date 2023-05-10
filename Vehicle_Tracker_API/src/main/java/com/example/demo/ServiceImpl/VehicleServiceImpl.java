package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exception.ResourceNotFound;
import com.example.demo.Module.Vehicle;
import com.example.demo.Repo.VehicleRepo;
import com.example.demo.Service.VehicleService;

@Service
public class VehicleServiceImpl implements VehicleService
{
	@Autowired
	VehicleRepo repo;
	
	@Override
	public Vehicle addVehicle(Vehicle v) {
		return repo.save(v);
	}

	@Override
	public Vehicle deleteByID(Integer vid) 
	{
		Vehicle v = repo.findById(vid).orElseThrow(()->new ResourceNotFound("Vehicle", "ID", vid));
		if(v instanceof Vehicle) {
			repo.deleteById(vid);
		}
			return v;
	}

	@Override
	public List<Vehicle> getAllVehicle() {
		
		return repo.findAllvehicle();
	}

	@Override
	public Vehicle getById(Integer vid) 
	{
		return repo.findById(vid).orElseThrow(()->new ResourceNotFound("Vehicle", "ID", vid));
	}

	@Override
	public List<Vehicle> getByColour(String vcolour) {
		
		return repo.findByColour(vcolour);
	}

	@Override
	public List<Vehicle> getAllBySortedPrice() {
		return repo.findAllSortedPrice();
	}

	@Override
	public Vehicle updateBasedOnID(Vehicle v) 
	{
		Vehicle v1 = repo.findById(v.getVid()).orElse(null);
		if(v1!=null)
		{
			v1.setVname(v.getVname());
			v1.setVmodel(v.getVmodel());
			v1.setVcolour(v.getVcolour());
			v1.setVprice(v.getVprice());
			return repo.save(v1);
		}
		else
		{
			throw new ResourceNotFound("Vehicle", "ID", v.getVcolour() );
		}
	}

	@Override
	public List<Vehicle> getVehicleAboveLakh() {
		return repo.findVehicleAboveLakh();
	}

	@Override
	public List<Vehicle> getAllBySortedPriceColour() {
		return repo.findAllSortedPriceColour();
	}

}












