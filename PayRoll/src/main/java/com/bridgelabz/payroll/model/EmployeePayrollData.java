package com.bridgelabz.payroll.model;

import com.bridgelabz.payroll.DTO.EmployeePayrollDTO;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
@Data
@Entity
@Table(name = "employee_payroll")
@NoArgsConstructor
public class EmployeePayrollData {

    @Id
    @GeneratedValue()
    @Column(name = "id")
    private int empID;

    @Column(name = "name")
    private String name;
    @Column(name = "Salary")
    private Long salary;
    @Column(name = "gender")
    public String gender;
    @Column(name = "Start_date")
    public LocalDate startDate;
    @Column(name = "note")
    public String note;
    @Column(name = "profile_pic")
    public String profilePicture;
    @ElementCollection
    @CollectionTable(name = "employee_department", joinColumns = @JoinColumn(name = "id"))
    @Column(name = "department")
    private List<String> departments;

    public EmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        this.name = employeePayrollDTO.name;
        this.salary = employeePayrollDTO.salary;
        this.gender = employeePayrollDTO.gender;
        this.startDate = employeePayrollDTO.startDate;
        this.note = employeePayrollDTO.note;
        this.profilePicture = employeePayrollDTO.profilePicture;
        this.departments = employeePayrollDTO.departments;
    }

    public void updateEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        this.name = employeePayrollDTO.name;
        this.salary = employeePayrollDTO.salary;
        this.gender = employeePayrollDTO.gender;
        this.startDate = employeePayrollDTO.startDate;
        this.note = employeePayrollDTO.note;
        this.profilePicture = employeePayrollDTO.profilePicture;
        this.departments = employeePayrollDTO.departments;
    }
}