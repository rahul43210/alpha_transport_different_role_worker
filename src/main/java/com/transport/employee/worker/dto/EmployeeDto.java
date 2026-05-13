package com.transport.employee.worker.dto;

import java.time.LocalDate;

import com.transport.employee.worker.model.Employee;

import jakarta.validation.constraints.NotBlank;

public class EmployeeDto {

	private Integer id;

	@NotBlank(message = "Name is required")
	private String name;

	private String designation;

	private String mobileNumber;

	@NotBlank(message = "Email is required")
	private String email;

	private String personalEmail;

	private String officeTelephone;

	private String deployLocation;

	@NotBlank(message = "Employee code is required")
	private String employeeCode;

	private LocalDate dateOfJoining;

	private LocalDate dateOfBirth;

	@NotBlank(message = "Aadhar number is required")
	private String aadharNumber;

	@NotBlank(message = "PAN number is required")
	private String panNumber;

	private boolean isActive;

	private boolean isDeleted;

	private LocalDate createdAt;

	public EmployeeDto(Employee employee) {
		super();
		this.id = employee.getId();
		this.name = employee.getName();
		this.designation = employee.getDesignation();
		this.mobileNumber = employee.getMobileNumber();
		this.email = employee.getEmail();
		this.personalEmail = employee.getPersonalEmail();
		this.officeTelephone = employee.getOfficeTelephone();
		this.deployLocation = employee.getDeployLocation();
		this.employeeCode = employee.getEmployeeCode();
		this.dateOfJoining = employee.getDateOfJoining();
		this.dateOfBirth = employee.getDateOfBirth();
		this.aadharNumber = employee.getAadharNumber();
		this.panNumber = employee.getPanNumber();
		this.isActive = employee.isActive();
		this.isDeleted = employee.isDeleted();
		this.createdAt = employee.getCreatedAt();

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

}
