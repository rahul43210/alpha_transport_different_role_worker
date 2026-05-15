package com.transport.employee.worker.serviceimpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.transport.employee.worker.dao.EmployeeDao;
import com.transport.employee.worker.dto.EmployeeDto;
import com.transport.employee.worker.model.Employee;
import com.transport.employee.worker.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public List<EmployeeDto> getAllEmployees() {
		final List<Employee> allEmployees = employeeDao.getAllEmployees();
		return allEmployees.stream().map(e-> new EmployeeDto(e)).collect(Collectors.toList());
	}

	@Override
	public EmployeeDto getEmployeeById(Long id) {
		final Employee employeeById = employeeDao.getEmployeeById(id);
		return employeeById != null ? new EmployeeDto(employeeById) : null;
	}

	@Override
	public EmployeeDto getEmployeeByName(String name) {
		final Employee employeeByName = employeeDao.getEmployeeByName(name);
		return employeeByName != null ? new EmployeeDto(employeeByName) : null;
	}

	@Override
	public List<EmployeeDto> createEmployee(List<EmployeeDto> employeeDto) {
		if(employeeDto == null || employeeDto.isEmpty()) {
			return null;
		}
		final List<Employee> createdEmployees = employeeDao.createEmployee(employeeDto.stream().map(e-> new Employee(e)).collect(Collectors.toList()));
		return createdEmployees.stream().map(e-> new EmployeeDto(e)).collect(Collectors.toList());
	}

}
