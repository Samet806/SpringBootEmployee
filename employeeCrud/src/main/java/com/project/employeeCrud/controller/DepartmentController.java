package com.project.employeeCrud.controller;
import com.project.employeeCrud.entity.Department;
import com.project.employeeCrud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class DepartmentController {
    @Autowired
    private DepartmentService deptImpl;

    @GetMapping("/Departments")
    public List<Department> getAllDepartments(){

        return deptImpl.getAllListOfDepartment();
    }
    @GetMapping("/Departments/{id}")
    public Department getDepartmentUsingId(@PathVariable Integer id)  {

        return deptImpl.getDepartmentByID(id);
    }
    @PostMapping("/Departments")
    public void addDepartment(@RequestBody Department dept){
        deptImpl.addTheDepartment(dept);
    }
    @PutMapping("/Departments/{id}")
    public void updateDepartment(@RequestBody Department dept, @PathVariable Integer id) {
        deptImpl.updateTheDepartment(dept, id);
    }
    @DeleteMapping("Departments/{id}")
    public void deleteDepartmentByID(@RequestBody Department dept, @PathVariable Integer id) {
        deptImpl.deleteDepartmenByID(id);
    }
    @DeleteMapping("/Departments")
    public void deleteAllDepartments(){

        deptImpl.deleteAllDepartments();
    }

}
