package com.rgrt.employeesapi.entity;

import java.time.LocalDate;

import jakarta.persistence.Embeddable;

@Embeddable
public class SalaryId {
	
	private Long employeeId;
	private LocalDate fromDate;

}
