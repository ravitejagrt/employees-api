package com.rgrt.employeesapi.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "birth_date")
	private LocalDate birthDate;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@Column(name = "hire_date")
	private LocalDate hireDate;
	
	@OneToMany(mappedBy = "employee")
	private List<Salary> salaries;
	
	@OneToMany(mappedBy = "employee")
	private List<Title> titles;

}
