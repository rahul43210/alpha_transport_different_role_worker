package com.transport.employee.worker.service;

import java.util.List;

import com.transport.employee.worker.dto.EmployeeDto;
import com.transport.employee.worker.model.Employee;

public interface EmployeeService {

	List<EmployeeDto> getAllEmployees();

	EmployeeDto getEmployeeById(Long id);

	EmployeeDto getEmployeeByName(String name);

	List<EmployeeDto> createEmployee(List<EmployeeDto> employeeDto);

}
