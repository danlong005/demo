package com.dlong.demo.controllers;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dlong.demo.models.Employee;
import com.dlong.demo.repositories.EmployeeRepository;

@Controller
public class EmployeeController {
    private EmployeeRepository employeeRepository;
    
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/v1/employees")
    public ModelAndView getEmployeesPage() {
        HashMap<String, Object> model = new HashMap<String, Object>();
        List<Employee> employees = employeeRepository.findAll();
        model.put("employees", employees);
        return new ModelAndView("employees/index", model);
    }
}
