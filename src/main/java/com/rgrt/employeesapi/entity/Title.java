package com.rgrt.employeesapi.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "title", schema = "employees")
@IdClass(TitleId.class)
public class Title {

    @Id
    @Column(name = "employee_id")
    private Long employeeId;

    @Id
    private String title;

    @Id
    @Column(name = "from_date")
    private LocalDate fromDate;

    @Column(name = "to_date")
    private LocalDate toDate;

    @ManyToOne
    @JoinColumn(name = "employee_id", insertable = false, updatable = false)
    private Employee employee;

    // Getters and setters
}
