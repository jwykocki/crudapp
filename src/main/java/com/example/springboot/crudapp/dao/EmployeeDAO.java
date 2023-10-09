package com.example.springboot.crudapp.dao;

import com.example.springboot.crudapp.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
