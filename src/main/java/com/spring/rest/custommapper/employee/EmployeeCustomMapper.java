package com.spring.rest.custommapper.employee;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.spring.rest.dto.employee.CreateEmployeeReqDto;
import com.spring.rest.dto.employee.EmployeeDto;
import com.spring.rest.dto.employee.UpdateEmployeeReqDto;

@Mapper
public interface EmployeeCustomMapper {
	
	public EmployeeDto findByEmployeeId(Long employeeId);
	
	public List<EmployeeDto> findAllEmployee();
	
	public Long createEmployee(@Param("dto") CreateEmployeeReqDto createEmployeeDtoReq);
	
	public void deleteEmployee(Long employeeId);
	
	public void updateEmployee(UpdateEmployeeReqDto updateEmployeeReqDto);
}
