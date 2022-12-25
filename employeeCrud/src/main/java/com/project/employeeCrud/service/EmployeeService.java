package com.project.employeeCrud.service;

import com.project.employeeCrud.entity.Employee;
import com.project.employeeCrud.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService implements IEmployeeService{
    @Autowired
    private EmployeeRepository empRepository;
    @Override
    public List<Employee> getAllListOfEmployees() {
        List<Employee> empAll = empRepository.findAll();

        return empAll;
    }

    @Override
    public Employee getEmployeeByID(Integer ID) {
        return empRepository.getById(ID);
    }

    @Override
    public void addTheEmployee(Employee emp) {
        empRepository.save(emp);

    }

    @Override
    public void updateTheEmployee(Employee emp, Integer ID) {
        if(ID == emp.getEmployeeID()) {

            empRepository.save(emp);
        }

    }

    @Override
    public void deleteAllEmployee() {
        empRepository.deleteAll();

    }

    @Override
    public void deleteEmployeeByID(Integer id) {
        empRepository.deleteById(id);
    }
}
