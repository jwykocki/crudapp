package com.example.springboot.crudapp.dao;

import com.example.springboot.crudapp.entity.Employee;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO{

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }
    @Override
    public List<Employee> findAll() {

        TypedQuery<Employee> theQuery =
                entityManager.createQuery("from Employee", Employee.class);

        List<Employee> employees = theQuery.getResultList();
        return employees;
    }
}
