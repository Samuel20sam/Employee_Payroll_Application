package com.bridgelabz.payroll.model;

import com.bridgelabz.payroll.DTO.EmployeePayrollDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Employee_payroll")
@NoArgsConstructor

public class EmployeePayrollData {
    @Id
    @GeneratedValue
    @Column(name = "emp_Id")

    private int employeeID;
    private String name;
    private Long salary;

    public EmployeePayrollData(int employeeID, EmployeePayrollDTO employeePayrollDTO) {
        this.employeeID = employeeID;
        this.name = employeePayrollDTO.name;
        this.salary = employeePayrollDTO.salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}
