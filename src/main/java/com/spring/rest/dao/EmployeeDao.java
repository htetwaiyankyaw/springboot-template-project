package com.spring.rest.dao;

import java.util.List;

import com.spring.rest.dto.employee.CreateEmployeeReqDto;
import com.spring.rest.dto.employee.EmployeeDto;
import com.spring.rest.dto.employee.UpdateEmployeeReqDto;

public interface EmployeeDao {
	
	EmployeeDto findByEmployeeId(Long employeeId);
	
	List<EmployeeDto> findAllEmployee();
	
	Long createEmployee(CreateEmployeeReqDto createEmployeeDtoReq);
	
	void deleteEmployee(Long employeeId);
	
	void updateEmployee(UpdateEmployeeReqDto updateEmployeeReqDto);

}
