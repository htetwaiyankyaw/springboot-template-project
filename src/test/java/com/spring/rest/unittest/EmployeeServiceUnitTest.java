package com.spring.rest.unittest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentMatchers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.spring.rest.dao.EmployeeDaoImpl;
import com.spring.rest.dto.employee.CreateEmployeeReqDto;
import com.spring.rest.dto.employee.EmployeeDto;
import com.spring.rest.dto.employee.UpdateEmployeeReqDto;
import com.spring.rest.services.EmployeeServiceImpl;


@ExtendWith(MockitoExtension.class)
public class EmployeeServiceUnitTest {

	@InjectMocks
	EmployeeServiceImpl service;

	@Mock
	EmployeeDaoImpl dao;

	@Test
	public void shouldReturnAllEmployee() {
		List<EmployeeDto> list = new ArrayList<EmployeeDto>();
		
		
		EmployeeDto empOne = new EmployeeDto();
		empOne.setName("David");
		
		EmployeeDto empTwo = new EmployeeDto();
		empOne.setName("Mike");
		
		EmployeeDto empThree = new EmployeeDto();
		empOne.setName("Htet Wai Yan Kyaw");

		list.add(empOne);
		list.add(empTwo);
		list.add(empThree);

		when(dao.findAllEmployee()).thenReturn(list);

		List<EmployeeDto> empList = service.findAllEmployee();

		assertEquals(3, empList.size());
		verify(dao, times(1)).findAllEmployee();
	}
	
	@Test
    public void whenGivenId_shouldReturnEmployee_ifFound() {
        EmployeeDto employee = new EmployeeDto();
        employee.setName("David");

        when(dao.findByEmployeeId(1L)).thenReturn(employee);

        EmployeeDto expected = service.findByEmployeeId(1L);

        assertThat(expected).isSameAs(employee);
        verify(dao, times(1)).findByEmployeeId(1L);
    }
	
	@Test
    public void whenSaveEmployee_shouldReturnEmployee() {
		CreateEmployeeReqDto employee = new CreateEmployeeReqDto();
        employee.setName("Htet Wai Yan Kyaw");
        
        long employeeId = 3;

        when(dao.createEmployee(ArgumentMatchers.any(CreateEmployeeReqDto.class))).thenReturn(employeeId);

        CreateEmployeeReqDto created = service.createEmployee(employee);

        assertThat(created.getName()).isSameAs(employee.getName());
        verify(dao, times(1)).createEmployee(employee);
    }
	
	@Test
    public void whenGivenId_shouldUpdateEmployee() throws Exception {
        EmployeeDto employee = new EmployeeDto();
        employee.setEmployeeId(3L);
        employee.setName("Test Name");

        UpdateEmployeeReqDto updateReqDto = new UpdateEmployeeReqDto();
        updateReqDto.setEmployeeId(employee.getEmployeeId());
        updateReqDto.setName("Test Name Name");

        service.updateEmployee(updateReqDto);
        verify(dao).updateEmployee(updateReqDto);
    }
	
	@Test
    public void whenGivenId_shouldDeleteEmployee_ifFound(){
        EmployeeDto employee = new EmployeeDto();
        employee.setName("Test Name");
        employee.setEmployeeId(1L);

        service.deleteEmployee(employee.getEmployeeId());
        verify(dao).deleteEmployee(employee.getEmployeeId());
    }

}
