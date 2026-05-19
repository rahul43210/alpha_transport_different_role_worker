package com.transport.employee.worker.model;

import java.time.LocalDate;

import com.transport.employee.worker.dto.EmployeeDto;
import com.transport.employee.worker.utility.AppUtility;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, unique = true)
	private Integer id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "designation")
	private String designation;
	
	@Column(name = "mobileNumber")
	private String mobileNumber;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "personalEmail")
	private String personalEmail;
	
	@Column(name = "officeTelephone")
	private String officeTelephone;
	
	@Column(name = "deployLocation")
	private String deployLocation;
	
	@Column(name = "employeeCode", unique = true)
	private String employeeCode;
	
	@Column(name = "dateOfJoining")
	private LocalDate dateOfJoining;
	
	@Column(name = "dateOfBirth")
	private LocalDate dateOfBirth;
	
	@Column(name = "aadharNumber", unique = true)
	private String aadharNumber;
	
	@Column(name = "panNumber", unique = true)
	private String panNumber;
	
	@Column(name = "isActive", columnDefinition = "BOOLEAN DEFAULT TRUE")
	private boolean isActive;
	
	@Column(name = "uniqueId", nullable = false, columnDefinition = "VARCHAR(255) DEFAULT 'UNIQUE_ID'")
	public String uniqueId;
	
	@Column(name = "isDeleted", columnDefinition = "BOOLEAN DEFAULT FALSE")
	private boolean isDeleted;
	
	@Column(name = "createdAt")
	private LocalDate createdAt;
	
	@Column(name = "depoId", unique = true, nullable = false)
	private String depoId;

	public Employee() {
		super();
	}

	public Employee(EmployeeDto employee) {
		
		super();
		if(employee.getId() != null) {
			this.id = employee.getId();
		}
		
		if(employee.getName() != null) 
		this.name = employee.getName();
		
		if(employee.getDesignation() != null) 
		this.designation = employee.getDesignation();
		
		if(employee.getMobileNumber() != null) 
		this.mobileNumber = employee.getMobileNumber();
		
		if(employee.getEmail() != null) 
		this.email = employee.getEmail();
		
		if(employee.getPersonalEmail() != null) 
		this.personalEmail = employee.getPersonalEmail();
		
		if(employee.getOfficeTelephone() != null)
		this.officeTelephone = employee.getOfficeTelephone();
		
		if(employee.getDeployLocation() != null)
		this.deployLocation = employee.getDeployLocation();
		
		if(employee.getEmployeeCode() != null)
		this.employeeCode = employee.getEmployeeCode();
		
		if(employee.getDateOfJoining() != null)
		this.dateOfJoining = employee.getDateOfJoining();
		
		if(employee.getDateOfBirth() != null)
		this.dateOfBirth = employee.getDateOfBirth();
		
		if(employee.getAadharNumber() != null)
		this.aadharNumber = employee.getAadharNumber();
		
		if(employee.getPanNumber() != null)
		this.panNumber = employee.getPanNumber();
		 
		this.isActive = employee.isActive();
		this.isDeleted = employee.isDeleted();
		
		if(employee.getCreatedAt() != null)
		this.createdAt = employee.getCreatedAt();
	
		if(employee.getUniqueId() != null) {
			this.uniqueId = employee.getUniqueId();
		}else {
			this.uniqueId = AppUtility.uniqueId();
		}
		
		this.depoId = employee.getDepoId();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPersonalEmail() {
		return personalEmail;
	}

	public void setPersonalEmail(String personalEmail) {
		this.personalEmail = personalEmail;
	}

	public String getOfficeTelephone() {
		return officeTelephone;
	}

	public void setOfficeTelephone(String officeTelephone) {
		this.officeTelephone = officeTelephone;
	}

	public String getDeployLocation() {
		return deployLocation;
	}

	public void setDeployLocation(String deployLocation) {
		this.deployLocation = deployLocation;
	}

	public String getEmployeeCode() {
		return employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		this.createdAt = createdAt;
	}

	public String getDepoId() {
		return depoId;
	}

	public void setDepoId(String depoId) {
		this.depoId = depoId;
	}
	
	
	
}
