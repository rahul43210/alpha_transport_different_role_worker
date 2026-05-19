package com.transport.employee.worker.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.transport.employee.worker.model.Employee;
import com.transport.employee.worker.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Repository
@Transactional(rollbackOn = Exception.class)
public class EmployeeDao{ 
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public List<Employee> getAllEmployees(){
		final List<Employee> allEmployees = employeeRepository.findAll();
		return allEmployees;
	}


	public Employee getEmployeeById(Long id) {
		
		return employeeRepository.findById(id).orElse(null);
	}


	public Employee getEmployeeByName(String name) {
		return employeeRepository.findByName(name).orElse(null);
	}

	public List<Employee> createEmployee(List<Employee> employeeDto) {
		return employeeRepository.saveAll(employeeDto);
	}


	public Employee getEmployeeById(Integer id) {
		return employeeRepository.findById(id.longValue()).orElse(null);
	}


	public List<Employee> findListOfEmployeesByDepoId(String depoId) {
		return employeeRepository.findAllByDepoId(depoId);
	}
}
