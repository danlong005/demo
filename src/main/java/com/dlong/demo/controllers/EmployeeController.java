package com.dlong.demo.controllers;

import java.util.HashMap;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.dlong.demo.models.Employee;
import com.dlong.demo.repositories.EmployeeRepository;
import com.dlong.demo.utilities.LayoutModelAndView;

@Controller
public class EmployeeController {
    private final EmployeeRepository employeeRepository;
    
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/v1/employees")
    public ModelAndView getEmployeesPage() {
        HashMap<String, Object> model = new HashMap<>();
        List<Employee> employees = employeeRepository.findAll();
        model.put("employees", employees);
   
        return LayoutModelAndView.create("employees/index", model);
    }

    @GetMapping("/v1/employees/{id}")
    public ModelAndView getEmployee(@PathVariable Long id) {
        HashMap<String, Object> model = new HashMap<>();
        Employee employee = employeeRepository.findById(id).get();
        model.put("employee", employee);

        return LayoutModelAndView.create("employees/show", model);
    }

    @GetMapping("/v1/employees/new")
    public ModelAndView newEmployee() {
        HashMap<String, Object> model = new HashMap<>();

        return LayoutModelAndView.create("employees/new", model);
    }

    @PostMapping(value="/v1/employees/create", consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ModelAndView createNewEmployee(@RequestBody String body) {
        System.out.println("Created an employee. " + body);

        return LayoutModelAndView.redirect("redirect:/v1/employees");
    }

    @PostMapping(value="/v1/employees/delete", consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ModelAndView deleteEmployee(@RequestBody String body) {
        System.out.println("Deleted an employee. " + body);

        return LayoutModelAndView.redirect("redirect:/v1/employees");
    }
}
