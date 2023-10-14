package com.dlong.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dlong.demo.models.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {}
