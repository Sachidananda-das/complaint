package com.service.complaint.services;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

import java.util.List;

import org.springframework.stereotype.Service;

import com.service.complaint.models.Facility;

@Service
public class FacilityService extends CommonService {

	public Facility addFacility(Facility facility) {
		
		facility.setSerId(generateSequence("Facility_Seq").toString());
		return mongoTemplate.save(facility);
	}

	public List<Facility> getAllFacilities() {
		
		return mongoTemplate.findAll(Facility.class);
	}

	public Facility updateFacility(Facility facility) {
		
		return mongoTemplate.save(facility);
	}

	public String deleteFacility(String id) {
		mongoTemplate.findAndRemove(query(where("serId").is(id)), Facility.class);
		return "Deleted";
	}
	
	

}
