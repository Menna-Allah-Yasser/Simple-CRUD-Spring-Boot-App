package com.example.facebook.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.facebook.entity.Location;
import com.example.facebook.service.LocationService;

@RestController
public class LocationController {

	@Autowired
	private LocationService locationService;

	@GetMapping("/locations")
	public List<Location> getAllLocations() {
		return locationService.findAll();
	}

	@GetMapping("/locations/{id}")
	public Optional<Location> getLocationById(@PathVariable Long id) {
		return locationService.findById(id);
	}

	@PostMapping("/location/add")
	public void addLocation(Location location) {
		locationService.addLocation(location);
	}

	@PutMapping("/location/update")
	public Location updateLocation(Location newLocation) {
		return locationService.updateLocation(newLocation);
	}
}
