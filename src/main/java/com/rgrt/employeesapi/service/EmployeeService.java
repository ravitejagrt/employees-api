package com.rgrt.employeesapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.rgrt.employeesapi.entity.Employee;
import com.rgrt.employeesapi.repository.EmployeeRepository;

import lombok.RequiredArgsConstructor;

@Service
public class EmployeeService {
	
	private EmployeeRepository employeeRepository;
	
	public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
	
	public Optional<Employee> getEmployeeById(Long id) {
		return employeeRepository.findById(id);
	}
	
	public List<Employee> getEmployeesByFirstName(String firstName) {
		return employeeRepository.findByFirstName(firstName);
	}

}
