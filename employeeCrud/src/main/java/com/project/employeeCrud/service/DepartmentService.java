package com.project.employeeCrud.service;

import com.project.employeeCrud.entity.Department;
import com.project.employeeCrud.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class DepartmentService implements IDepartentService {
    @Autowired
    private DepartmentRepository deptRepo;
    @Override
    public List<Department> getAllListOfDepartment() {
        // TODO Auto-generated method stub
        List<Department> getAllDepartment = deptRepo.findAll();
        return getAllDepartment;
    }

    @Override
    public Department getDepartmentByID(Integer ID) {
        return deptRepo.getOne(ID);
    }

    @Override
    public void addTheDepartment(Department dept) {
        deptRepo.save(dept);

    }

    @Override
    public void updateTheDepartment(Department dept, Integer ID) {
        if(ID == dept.getDeptID()) {

            deptRepo.save(dept);
        }

    }

    @Override
    public void deleteAllDepartments() {
        deptRepo.deleteAll();
    }

    @Override
    public void deleteDepartmenByID(Integer id) {
        // TODO Auto-generated method stub
        deptRepo.deleteById(id);
    }
}
