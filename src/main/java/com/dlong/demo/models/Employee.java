package com.dlong.demo.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name="employees")
public class Employee {
    @Id
    @Column(name="id")
    private Long id;

    @Column(name="first_name")
    private String firstName;
    
    @Column(name="last_name")
    private String lastName;

    @Column(name="hired_at")
    private LocalDateTime hiredAt;

    @Column(name="salary")
    private Double salary;

    @Column(name="date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name="created_at")
    private LocalDateTime createdAt;

    @Column(name="updated_at")
    private LocalDateTime updatedAt;
}
