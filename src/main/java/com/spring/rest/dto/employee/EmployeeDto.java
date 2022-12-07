package com.spring.rest.dto.employee;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
	
	private Long employeeId;
	private String name;
	private Date dob;
	private String gender;
	private String mobile;
	private String email;
	private Date createdDate;
	private Date updatedDate;
}
