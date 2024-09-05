package com.service.complaint.services;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.service.complaint.models.SequenceNumber;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@Service
public class CommonService {
	
	@Autowired
	MongoTemplate mongoTemplate;
	
	public Long generateSequence(String seqName) {
		
		SequenceNumber counter = mongoTemplate.findAndModify(query(where("seqName").is(seqName)),
				new Update().inc("seqNum", 1), SequenceNumber.class);
		return !Objects.isNull(counter) ? counter.getSeqNum() : 1;
	}

}
