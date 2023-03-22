package com.decathlon.management.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.With;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Data
@With
public class InstitutionDto {
	private String institutionId;
	private String institutionName;
}
