package com.transport.employee.worker.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.transport.employee.worker.dto.AppResponseMessageDto;
import com.transport.employee.worker.dto.EmployeeDto;
import com.transport.employee.worker.service.EmployeeService;

@RestController
@RequestMapping("/api/v1/employee")
public class WorkerController {
	
	private EmployeeService employeeService;

	public WorkerController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@GetMapping("/")
	@ResponseStatus(HttpStatus.FOUND)
	public AppResponseMessageDto<?> allEMployees(){
		final List<EmployeeDto> allEmployees = employeeService.getAllEmployees();
		if(allEmployees ==null || allEmployees.isEmpty()) {
			return new AppResponseMessageDto<>(HttpStatus.NOT_FOUND.value(), "No employee found", null);
		}else {
			return new AppResponseMessageDto<List<EmployeeDto>>(HttpStatus.FOUND.value(), "All employees", allEmployees);
		}
	}
}
