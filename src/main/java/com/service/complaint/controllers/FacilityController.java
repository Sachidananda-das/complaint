package com.service.complaint.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.complaint.models.Facility;
import com.service.complaint.services.FacilityService;


@RestController
public class FacilityController {
	
	@Autowired
	FacilityService facilityService;
	
	
	@GetMapping("/getAllFacilities")
	public List<Facility> getAllFacilities() {
		
		return facilityService.getAllFacilities();
		
	}
	
	@PostMapping("/addFacility")
	public Facility addFacility(@RequestBody Facility facility) {
	
		return facilityService.addFacility(facility);
		
	}

	@PutMapping("/updateFacility")
	public Facility updateFacility(@RequestBody Facility facility) {
		return facilityService.updateFacility(facility);
	}
	
	@DeleteMapping("/deleteFacility")
	public String deleteFacility(@RequestParam String id) {
		
		return facilityService.deleteFacility(id);
		
	}
}
