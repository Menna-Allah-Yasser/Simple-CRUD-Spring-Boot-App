package com.example.facebook.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.facebook.entity.Location;
import com.example.facebook.repository.LocationRepo;

@Service
public class LocationService {
	
	@Autowired
	private LocationRepo locationRepo; 

	public List<Location> findAll() {
		return (List<Location>) locationRepo.findAll();
	}

	public Optional<Location> findById(Long id) {
		return locationRepo.findById(id);
	}
	
	public void addLocation(Location location) {
		locationRepo.save(location);
	}
	
	public Location updateLocation(Location newLocation) {
		return locationRepo.save(newLocation);
	}

}
