package com.project.employeeCrud.entity;

import com.project.employeeCrud.entity.Department;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeeID;

    private String empName;

    private String empAddress;




    @ManyToOne
    @JoinColumn(name = "deptID")
    private Department empDepartment;

}

