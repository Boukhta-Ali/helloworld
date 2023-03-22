package com.decathlon.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.decathlon.management.dto.InstitutionDto;

@SpringBootApplication
public class ManagementApplication {

	public static void main(String[] args) {

		InstitutionDto institutionDto = new InstitutionDto().withInstitutionId("1231");

		SpringApplication.run(ManagementApplication.class, args);
	}

}
