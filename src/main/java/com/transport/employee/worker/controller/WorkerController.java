package com.transport.employee.worker.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.transport.employee.worker.dto.AppResponseMessageDto;
import com.transport.employee.worker.dto.EmployeeDto;
import com.transport.employee.worker.model.Employee;
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
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.FOUND)
	public AppResponseMessageDto<?> employeeById(@PathVariable Long id){
		final EmployeeDto employeeById = employeeService.getEmployeeById(id);
		if(employeeById == null) {
			return new AppResponseMessageDto<>(HttpStatus.NOT_FOUND.value(), "No employee found with id: "+id, null);
		}else {
			return new AppResponseMessageDto<EmployeeDto>(HttpStatus.FOUND.value(), "Employee with id: "+id, employeeById);
		}
	}
	
	@GetMapping("/name/{name}")
	@ResponseStatus(HttpStatus.FOUND)
	public AppResponseMessageDto<?> employeeByName(@PathVariable String name){
		final EmployeeDto employeeByName = employeeService.getEmployeeByName(name);
		if(employeeByName == null) {
			return new AppResponseMessageDto<>(HttpStatus.NOT_FOUND.value(), "No employee found with name: "+name, null);
		}else {
			return new AppResponseMessageDto<EmployeeDto>(HttpStatus.FOUND.value(), "Employee with name: "+name, employeeByName);
		}
	}
 
	
	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	public AppResponseMessageDto<?> createEmployee(@RequestBody List<EmployeeDto> employeeDto){
		final List<EmployeeDto> createEmployees = employeeService.createEmployee(employeeDto);
		if(createEmployees == null) {
			return new AppResponseMessageDto<>(HttpStatus.BAD_REQUEST.value(), "Failed to create employee", null);
		}else {
			return new AppResponseMessageDto<List<EmployeeDto>>(HttpStatus.CREATED.value(), "Employee created successfully", createEmployees);
		}
	}
	
	
}
