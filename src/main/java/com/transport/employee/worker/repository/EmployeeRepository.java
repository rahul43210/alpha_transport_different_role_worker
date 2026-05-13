package com.transport.employee.worker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transport.employee.worker.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	
}
