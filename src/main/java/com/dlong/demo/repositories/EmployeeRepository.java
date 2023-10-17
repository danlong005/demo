package com.dlong.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dlong.demo.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {}
