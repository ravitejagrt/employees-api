package com.rgrt.employeesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rgrt.employeesapi.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
