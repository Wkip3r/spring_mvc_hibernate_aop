package com.ivanryabov.spring.mvc_hibernate_aop.dao;

import com.ivanryabov.spring.mvc_hibernate_aop.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();

    public void addEmployee(Employee employee);

    public Employee getEmployee(int id);

    public void deleteEmployee(int id);
}
