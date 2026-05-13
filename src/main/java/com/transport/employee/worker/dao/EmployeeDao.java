package com.transport.employee.worker.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.transport.employee.worker.model.Employee;
import com.transport.employee.worker.repository.EmployeeRepository;

@Repository
public class EmployeeDao {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public List<Employee> getAllEmployees(){
		final List<Employee> allEmployees = employeeRepository.findAll();
		return allEmployees;
	}
}
