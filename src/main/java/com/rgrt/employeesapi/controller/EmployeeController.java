package com.rgrt.employeesapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rgrt.employeesapi.entity.Employee;
import com.rgrt.employeesapi.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin(origins = {
		"https://ravitejagrt.github.io"		
})
@Slf4j
public class EmployeeController {
	
	private EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
	
	@GetMapping("/ping")
	public String ping() {
	    System.out.println("Ping endpoint hit!");
	    return "pong";
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
		return employeeService.getEmployeeById(id)
				.map(employee -> {
//					log.info("Fetched employee: id={}, name={} {} , gender={}, hireDate={}",
//                            employee.getId(),
//                            employee.getFirstName(),
//                            employee.getLastName(),
//                            employee.getGender(),
//                            employee.getHireDate());
					System.out.println("Fetched employee: " +
	                        "id=" + employee.getId() +
	                        ", firstName=" + employee.getFirstName() +
	                        ", lastName=" + employee.getLastName() +
	                        ", gender=" + employee.getGender() +
	                        ", hireDate=" + employee.getHireDate());
					return ResponseEntity.ok(employee);
				})
				.orElse(ResponseEntity.notFound().build());
	}

}
