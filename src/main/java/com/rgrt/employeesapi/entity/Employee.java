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
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee", schema = "employees")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "birth_date", nullable = false)
	private LocalDate birthDate;
	
	@Column(name = "first_name", nullable = false)
	private String firstName;
	
	@Column(name = "last_name", nullable = false)
	private String lastName;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "gender", nullable = false)
	private Gender gender;

	@Column(name = "hire_date")
	private LocalDate hireDate;
	
//	@OneToMany(mappedBy = "employee")
//	private List<Salary> salaries;
//	
//	@OneToMany(mappedBy = "employee")
//	private List<Title> titles;

}
