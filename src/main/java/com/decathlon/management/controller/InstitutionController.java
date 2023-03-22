package com.decathlon.management.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.decathlon.management.dto.InstitutionDto;
import com.decathlon.management.service.InstitutionService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/institution")
@RequiredArgsConstructor
public class InstitutionController {

	private final InstitutionService institutionService;

	@PostMapping
	public ResponseEntity<InstitutionDto> createInstitution() {
		return new ResponseEntity<>(institutionService.saveInstitution("123", "1313"), HttpStatus.CREATED);
	}
}
