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
		return allEmployees.stream().map(e -> new EmployeeDto(e)).collect(Collectors.toList());
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
		if (employeeDto == null || employeeDto.isEmpty()) {
			return null;
		}
		final List<Employee> createdEmployees = employeeDao
				.createEmployee(employeeDto.stream().map(e -> new Employee(e)).collect(Collectors.toList()));
		return createdEmployees.stream().map(e -> new EmployeeDto(e)).collect(Collectors.toList());
	}

	@Override
	public List<EmployeeDto> updateEmployees(List<EmployeeDto> employeeDto) {
		List<Employee> updatedEmployees = employeeDto.stream().map(e -> updateEmployee(e)).collect(Collectors.toList());
		updatedEmployees = employeeDao.createEmployee(updatedEmployees);
		return updatedEmployees.stream().map(e -> new EmployeeDto(e)).collect(Collectors.toList());
	}

	private Employee updateEmployee(EmployeeDto employee) {
		final Employee employeeUpdate = employeeDao.getEmployeeById(employee.getId());

		if (employee.getName() != null) {
			employeeUpdate.setName(employee.getName());
		}
		if (employee.getDesignation() != null) {
			employeeUpdate.setDesignation(employee.getDesignation());
		}
		if (employee.getMobileNumber() != null) {
			employeeUpdate.setMobileNumber(employee.getMobileNumber());
		}
		if (employee.getEmail() != null) {
			employeeUpdate.setEmail(employee.getEmail());
		}
		if (employee.getPersonalEmail() != null) {
			employeeUpdate.setPersonalEmail(employee.getPersonalEmail());
		}
		if (employee.getOfficeTelephone() != null) {
			employeeUpdate.setOfficeTelephone(employee.getOfficeTelephone());
		}
		if (employee.getDeployLocation() != null) {
			employeeUpdate.setDeployLocation(employee.getDeployLocation());
		}
		if (employee.getEmployeeCode() != null) {
			employeeUpdate.setEmployeeCode(employee.getEmployeeCode());
		}
		if (employee.getDateOfJoining() != null) {
			employeeUpdate.setDateOfJoining(employee.getDateOfJoining());
		}
		if (employee.getDateOfBirth() != null) {
			employeeUpdate.setDateOfBirth(employee.getDateOfBirth());
		}
		if (employee.getAadharNumber() != null) {
			employeeUpdate.setAadharNumber(employee.getAadharNumber());
		}
		if (employee.getPanNumber() != null) {
			employeeUpdate.setPanNumber(employee.getPanNumber());
		}

		employeeUpdate.setActive(employee.isActive());

		employeeUpdate.setDeleted(employee.isDeleted());

		if (employee.getCreatedAt() != null) {
			employeeUpdate.setCreatedAt(employee.getCreatedAt());
		}
		if (employee.getUniqueId() != null) {
			employeeUpdate.setUniqueId(employee.getUniqueId());
		}
		if (employee.getDepoId() != null) {
			employeeUpdate.setDepoId(employee.getDepoId());
		}

		return employeeUpdate;
	}

	@Override
	public List<EmployeeDto> findListOfEmployeesByDepoId(String depoId) {
		final List<Employee> listOfEmployeesByDepoId = employeeDao.findListOfEmployeesByDepoId(depoId);
		return listOfEmployeesByDepoId.stream().map(e -> new EmployeeDto(e)).collect(Collectors.toList());
	}

}
