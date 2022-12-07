package com.spring.rest.dto.employee;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateEmployeeReqDto {
	
	@NotNull
	private Long employeeId;
	
	@Size(max=65)
	private String name;
	
	@Size(max=65)
	private String mobile;
	
	@Size(max=60)
	@Email
	private String email;
	
	@Size(max=10)
	private String gender;
	
	@DateTimeFormat
	private String dob;
	
	private Date updatedDate;
}
