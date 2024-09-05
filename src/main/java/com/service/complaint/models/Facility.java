package com.service.complaint.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("Facilities")
public class Facility{
	
	@Id
	private String id;
	
	private String serId;
	
	private String serName;
	
	private Double price;
	
	private String serCategory;
	
	
}
