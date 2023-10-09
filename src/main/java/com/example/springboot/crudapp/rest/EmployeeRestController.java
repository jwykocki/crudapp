package com.example.springboot.crudapp.rest;

import com.example.springboot.crudapp.dao.EmployeeDAO;
import com.example.springboot.crudapp.entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;

    public EmployeeRestController(EmployeeDAO theEmployeeDAO) {
        employeeDAO = theEmployeeDAO;
    }

    @GetMapping("/api/employees")
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
