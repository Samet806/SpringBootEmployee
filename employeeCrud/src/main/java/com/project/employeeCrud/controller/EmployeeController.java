package com.project.employeeCrud.controller;

import com.project.employeeCrud.entity.Employee;
import com.project.employeeCrud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    @Autowired
    private EmployeeService empImpl;

    @GetMapping("/Employees")
    public List<Employee> getAllEmployee(){

        return empImpl.getAllListOfEmployees();
    }


    @GetMapping("/Employees/{id}")
    public Employee getEmployeeBYID(@PathVariable Integer id) {

        return empImpl.getEmployeeByID(id);
    }

    @PostMapping("/Employees")
    public void addEmployee(@RequestBody Employee emp){
        empImpl.addTheEmployee(emp);
    }

    @PutMapping("/Employees/{id}")
    public void updateTheEmployees(@RequestBody Employee emp, @PathVariable Integer id) {

        empImpl.updateTheEmployee(emp, id);
    }

    @DeleteMapping("Employees/{id}")
    public void deleteEmployeeByID(@RequestBody Employee emp, @PathVariable Integer id) {

        empImpl.deleteEmployeeByID(id);
    }

    @DeleteMapping("/Employees")
    public void deleteAllDepartments(){

        empImpl.deleteAllEmployee();
    }

}
