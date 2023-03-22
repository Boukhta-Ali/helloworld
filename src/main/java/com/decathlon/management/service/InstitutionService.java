package com.decathlon.management.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.decathlon.management.dto.InstitutionDto;
import com.decathlon.management.entity.Institution;
import com.decathlon.management.repository.InsRepository;

@Service
public class InstitutionService {

	@Autowired
	private InsRepository insRepository;

	public InstitutionDto saveInstitution(String insId, String insName) {
		insRepository.save(new Institution().withInsId(insId).withInsName(insName));
		return new InstitutionDto().withInstitutionId(insId).withInstitutionName(insName);
	}
}
