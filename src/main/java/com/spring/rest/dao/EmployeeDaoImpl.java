package com.spring.rest.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.spring.rest.custommapper.employee.EmployeeCustomMapper;
import com.spring.rest.dto.employee.CreateEmployeeReqDto;
import com.spring.rest.dto.employee.EmployeeDto;
import com.spring.rest.dto.employee.UpdateEmployeeReqDto;

@Repository
@Transactional(propagation = Propagation.REQUIRED)
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	private EmployeeCustomMapper employeeCustomMapper;

	@Override
	public EmployeeDto findByEmployeeId(Long employeeId) {
		return employeeCustomMapper.findByEmployeeId(employeeId);
	}
	
	@Override
	public List<EmployeeDto> findAllEmployee() {
		return employeeCustomMapper.findAllEmployee();
	}
	
	@Override
	public Long createEmployee(CreateEmployeeReqDto createEmployeeDtoReq) {
		return employeeCustomMapper.createEmployee(createEmployeeDtoReq);
	}
	
	@Override
	public void deleteEmployee(Long employeeId) {
		employeeCustomMapper.deleteEmployee(employeeId);
	}
	
	@Override
	public void updateEmployee(UpdateEmployeeReqDto updateEmployeeReqDto) {
		employeeCustomMapper.updateEmployee(updateEmployeeReqDto);
	}
	
}
