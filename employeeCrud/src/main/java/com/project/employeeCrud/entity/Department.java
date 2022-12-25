package com.project.employeeCrud.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deptID")
    private Integer deptID;

    private String deptName;

    private String deptLocation;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "",fetch = FetchType.LAZY)
    private List<Employee> employees;



}