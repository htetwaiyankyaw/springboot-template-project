package com.spring.rest.services;

import java.util.List;

import com.spring.rest.dto.employee.CreateEmployeeReqDto;
import com.spring.rest.dto.employee.EmployeeDto;
import com.spring.rest.dto.employee.UpdateEmployeeReqDto;

public interface EmployeeService {
	
	EmployeeDto findByEmployeeId(Long employeeId);
	
	List<EmployeeDto> findAllEmployee();
	
	CreateEmployeeReqDto createEmployee(CreateEmployeeReqDto createEmployeeDtoReq);
	
	void deleteEmployee(Long employeeId);
	
	UpdateEmployeeReqDto updateEmployee(UpdateEmployeeReqDto updateEmployeeReqDto);

}
