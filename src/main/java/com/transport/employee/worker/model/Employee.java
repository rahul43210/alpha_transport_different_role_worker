package com.transport.employee.worker.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	private Integer id;
	
	private String name;
	
	private String designation;
}
