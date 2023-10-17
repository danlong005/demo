package com.dlong.demo.controllers;

import java.util.HashMap;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping("/v1/employees/{id}")
    public ModelAndView getEmployee(@PathVariable Long id) {
        HashMap<String, Object> model = new HashMap<String, Object>();
        Employee employee = employeeRepository.findById(id).get();
        model.put("employee", employee);
        return new ModelAndView("employees/show", model);
    }

    @GetMapping("/v1/employees/new")
    public ModelAndView newEmployee() {
        return new ModelAndView("employees/new");
    }

    @PostMapping(value="/v1/employees/create", consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ModelAndView createNewEmployee(@RequestBody String body) {
        System.out.println("Created an employee. " + body);

        return new ModelAndView("redirect:/v1/employees");
    }

    @PostMapping(value="/v1/employees/delete", consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ModelAndView deleteEmployee(@RequestBody String body) {
        System.out.println("Deleted an employee. " + body);

        return new ModelAndView("redirect:/v1/employees");
    }
}
