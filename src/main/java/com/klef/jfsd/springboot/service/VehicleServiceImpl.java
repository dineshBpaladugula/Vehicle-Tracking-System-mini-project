package com.klef.jfsd.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Vehicle;
import com.klef.jfsd.springboot.repository.VehicleRepository;
@Service
public class VehicleServiceImpl implements VehicleService
{
	@Autowired
	private VehicleRepository  vehicleRepository;

	@Override
	public Vehicle addvehicle(Vehicle v) {
		
		return vehicleRepository.save(v);
	}

	

	
}
