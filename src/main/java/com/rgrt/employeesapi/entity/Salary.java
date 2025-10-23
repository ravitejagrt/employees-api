package com.rgrt.employeesapi.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "salary", schema = "employees")
public class Salary {
	
	@EmbeddedId
	private SalaryId id;
	
	@ManyToOne
	@MapsId("employeeId")
	@JoinColumn(name = "employee_id")
	private Employee employee;

	private Long amount;
}
