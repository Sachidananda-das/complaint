package com.service.complaint.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("MetaData")
public class SequenceNumber {
	
	@Id
	private String id;
	
	private String seqName;
	private Long seqNum;
	

}
