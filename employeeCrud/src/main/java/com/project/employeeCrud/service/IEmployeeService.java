package com.project.employeeCrud.service;

import com.project.employeeCrud.entity.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> getAllListOfEmployees();

    public Employee getEmployeeByID(Integer ID);

    public void addTheEmployee(Employee emp);

    public void updateTheEmployee(Employee emp, Integer ID);

    public void deleteAllEmployee();

    public void deleteEmployeeByID(Integer id);
}
