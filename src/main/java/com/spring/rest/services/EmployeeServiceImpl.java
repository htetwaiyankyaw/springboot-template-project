package com.spring.rest.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.spring.rest.dao.EmployeeDao;
import com.spring.rest.dto.employee.CreateEmployeeReqDto;
import com.spring.rest.dto.employee.EmployeeDto;
import com.spring.rest.dto.employee.UpdateEmployeeReqDto;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao employeeDao;

	public EmployeeDto findByEmployeeId(Long employeeId) {
		return employeeDao.findByEmployeeId(employeeId);
	}
	
	public List<EmployeeDto> findAllEmployee() {
		return employeeDao.findAllEmployee();
	}
	
	public CreateEmployeeReqDto createEmployee(CreateEmployeeReqDto createEmployeeDtoReq) {
		createEmployeeDtoReq.setCreatedDate(new Date());
		employeeDao.createEmployee(createEmployeeDtoReq);
		return createEmployeeDtoReq;
	}
	
	public void deleteEmployee(Long employeeId) {
		employeeDao.deleteEmployee(employeeId);
	}
	
	public UpdateEmployeeReqDto updateEmployee(UpdateEmployeeReqDto updateEmployeeReqDto) {
		updateEmployeeReqDto.setUpdatedDate(new Date());
		employeeDao.updateEmployee(updateEmployeeReqDto);
		return updateEmployeeReqDto;
	}
}
