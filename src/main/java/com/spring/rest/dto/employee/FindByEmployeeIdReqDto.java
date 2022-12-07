package com.spring.rest.dto.employee;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FindByEmployeeIdReqDto {
	
	@NotNull
	private Long employeeId;

}
