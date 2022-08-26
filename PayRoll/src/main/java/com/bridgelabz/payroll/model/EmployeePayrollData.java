package com.bridgelabz.payroll.model;

import com.bridgelabz.payroll.DTO.EmployeePayrollDTO;
import lombok.*;
import java.time.LocalDate;
import java.util.List;

@Data
public class EmployeePayrollData {
    private int employeeID;
    private String name;
    private Long salary;
    private String gender;
    private LocalDate startDate;
    private String note;
    private String profilePicture;
    private List<String> departments;

    public EmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        this.employeeID = employeePayrollDTO.employeeID;
        this.name = employeePayrollDTO.name;
        this.salary = employeePayrollDTO.salary;
        this.gender = employeePayrollDTO.gender;
        this.startDate = employeePayrollDTO.startDate;
        this.note = employeePayrollDTO.note;
        this.profilePicture = employeePayrollDTO.profilePicture;
        this.departments = employeePayrollDTO.departments;
    }
}