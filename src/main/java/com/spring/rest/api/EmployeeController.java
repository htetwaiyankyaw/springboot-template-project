package com.spring.rest.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.dto.employee.CreateEmployeeReqDto;
import com.spring.rest.dto.employee.DeleteEmployeeReqDto;
import com.spring.rest.dto.employee.EmployeeDto;
import com.spring.rest.dto.employee.FindByEmployeeIdReqDto;
import com.spring.rest.dto.employee.UpdateEmployeeReqDto;
import com.spring.rest.services.EmployeeService;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;

@RestController
@RequestMapping("/employee")
@SecurityRequirement(name = "javainuseapi")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/find-by-employee-id", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = "application/json; charset=utf-8")
	public EmployeeDto findByEmployeeId(@RequestBody FindByEmployeeIdReqDto reqDto) {
		return employeeService.findByEmployeeId(reqDto.getEmployeeId());
	}
	
	@RequestMapping(value = "/find-all-employee", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
	public List<EmployeeDto> findAllEmployee() {
		return employeeService.findAllEmployee();
	}

	@RequestMapping(value = "/create-employee", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = "application/json; charset=utf-8")
	public CreateEmployeeReqDto createEmployee(@Valid @RequestBody CreateEmployeeReqDto reqDto) {
		return employeeService.createEmployee(reqDto);
	}
	
	@RequestMapping(value = "/delete-employee", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
	public void deleteEmployee(@Valid @RequestBody DeleteEmployeeReqDto reqDto) {
		employeeService.deleteEmployee(reqDto.getEmployeeId());
	}
	
	@RequestMapping(value = "/update-employee", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = "application/json; charset=utf-8")
	public UpdateEmployeeReqDto updateEmployee(@Valid @RequestBody UpdateEmployeeReqDto reqDto) {
		return employeeService.updateEmployee(reqDto);
	}
	
}
