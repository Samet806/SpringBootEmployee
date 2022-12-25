package com.project.employeeCrud.service;

import com.project.employeeCrud.entity.Department;

import java.util.List;

public interface IDepartentService {
    List<Department> getAllListOfDepartment();

    public Department getDepartmentByID(Integer ID);

    public void addTheDepartment(Department dept);

    public void updateTheDepartment(Department dept, Integer ID);

    public void deleteAllDepartments();

    public void deleteDepartmenByID(Integer id);
}
